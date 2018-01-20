package com.ytt.netty.example;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Author: aaron
 * @Descriotion:
 * @Date: 17:50 2018/1/19
 * @Modiflid By:
 */
public class TestServer {

    public static void main(String[] args) throws Exception{
        //netty推荐使用两个线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            //
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            //一个组接收，一个组处理，
            serverBootstrap.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new TestChannelInitializer());

            ChannelFuture channelFuture = serverBootstrap.bind(8089).sync();
            channelFuture.channel().closeFuture().sync();
        } finally{
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }

}
