package com.mhc.elasticjob;

import com.camaro.starter.mq.base.MessageBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticjobApplicationTests {
    @Autowired
    MessageProducer messageProducer;
    @Test
    public void contextLoads() {
        messageProducer.asyncSend(MessageBuilder.of("11").topic("xiang_zi").tag("syn_test").build());
    }

}

