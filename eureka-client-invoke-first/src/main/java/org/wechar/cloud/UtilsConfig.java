package org.wechar.cloud;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/***
 * @author CHENWEICONG
 * @create 2018-10-23 10:46
 * @desc chenweicong
 */
@Component
@Configurable
public class UtilsConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
