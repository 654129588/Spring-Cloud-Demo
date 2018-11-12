package org.wechar.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.wechar.cloud.stream.MyReceiveSink;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class EurekaReleaseClientApplication
{
    public static void main( String[] args )
    {
        SpringApplication springApplication = new SpringApplication(EurekaReleaseClientApplication.class);
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> defaultMap = new HashMap<String, Object>();
        String port = scanner.nextLine();
        defaultMap.put("server.port", port);
        springApplication.setDefaultProperties(defaultMap);
        springApplication.run(args);
    }
}
