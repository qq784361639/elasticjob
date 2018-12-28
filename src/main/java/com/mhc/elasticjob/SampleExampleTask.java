package com.mhc.elasticjob;

import com.camaro.starter.mq.base.MessageBuilder;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.mhc.job.annotation.MHCJobConfig;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p><p>
 *
 * @Auther: dsf （weizhen@maihaoche.com）
 * @Date: 2018/12/27 14:33
 * @since V1.0.0
 */
@MHCJobConfig(cron = "0/5 * * * * ?", name = "TestTaskJob", streamingProcess = false, overwrite = true, shardingTotalCount = 2, jobParameter = "job参数", shardingItemParameters = "0=A,1=B")
public class SampleExampleTask implements SimpleJob {

    @Autowired
    private MessageProducer messageProducer;
    @Override
    public void execute(ShardingContext shardingContext) {
        messageProducer.asyncSend(MessageBuilder.of("11").topic("xiangzi_test").tag("syn_test").build());
        System.out.println("测试");
    }
}
