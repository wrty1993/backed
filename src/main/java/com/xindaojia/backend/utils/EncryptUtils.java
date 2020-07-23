package com.xindaojia.backend.utils;

import java.util.Date;
import java.util.Scanner;
import org.springframework.stereotype.Component;

/**
 * Copyright@www.tencent.com.
 *
 * @author:gaiserchen
 * @date:2020/7/23
 * @description:
 */
@Component
public class EncryptUtils {

    private final String salt = "xin_encrypt";

    public String encryptStr(String string){
        return BCrypt.hashpw(string+salt,BCrypt.gensalt());
    }

    public boolean isMaptch(String sourceStr,String destStr){
        return BCrypt.checkpw(sourceStr+salt,destStr);
    }

    public static void main(String[] args){
        final String salt = "xin_encrypt";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入密码：");
        String password=scanner.nextLine();//明文
        System.out.println("请输入待验证密码：");
        String candidate=scanner.nextLine();
        System.out.println(new Date());
        // 第一次哈希一个password
        String hashed = BCrypt.hashpw(password+salt, BCrypt.gensalt());//密文
        System.out.println(new Date());

        // gensalt's log_rounds parameter determines the complexity
        // the work factor is 2**log_rounds, and the default is 10
        String hashed2 = BCrypt.hashpw(password+salt, BCrypt.gensalt(12));
        System.out.println(hashed);
        System.out.println(hashed2);
        //密码密文匹配检测
        if (BCrypt.checkpw(candidate+salt, hashed)) {
            System.out.println("It matches");
        } else {
            System.out.println("It does not match");
        }

    }

}
