package com.ytt.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 * @Author: aaron
 * @Descriotion:
 * @Date: 20:40 2018/2/11
 * @Modiflid By:
 */
public class NetworkInterfaceTest {

    public static void main(String[] args) {

//        try {
            //1.通过IP地址、名字或枚举来请求一个NetworkInterface
//            NetworkInterface ni = NetworkInterface.getByName("eth0");
//            if(ni == null){
//                System.err.println("No such interface: eth0");
//            }
            //2.指定IP地址绑定的网络接口
//            InetAddress local = InetAddress.getByName("127.0.0.1");
//            NetworkInterface ni = NetworkInterface.getByInetAddress(local);
//            if(ni == null){
//                System.err.println("That`s weird.No local loopback address.");
//            }else {
//                System.out.println("NetworkInterface success");
//            }
            //3.列出本地主机的所有网络接口
//            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
//            while (interfaces.hasMoreElements()){
//                System.out.println(interfaces.nextElement());
//            }
            //4.列出eth0接口绑定的所有的IP地址
//            NetworkInterface ni = NetworkInterface.getByName("eth1");
//            Enumeration address = ni.getInetAddresses();
//            while (address.hasMoreElements()){
//                System.out.println(address.nextElement());
//            }
//        } catch (SocketException e) {
//            System.err.println("Could not list sockets.");
//        } catch (UnknownHostException e) {
//            System.err.println("That`s weird.Could not lookup 127.0.0.1");
//        }

    }

}
