package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.QuartoDTO;

import com.rp4.hotelaria.interfaces.IQuartoService;
import com.rp4.hotelaria.model.Quarto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quartos")
public class QuartoController {
    private IQuartoService quartoService;

    @Autowired
    public QuartoController(IQuartoService service){

        this.quartoService = service;
    }

    @PostMapping("/salvar")
    public void saveQuarto(QuartoDTO quartoDTO){

        Quarto quarto = new Quarto();
        quarto.setHotel(quartoDTO.getHotel());
        quarto.setNumeroDoQuarto(quartoDTO.getNumeroDoQuarto());
        quarto.setDescricao(quartoDTO.getDescricao());
        quarto.setPreco(quartoDTO.getPreco());
        quarto.setAdicionalDoQuarto(quartoDTO.getAdicionalDoQuarto());
        quartoService.salvarQuarto(quarto);

    }
}
