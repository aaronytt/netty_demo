package com.ytt.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: aaron
 * @Descriotion:
 * @Date: 21:06 2018/2/11
 * @Modiflid By:
 */
public class SpamCheck {

    public static final String BLACKHPLE = "sbl.spamhaus.org";

    public static void main(String[] args){
        for (String arg: args) {
            if(isSpammer(arg)){
                System.out.println(arg + " is a know spammer.");
            }else {
                System.out.println(arg + " appears legitimate.");
            }
        }
    }

    private static boolean isSpammer(String arg){

        try {
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();
            String query = BLACKHPLE;
            for (byte octet: quad) {
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query = unsignedByte + "." + query;
            }
            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }

    }

}
