package com.rp4.reservaPasseioTuristico.ConsumerMensagem;

import com.rp4.reservaPasseioTuristico.model.Cidade;
import com.rp4.reservaPasseioTuristico.repository.CidadeRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CidadeConsumerMensagem {


    private CidadeRepository cidadeRepository;

    @Autowired
    public CidadeConsumerMensagem(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }


    @RabbitListener(queues = {"${crud.rabbitmq.queueCidade}"})
    public void consumer(@Payload Cidade cidade) {
        cidadeRepository.save(cidade);


    }
}
