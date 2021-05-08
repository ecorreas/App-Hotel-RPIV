package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.CidadeDTO;
import com.rp4.hotelaria.dto.ProdutoDTO;
import com.rp4.hotelaria.interfaces.ICidadeService;
import com.rp4.hotelaria.interfaces.IProduto;
import com.rp4.hotelaria.model.Cidade;
import com.rp4.hotelaria.model.Produto;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/cidade")

    public class CidadeController {

        private ICidadeService cidadeService;

        @Autowired
        public CidadeController(ICidadeService cidade) {
            this.cidadeService = cidade;
        }

        @PostMapping("/salvar")
        @ApiOperation(value = "Salvar cidade")
        public void saveCidade(@RequestBody CidadeDTO cidadeDTO) {
            Cidade cidade = new Cidade();
            cidade.setIdCidade(cidadeDTO.getIdCidade());
            cidade.setNome(cidadeDTO.getNome());
            cidade.setEstado(cidadeDTO.getEstado());
            cidade.setRegiao(cidadeDTO.getRegiao());
            cidade.setPais(cidadeDTO.getPais());
            cidade.setDdd(cidadeDTO.getDdd());
            cidadeService.salvarCidade(cidade);
        }

        @GetMapping("/cidade/{id}")
        @ApiOperation(value = "Retornar cidade")
        public ResponseEntity<?> pegarProdutoPeloId(@PathVariable("id") Long id) {
            Cidade cidade = cidadeService.getCidadeById(id);
            return new ResponseEntity<>(cidade, HttpStatus.OK);
        }

        @PutMapping("/cidade/atualizar")
        @ApiOperation(value = "Atualizar Cidade")
        public Cidade atualizarProduto(@RequestBody Cidade cidade) {
            return cidadeService.atualizarCidade(cidade);}

        @DeleteMapping("/cidade/excluir/{id}")
        @ApiOperation(value = "Deletar cidade")
        public void deleteCidade(@PathVariable("id") Long id) {
            cidadeService.excluirCidade(id);
        }

        @GetMapping("/todos")
        @ApiOperation(value = "Retornar uma lista de cidades")
        public List<Cidade> pegarTodosProdutose() {
            List<Cidade> cidade = cidadeService.pegarTodasCidades();
            return cidade;
        }

    }


