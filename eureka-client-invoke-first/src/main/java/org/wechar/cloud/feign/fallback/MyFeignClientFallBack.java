package org.wechar.cloud.feign.fallback;

import org.springframework.stereotype.Component;
import org.wechar.cloud.feign.MyFeignClient;

/***
 * @author CHENWEICONG
 * @create 2018-10-29 8:46
 * @desc chenweicong
 */
//断路器fallback返回结果
@Component
public class MyFeignClientFallBack implements MyFeignClient{
    @Override
    public String getGoods(Integer id) {
        return "fallback";
    }
}
