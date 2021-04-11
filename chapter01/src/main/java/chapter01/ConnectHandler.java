package chapter01;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConnectHandler extends ChannelInboundHandlerAdapter {

    private static final Logger log = LoggerFactory.getLogger(ConnectHandler.class);

    /**
     * Listing 1.2 ChannelHandler triggered by a callback
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("Client {} connected", ctx.channel().remoteAddress());
    }
}
