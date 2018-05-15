package com.chain;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class Blockchain {

	public static Boolean isChainValid() {

		Block currentBlock;
		Block previousBlock;

		for (int i = 1; i < blockchain.size(); i++) {

			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i - 1);
			if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
				System.out.println("Current Hashes not equal");
				return false;
			}
			if (!previousBlock.hash.equals(currentBlock.previousHash)) {
				System.out.println("Previous Hashes not equal");
				return false;
			}

		}

		return true;
	}

	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	public static int difficulty = 6;

	public static void main(String[] args) {

		blockchain.add(new Block("Hi im the first block", "0"));
		System.out.println("Trying to Mine block 1... ");
		blockchain.get(0).mineBlock(difficulty);

		blockchain.add(new Block(" im the second block", blockchain.get(blockchain.size() - 1).hash));
		System.out.println("Trying to Mine block 2... ");
		blockchain.get(1).mineBlock(difficulty);

		blockchain.add(new Block(" im the third block", blockchain.get(blockchain.size() - 1).hash));
		System.out.println("Trying to Mine block 3... ");
		blockchain.get(2).mineBlock(difficulty);
		/*
		 * Gson gson = new Gson(); String blockchainJson = gson.toJson(blockchain);
		 * System.out.println(blockchainJson);
		 */

		// refer this to understand prettyPrinting
		/* https://www.mkyong.com/java/how-to-enable-pretty-print-json-output-gson/ */
		
		
		
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		

		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(blockchainJson);

	}

}
