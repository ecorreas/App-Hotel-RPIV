package com.rp4.hotelaria.controller;


import com.rp4.hotelaria.dto.FolhaPagamentoDTO;
import com.rp4.hotelaria.dto.QuartoDTO;
import com.rp4.hotelaria.interfaces.IFolhaPagamentoService;
import com.rp4.hotelaria.interfaces.IQuartoService;
import com.rp4.hotelaria.model.FolhaPagamento;
import com.rp4.hotelaria.model.Quarto;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/folhaPagamento")
public class FolhaPagamentoController {

    private IFolhaPagamentoService folhaPagamentoService;

    @Autowired
    public FolhaPagamentoController(IFolhaPagamentoService service){

        this.folhaPagamentoService = service;
    }

    @PostMapping("/salvar")
    public void salvarFolhaPagamento(@RequestBody FolhaPagamentoDTO fpDTO){
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.setId(fpDTO.getId());
        folhaPagamento.setFuncionario(fpDTO.getFuncionario());
        folhaPagamento.setSalario(fpDTO.getSalario());
        folhaPagamento.setHorasExtras(fpDTO.getHorasExtras());
        folhaPagamento.setHoraEntrada(fpDTO.getHoraEntrada());
        folhaPagamento.setHoraSaida(fpDTO.getHoraSaida());
        folhaPagamentoService.salvarFolhaPagamento(folhaPagamento);

    }

    @GetMapping("/folhaPagamento/{id}")
    public ResponseEntity<?> getFolhaPagById(@PathVariable("id")Long id) {
        FolhaPagamento folhaPagamento = folhaPagamentoService.getFolhaPagById(id);
        return new ResponseEntity<>(folhaPagamento, HttpStatus.OK);
    }

    @PutMapping("/folhaPagamento/atualizar")
    @ApiOperation(value = "Atualizar Folha Pagamento")
    public FolhaPagamento atualizarFolha(@RequestBody FolhaPagamento folhaPagamento) {

        return folhaPagamentoService.atualizarFolha(folhaPagamento);
    }

    @DeleteMapping("/folhaPagamento/excluir/{id}")
    public void excluirFolha(@PathVariable("id") Long id){

        folhaPagamentoService.excluirFolha(id);
    }

    @GetMapping("/todos")
    public List<FolhaPagamento> pegarTodasFolhas(){
        List<FolhaPagamento> folhaPagamentos = folhaPagamentoService.pegarTodasFolhas();
        return folhaPagamentos;
    }

}
