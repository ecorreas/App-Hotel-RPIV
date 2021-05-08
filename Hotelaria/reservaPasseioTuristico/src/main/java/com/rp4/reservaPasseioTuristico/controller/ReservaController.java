package com.rp4.reservaPasseioTuristico.controller;

import com.rp4.reservaPasseioTuristico.dto.ReservaDTO;
import com.rp4.reservaPasseioTuristico.interfaces.IReserva;
import com.rp4.reservaPasseioTuristico.model.Reserva;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservaPasseio")
public class ReservaController {
    private IReserva reservaService;


    public ReservaController(IReserva service) {
        this.reservaService = service;
    }

    @PostMapping("/salvar")
    public void salvarReserva(@RequestBody ReservaDTO reservaDTO) {
        Reserva reserva = new Reserva();
        reserva.setId(reservaDTO.getId());
        reserva.setData(reservaDTO.getData());
        reserva.setHora(reservaDTO.getHora());
        reserva.setTurismo(reservaDTO.getTurismo());
        reservaService.saveReserva(reserva);
    }

    @PutMapping("/reserva/atualizar")
    public ResponseEntity<?> updateReserva(@RequestBody Reserva reserva) {
        Reserva atualizarReserva = reservaService.updateReserva(reserva);
        return new ResponseEntity<>(atualizarReserva, HttpStatus.OK);
    }

    @GetMapping("/reserva/{id}")
    public ResponseEntity<?> getRentById(@PathVariable("id") Long id) {
        Reserva reserva = reservaService.findReservaById(id);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }

   /* @DeleteMapping("/reserva/excluir/{id}")
    public void deleteReserva(@PathVariable("id")Long id){reservaService.deleteReserva(id);}*/
}
