package com.ytt.netty.chat;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: aaron
 * @Descriotion:
 * @Date: 15:52 2018/1/21
 * @Modiflid By:
 */
public class ChatClient {

    public static void main(String[] args) throws InterruptedException, IOException {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        try{
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChatClientInitializer());

//            ChannelFuture channelFuture = bootstrap.connect("localhost",8089).sync();
//            channelFuture.channel().closeFuture().sync();

            Channel channel = bootstrap.connect("localhost",8089).sync().channel();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for(; ;){
                channel.writeAndFlush(br.readLine() + "\r\n");
            }

        }finally {
            eventLoopGroup.shutdownGracefully();
        }


    }
}
