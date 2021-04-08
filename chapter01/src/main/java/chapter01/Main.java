package chapter01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private static Logger log = LoggerFactory.getLogger(chapter01.Main.class);

    public static void main(String[] args) throws IOException {
        BlockingIOExample chapter01_1 = new BlockingIOExample();
        chapter01_1.serve(8888);
    }
}

