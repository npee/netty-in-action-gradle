package chapter01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private static Logger log = LoggerFactory.getLogger(chapter01.Main.class);

    public static void main(String[] args) throws IOException {
        BlockingIOExample blockingIOExample = new BlockingIOExample();
        blockingIOExample.serve(8888);
    }
}

