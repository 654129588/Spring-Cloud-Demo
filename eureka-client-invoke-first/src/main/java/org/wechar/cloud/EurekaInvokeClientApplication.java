package org.wechar.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.wechar.cloud.stream.MySendSink;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableBinding(MySendSink.class)
public class EurekaInvokeClientApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaInvokeClientApplication.class,args);
    }
}
