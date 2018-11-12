package org.wechar.cloud;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/***
 * @author CHENWEICONG
 * @create 2018-10-24 11:56
 * @desc chenweicong
 * 此类用于同步到eureka服务器本服务健康状态
 */
@Component
public class MyHealthCheckHandler implements HealthCheckHandler{

    @Autowired
    private MyHealthIndicator healthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        if(healthIndicator.health().getStatus().equals(Status.UP)){
            return InstanceInfo.InstanceStatus.UP;
        }else{
            return InstanceInfo.InstanceStatus.DOWN;
        }
    }
}
