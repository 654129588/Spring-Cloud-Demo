package org.wechar.cloud;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/***
 * @author CHENWEICONG
 * @create 2018-10-24 11:51
 * @desc chenweicong
 * 用于检测本服务器是否健康，检测条件自定
 */
@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if(GoodsController.status){
            return Health.status(Status.UP).build();
        }else{
            return Health.status(Status.DOWN).build();
        }
    }
}
