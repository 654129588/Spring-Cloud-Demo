package org.wechar.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixActuatorServerApplication{

	public static void main( String[] args )
	{
		SpringApplication.run(HystrixActuatorServerApplication.class,args);
	}
}
