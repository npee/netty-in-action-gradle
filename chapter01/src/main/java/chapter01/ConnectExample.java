package chapter01;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class ConnectExample {

    /**
     * Listing 1.3 Asynchronous connect
     *
     * Listing 1.4 Callback in action
     */
    private static final Channel CHANNEL_FROM_SOMEWHERE = new NioSocketChannel();

    public void connect() {
        Channel channel = CHANNEL_FROM_SOMEWHERE;
        ChannelFuture future = channel.connect(new InetSocketAddress("localhost", 8888));
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (future.isSuccess()) {
                    ByteBuf buffer = Unpooled.copiedBuffer("Hello", Charset.defaultCharset());
                    ChannelFuture wf = future.channel().writeAndFlush(buffer);
                    // ..

                } else {
                    Throwable cause = future.cause();
                    cause.printStackTrace();
                }
            }
        });
    }
}
