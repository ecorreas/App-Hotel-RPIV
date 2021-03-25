package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.HotelDTO;
import com.rp4.hotelaria.dto.ManutencaoDTO;
import com.rp4.hotelaria.interfaces.IHotelService;
import com.rp4.hotelaria.interfaces.IManutencaoService;
import com.rp4.hotelaria.model.Hotel;
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

    @PostMapping("/salvar")
    @ApiOperation(value = "Salvar manutancao")
    public void saveManutencao(@RequestBody ManutencaoDTO manutencaoDTO){
        Manutencao manutencao = new Manutencao();
        manutencao.setId_manutencao(manutencaoDTO.getId_Manu());
        manutencao.setId_manutencao(manutencaoDTO.getId_Manu();
        manutencaoService.salvarManutencao(manutencao);
    }

    @GetMapping("/hotel/{id}")
    @ApiOperation(value = "Retornar Manutencao")
    public ResponseEntity<?> pegarManutencaoPeloId(@PathVariable("id")Long id){
        Manutencao manutencao = manutencaoService.getManutencaoById(id);
        return new ResponseEntity<> (manutencao, HttpStatus.OK);
    }

}


