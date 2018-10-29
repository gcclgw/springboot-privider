package com;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class SpringbootPrividerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPrividerApplication.class, args);
    }

    @Bean
    public Queue getQueue(){
        return new Queue("666");
    }
}
