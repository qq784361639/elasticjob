package com.mhc.elasticjob;

        import com.camaro.starter.mq.annotation.MQConsumer;
        import com.camaro.starter.mq.base.AbstractMQPushConsumer;

        import java.util.Map;

/**
 * <p><p>
 *
 * @Auther: dsf （weizhen@maihaoche.com）
 * @Date: 2018/12/27 14:47
 * @since V1.0.0
 */
@MQConsumer(topic = "xiangzi_test", consumerGroup = "CID_test", tag="syn_test")
public class MessageConsumer extends AbstractMQPushConsumer<Object> {
    @Override
    public boolean process(Object o, Map<String, Object> map) {
        System.out.println(o.toString());
        return true;


    }
}
