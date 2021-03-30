package com.rp4.hotelaria.ProducerMensagem;

import com.rp4.hotelaria.model.Quarto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QuartoProducerMensagem {

    @Value("${crud.rabbitmq.exchange}")
    String exchange;

    @Value("${crud.rabbitmq.routingkey}")
    String routingkey;

    public RabbitTemplate rabbitTemplate;

    public void producerMensagem(Quarto quarto){
        rabbitTemplate.convertAndSend(exchange, routingkey, quarto);

    }

    @Autowired
    public QuartoProducerMensagem(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;

    }

}
