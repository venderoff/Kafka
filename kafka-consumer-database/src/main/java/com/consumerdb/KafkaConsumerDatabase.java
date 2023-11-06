package com.consumerdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerDatabase.class) ;

    @KafkaListener(topics = "wikimedia_recentchange",
    groupId = "myGroup")
    public void consumer(String eventMessage) {

        LOGGER.info(String.format("Event Message received -> %s", eventMessage));


    }
}
