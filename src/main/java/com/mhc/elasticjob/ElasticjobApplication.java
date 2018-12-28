package com.mhc.elasticjob;


import com.camaro.starter.mq.annotation.EnableMQConfiguration;
import com.camaro.starter.mq.base.MessageBuilder;
import com.mhc.job.annotation.EnableMHCJob;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})
@EnableMHCJob
@EnableMQConfiguration
public class ElasticjobApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticjobApplication.class, args);
    }

}

