package com.ytt.netty.heartbeatexample;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @Author: aaron
 * @Descriotion:
 * @Date: 17:37 2018/1/21
 * @Modiflid By:
 */
public class ServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new IdleStateHandler(5,7,1, TimeUnit.SECONDS));
        pipeline.addLast(new ServerHandler());
    }
}
