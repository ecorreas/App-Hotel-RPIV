package com.rp4.consumoservice.controller;

import com.rp4.consumoservice.dto.ConsumoDTO;
import com.rp4.consumoservice.interfaces.IConsumoService;
import com.rp4.consumoservice.model.Consumo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Consumos")
@CrossOrigin(origins = "*")
public class ConsumoController {
    private IConsumoService consumoService;

    public ConsumoController(IConsumoService service){
        this.consumoService = service;
    }
    @PostMapping("/salvar")
    @ApiOperation(value = "Cadastra um consumo")
    public void salvarConsumo(@RequestBody ConsumoDTO consumoDTO){
        Consumo consumo = new Consumo();
        consumo.setId(consumoDTO.getId());
        consumo.setData(consumoDTO.getData());
        consumo.setProduto(consumoDTO.getProduto());
        consumo.setValorConsumo(consumoDTO.getValorConsumo());
        consumoService.saveConsumo(consumo);
    }
    @PutMapping("/consumo/atualizar")
    @ApiOperation(value = "Atualizar uma consumo")
    public ResponseEntity<?> updateConsumo(@RequestBody Consumo consumo) {
        Consumo atualizarConsumo = consumoService.updateConsumo(consumo);
        return new ResponseEntity<>(atualizarConsumo, HttpStatus.OK);
    }
    @GetMapping("/consumo/{id}")
    public ResponseEntity<?> getConsumoById(@PathVariable("id") Long id) {
        Consumo consumo = consumoService.findConsumoById(id);
        return new ResponseEntity<>(consumo, HttpStatus.OK);
    }
    @DeleteMapping("/consumo/excluir/{id}")
    public void deleteConsumo(@PathVariable("id")Long id){consumoService.deleteConsumo(id);}
}
