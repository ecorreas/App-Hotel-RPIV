package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.Enuns.Status;
import com.rp4.hotelaria.interfaces.IManutencaoService;
import com.rp4.hotelaria.model.Manutencao;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/hoteis")

public class ManutencaoController {
    private IManutencaoService manutencaoService;

    public ManutencaoController(IManutencaoService service){
        this.manutencaoService = service;
    }

    @GetMapping("/hotel/{status}")
    @ApiOperation(value = "Retornar Manutencao")
    public ResponseEntity<?> getManutencaoByStatus(@PathVariable("status") Status status){
        Manutencao manutencao = manutencaoService.getManutencaoByStatus(status);
        return new ResponseEntity<> (manutencao, HttpStatus.OK);
    }

    @PutMapping("/hotel/atualizar")
    @ApiOperation(value = "Atualizar Manutenção")
    public Manutencao atualizarManutencao(@RequestBody Manutencao manutencao) {
        return manutencaoService.atualizarManutencao(manutencao);
    }

    @GetMapping("/todos")
    @ApiOperation(value = "Retornar uma lista de manutenções")
    public List<Manutencao> pegarTodasManutencoes(){
        List<Manutencao> manutencoes = manutencaoService.pegarTodasManutencoes();
        return manutencoes;
    }


}


