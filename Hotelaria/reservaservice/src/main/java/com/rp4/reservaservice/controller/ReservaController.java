package com.rp4.reservaservice.controller;

import com.rp4.reservaservice.dto.ReservaDTO;
import com.rp4.reservaservice.interfaces.IReservaService;
import com.rp4.reservaservice.model.Reserva;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST reservas")
@CrossOrigin(origins = "*")
public class ReservaController {
    private IReservaService reservaService;


    public ReservaController(IReservaService service) {
        this.reservaService = service;
    }

    @PostMapping("/salvar")
    @ApiOperation(value = "Cadastra uma reserva")
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
    @ApiOperation(value = "Atualizar uma reserva")
    public ResponseEntity<?> updateReserva(@RequestBody Reserva reserva) {
        Reserva atualizarReserva = reservaService.updateReserva(reserva);
        return new ResponseEntity<>(atualizarReserva, HttpStatus.OK);
    }

    @GetMapping("/reserva/{id}")
    public ResponseEntity<?> getReservaById(@PathVariable("id") Long id) {
        Reserva reserva = reservaService.findReservaById(id);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }

    @DeleteMapping("/reserva/excluir/{id}")
    public void deleteReserva(@PathVariable("id")Long id){reservaService.deleteReserva(id);}
}
