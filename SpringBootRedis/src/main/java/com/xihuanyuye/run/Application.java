package com.xihuanyuye.run;

import java.io.IOException;
import java.net.ServerSocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.xihuanyuye"})
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);

        while (true) {
            //为了简单起见，所有的异常信息都往外抛
            int port = 8989;
            //定义一个ServerSocket监听在端口8989上
            ServerSocket server = new ServerSocket(port);
            server.accept();
        }

    }
}
