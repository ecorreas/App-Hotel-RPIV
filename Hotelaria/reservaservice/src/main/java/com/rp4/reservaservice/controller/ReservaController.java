package com.rp4.reservaservice.controller;

import com.rp4.reservaservice.dto.ReservaDTO;
import com.rp4.reservaservice.interfaces.IReservaService;
import com.rp4.reservaservice.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    private IReservaService reservaService;


    public ReservaController(IReservaService service){
        this.reservaService = service;
    }
    @PostMapping("/salvar")
    public void salvarReserva(@RequestBody ReservaDTO reservaDTO){
        Reserva reserva = new Reserva();
        reserva.setId(reservaDTO.getId());
        reserva.setDataInicio(reservaDTO.getDataInicio());
        reserva.setDataFinal(reservaDTO.getDataFinal());
        reserva.setQuarto(reservaDTO.getQuarto());
        reserva.setValorReserva(reservaDTO.getValorReserva());
        reservaService.saveReserva(reserva);

    }
}
