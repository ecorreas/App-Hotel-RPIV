package com.rp4.reservaPasseioTuristico.ConsumerMensagem;

import com.rp4.reservaPasseioTuristico.model.Cliente;
import com.rp4.reservaPasseioTuristico.model.Turismo;
import com.rp4.reservaPasseioTuristico.repository.ClienteRepository;
import com.rp4.reservaPasseioTuristico.repository.TurismoRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ClienteConsumerMensagem {


    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteConsumerMensagem(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @RabbitListener(queues = {"${crud.rabbitmq.queueCliente}"})
    public void consumer(@Payload Cliente cliente) {
        clienteRepository.save(cliente);


    }
}
