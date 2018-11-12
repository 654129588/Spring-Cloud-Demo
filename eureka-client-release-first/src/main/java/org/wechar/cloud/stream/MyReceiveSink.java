package org.wechar.cloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface MyReceiveSink {
    String INPUT = "sink";

    @Input(INPUT)
    SubscribableChannel sink();
}
