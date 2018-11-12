package org.wechar.cloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface MySendSink {
    String INPUT = "sink";

    @Output(INPUT)
    SubscribableChannel sink();
}
