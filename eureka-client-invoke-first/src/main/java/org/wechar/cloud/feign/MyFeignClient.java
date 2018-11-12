package org.wechar.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wechar.cloud.feign.fallback.MyFeignClientFallBack;

//feign整合hystrix断路器熔断机制
@FeignClient(value = "eureka-client-release",fallback = MyFeignClientFallBack.class)
public interface MyFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/getGoods/{id}")
    String getGoods(@PathVariable("id") Integer id);
}
