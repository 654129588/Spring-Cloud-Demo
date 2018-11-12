package org.wechar.cloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/***
 * @author CHENWEICONG
 * @create 2018-10-30 17:15
 * @desc chenweicong
 */
@EnableBinding(MyReceiveSink.class)
public class MyStreamService {

    @StreamListener(MyReceiveSink.INPUT)
    public void streamListener(String msg) throws Exception {
        System.out.println(msg);
    }
}
