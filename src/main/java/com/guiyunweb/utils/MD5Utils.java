package com.guiyunweb.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author wnkj
 */
public class MD5Utils {

    public static String toMD5(String plainText) {
        Object var1 = null;

        byte[] secretBytes;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(plainText.getBytes());
        } catch (NoSuchAlgorithmException var4) {
            throw new RuntimeException("没有md5这个算法！");
        }

        String md5code = (new BigInteger(1, secretBytes)).toString(16);

        for(int i = 0; i < 32 - md5code.length(); ++i) {
            md5code = "0" + md5code;
        }

        return md5code;
    }

}
