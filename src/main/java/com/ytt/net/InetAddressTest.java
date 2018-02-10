package com.ytt.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: aaron
 * @Descriotion:
 * @Date: 21:24 2018/2/10
 * @Modiflid By:
 */
public class InetAddressTest {

    public static void main(String[] args) {

        try {
            //1.1 连接DNS服务器来解析主机名，获取ip地址
//            InetAddress address = InetAddress.getByName("www.baidu.com");
//            System.out.println(address);
            //1.2 通过按ip地址反向查找主机名
//            InetAddress address = InetAddress.getByName("180.149.131.98");
//            System.out.println(address.getHostName());
            //1.3 查询到一个主机的所有的IP地址
//            InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
//            for (InetAddress address: addresses) {
//                System.out.println(address);
//            }
            //1.4 查找本地机器的地址
//            InetAddress address = InetAddress.getLocalHost();
//            System.out.println(address);
            //1.5 确定是IPv4还是IPv6
//            byte[] address = InetAddress.getByName("www.hao123.com").getAddress();
//            if(address.length == 4) {
//                System.out.println(">>>IPv4");
//            }
//            else if(address.length == 6) {
//                System.out.println(">>>IPv6");
//            }
//            else {
//                System.out.println(">>>no");
//            }
            //1.6 测试IP地址的性质
            for (String arg:args) {
                System.out.println(arg);
            }

            InetAddress address = InetAddress.getByName("127.0.0.1");

            if(address.isAnyLocalAddress()){
                System.out.println(address + " is a wildcard address");
            }else if(address.isLoopbackAddress()){
                System.out.println(address + "is loopback address");
            }else if(address.isLinkLocalAddress()){
                System.out.println(address + "is link-local address");
            }else if(address.isSiteLocalAddress()){
                System.out.println(address + "is site-local address");
            }else{
                System.out.println(address + "is global address");
            }

            if(address.isMulticastAddress()){
                if(address.isMCGlobal()){
                    System.out.println(address + " is a global address");
                }else if(address.isMCOrgLocal()){
                    System.out.println(address + "is an organization wide address");
                }else if(address.isMCSiteLocal()){
                    System.out.println(address + "is a site wide mulicast address");
                }else if(address.isMCLinkLocal()){
                    System.out.println(address + "is a subnet wide mulicast address");
                }else if(address.isMCNodeLocal()){
                    System.out.println(address + "is a interface-local mulicast address");
                }else{
                    System.out.println(address + "is an unknow address type");
                }
            }else{
                System.out.println(address + "is a unicast address");
            }

        } catch (UnknownHostException e) {
            System.out.println("Could not find www.baidu.com");
        }

    }

}
