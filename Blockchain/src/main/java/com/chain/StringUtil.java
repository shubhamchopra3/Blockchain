package com.chain;

import org.apache.commons.codec.digest.DigestUtils;

public class StringUtil {

	public static String applySHA256(String input) {
		try {

			String sha256hex = DigestUtils.sha256Hex(input);
			return sha256hex;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
