package com.javadev.consumer;

import com.javadev.SpringbootAwsSqsApplication;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    Logger logger = LoggerFactory.getLogger(SpringbootAwsSqsApplication.class);

    @SqsListener("demo-queue")
    public void consumeMessageFromQueue(String message) {
        logger.info("Message from SQS Queue {}", message);
    }

}
