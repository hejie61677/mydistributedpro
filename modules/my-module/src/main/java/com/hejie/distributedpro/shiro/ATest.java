package com.hejie.distributedpro.shiro;

import cn.hutool.core.lang.Assert;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;

import java.security.Key;

/**
 * @Program: myroot
 * @Description:
 * @Author: hejie
 * @Create: 2020-07-16 10:42
 */
public class ATest {
    public static void main(String[] args) {
        AesCipherService aesCipherService = new AesCipherService();
        aesCipherService.setKeySize(128); //设置key长度
        //生成key
        Key key = aesCipherService.generateNewKey();
        String text = "hello";
        //加密
        String encrptText = aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();
        //解密
        String text2 = new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());
        Assert
    }
}
