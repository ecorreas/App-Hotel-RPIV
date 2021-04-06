package com.rp4.reservaservice.controller;

import com.rp4.reservaservice.dto.ReservaDTO;
import com.rp4.reservaservice.interfaces.IReservaService;
import com.rp4.reservaservice.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    private IReservaService reservaService;


    public ReservaController(IReservaService service) {
        this.reservaService = service;
    }

    @PostMapping("/salvar")
    public void salvarReserva(@RequestBody ReservaDTO reservaDTO) {
        Reserva reserva = new Reserva();
        reserva.setId(reservaDTO.getId());
        reserva.setDataInicio(reservaDTO.getDataInicio());
        reserva.setDataFinal(reservaDTO.getDataFinal());
        reserva.setQuarto(reservaDTO.getQuarto());
        reserva.setValorReserva(reservaDTO.getValorReserva());
        reservaService.saveReserva(reserva);

    }
    @PutMapping("/reserva/atualizar")
    public ResponseEntity<?> updateReserva(@RequestBody Reserva reserva){
        Reserva atualizarReserva =  reservaService.updateReserva(reserva);
        return new ResponseEntity<>(atualizarReserva, HttpStatus.OK);
    }
    @GetMapping("/reserva/{id}")
    public ResponseEntity<?> getRentById (@PathVariable("id") Long id) {
        Reserva reserva = reservaService.findReservaById(id);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }
}
