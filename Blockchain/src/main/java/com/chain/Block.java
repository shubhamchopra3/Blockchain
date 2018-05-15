package com.chain;

import java.util.Date;

public class Block {
	
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	
	public Block(String data,String previousHash)
	{
		this.data=data;
		this.previousHash=previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); 
	}
	
	
	public String calculateHash()
	{
		String newhash=StringUtil.applySHA256(previousHash+data+Long.toString(timeStamp));
		return newhash;
	}
	
	

}
