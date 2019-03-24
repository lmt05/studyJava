package lmt.com.demo.dlk;

import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class rabbtiConfig {

    private static final String dealExchange = "DEAL_EXCHANGE";

    private static final String dealQueue = "DEAL_QUEUE";

    private static final String dealRoutingKey = "DEAL_ROUTING_KEY";

    private static final String exchangeName = "EXCHANGE_NAME";

    private static final String queueName = "QUEUE_NAME";

    private static final String routingKey = "ROUTING_KEY";

    //创建正常交换机
    @Bean
    public TopicExchange topicExchange(){
//        ExchangeBuilder exchangeBuilder = new ExchangeBuilder();
        return new TopicExchange(exchangeName);
    }
}
