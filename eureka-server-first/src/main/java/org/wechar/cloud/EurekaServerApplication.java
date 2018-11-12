package org.wechar.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication
{
    public static void main( String[] args )
    {
        //new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
        Scanner scanner = new Scanner(System.in);
        String profiles = scanner.nextLine();
        SpringApplication application = new SpringApplication(EurekaServerApplication.class);
        application.setAdditionalProfiles(profiles);
        application.run(args);
    }
}
