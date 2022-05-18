package shoppingCartCommandService.shoppingcartcommandservice.configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfigs {

    @Bean
    public NewTopic shoppingCartQueryTopic() {
        return new NewTopic("shopping_cart_query_topic1", 1, (short) 1);
    }

    @Bean
    public NewTopic shoppingCartCheckoutTopic() {
        return new NewTopic("shopping-cart-checkout-topic", 1, (short) 1);
    }

}
