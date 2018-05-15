# Blockchain

A blockchain is a distributed database with a list (that is, chain) of records (that is, blocks) linked and secured by digital fingerprints (that is, cryptho hashes)

A blockchain uses

* the block timestamp (e.g. 1637-09-15 20:52:38) and 
* the hash from the previous block (e.g. edbd4e11e69bc399a9ccd8faaea44fb27410fe8e3023bb9462450a0a9c4caa1b) and finally
* the block data (e.g. Transaction Data...)

![alt text](https://cdn-images-1.medium.com/max/800/1*627BG-7qMtaXNsX0n41C6Q.png)

* Calculating and comparing the hashes allow us to see if a blockchain is invalid.Changing any data in this list, will change the signature and break the chain.

* To generate a digital signature i am using SHA256 algorithm

#### To learn about SHA256 algorithm check out http://www.baeldung.com/sha-256-hashing-java

* he difficulty variables increases the time it takes to mine a block.You can vary the diffuculty variable and check for yourself.For difficulty=5 it takes around 5-6 second to mine a block.

#### If someone were to tamper 😒 with the data in your blockchain system:

* Their blockchain would be invalid.
* They would not be able to create a longer blockchain.
* Honest blockchains in your network will have a time advantage on the longest chain.

## Summary
Our Blockchain
* Is made up of blocks that store data. 
* Has a digital signature that chains your blocks together.
* Requires proof of work mining to validate new blocks.
* Can be check to see if data in it is valid and unchanged.

Output 

```json
Trying to Mine block 1... 
Block Mined!!! : 000000af48fb229f058f040958823cc7f84d211dbed757f42df3cb61e9855950
Trying to Mine block 2... 
Block Mined!!! : 000000302fe205d01bc774648faec8a2996116b5b2c89c926bfc1ab07944543f
Trying to Mine block 3... 
Block Mined!!! : 000000f5e6e28a658c05d0fb7a4ad8823d2a73c623df94baa2d8e77c8a174224

Blockchain is Valid: true
[
  {
    "hash": "000000af48fb229f058f040958823cc7f84d211dbed757f42df3cb61e9855950",
    "previousHash": "0",
    "data": "Hi im the first block",
    "timeStamp": 1526374812937,
    "nonce": 28450174
  }
  {
    "hash": "000000302fe205d01bc774648faec8a2996116b5b2c89c926bfc1ab07944543f",
    "previousHash": "000000af48fb229f058f040958823cc7f84d211dbed757f42df3cb61e9855950",
    "data": " im the second block",
    "timeStamp": 1526374837705,
    "nonce": 12808359
  },
  {
    "hash": "000000f5e6e28a658c05d0fb7a4ad8823d2a73c623df94baa2d8e77c8a174224",
    "previousHash": "000000302fe205d01bc774648faec8a2996116b5b2c89c926bfc1ab07944543f",
    "data": " im the third block",
    "timeStamp": 1526374852137,
    "nonce": 27787992
  }
]


```
