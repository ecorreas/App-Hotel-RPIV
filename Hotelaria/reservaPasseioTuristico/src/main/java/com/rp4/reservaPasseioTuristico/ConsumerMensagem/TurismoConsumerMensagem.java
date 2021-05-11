package com.rp4.reservaPasseioTuristico.ConsumerMensagem;

import com.rp4.reservaPasseioTuristico.model.Turismo;
import com.rp4.reservaPasseioTuristico.repository.TurismoRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class TurismoConsumerMensagem {

    private TurismoRepository turismoRepository;

    @Autowired
    public TurismoConsumerMensagem(TurismoRepository turismoRepository) {
        this.turismoRepository = turismoRepository;
    }

    @RabbitListener(queues = {"${crud.rabbitmq.queueTurismo}"})
    public void consumer(@Payload Turismo turismo) {
        turismoRepository.save(turismo);


    }
}
