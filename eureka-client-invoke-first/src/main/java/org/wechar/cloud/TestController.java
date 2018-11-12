package org.wechar.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.wechar.cloud.feign.MyFeignClient;
import org.wechar.cloud.stream.MySendSink;

/***
 * @author CHENWEICONG
 * @create 2018-10-23 10:50
 * @desc chenweicong
 */
@RestController
public class TestController {



    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MyFeignClient myFeignClient;

    @Autowired
    private MySendSink mySendSink;

//    @GetMapping(value = "/router/{id}")
//    public String router(@PathVariable Integer id){
//       return restTemplate.getForObject("http://eureka-client-release/getGoods/"+id,String.class);
//    }

    @GetMapping(value = "/router/{id}")
    public String router(@PathVariable Integer id) {
        return myFeignClient.getGoods(1);
    }

    @GetMapping(value = "/sink")
    public String sink() {
        mySendSink.sink().send(MessageBuilder.withPayload("hello").build());
        return "OK";
    }


}
