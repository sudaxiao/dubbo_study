package com.dfire;

import java.util.Random;

/**
 * Created by ch on 2017/7/13.
 */
public class AuToProduct {
    public static void main(String [] args){
        String sex;
        Random r=new Random();
        int age;
        for(int i=1;i<50;i++){
            if(i%2==0) sex="男";
            else sex="女";
            age=r.nextInt(30)+18;
            System.out.println("INSERT INTO `user` VALUES ("+i+",'苏打"+i+"','苏苏"+i+"',"+age+",'"+sex+"','130130130"+i+"','130130130"+i+"@qq.com');");
        }
    }

}
