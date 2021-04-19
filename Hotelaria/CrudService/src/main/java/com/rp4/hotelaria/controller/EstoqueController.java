package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.EstoqueDTO;
import com.rp4.hotelaria.interfaces.IControleEstoque;
import com.rp4.hotelaria.model.Estoque;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/estoque")

    public class EstoqueController {
        private IControleEstoque estoqueService;

        public EstoqueController(IControleEstoque estoque) { this.estoqueService = estoque;
        }

        @PostMapping("/salvar")
        @ApiOperation(value = "Salvar Estoque")
        public void saveEstoque(@RequestBody EstoqueDTO estoqueDTO) {
            Estoque estoque = new Estoque();
            estoque.setId(estoqueDTO.getId());
            estoque.setNome(estoqueDTO.getNome());
            estoque.setQuantidade(estoqueDTO.getQuantidade());
            estoque.setValor(estoqueDTO.getValor());

            estoqueService.salvarEstoque(estoque);
        }

        @GetMapping("/estoque/{id}")
        @ApiOperation(value = "Retornar estoque")
        public ResponseEntity<?> pegarItemPeloId(@PathVariable("id") Long id) {
            Estoque estoque = estoqueService.getEstoqueById(id);
            return new ResponseEntity<>(estoque, HttpStatus.OK);
        }

        @PutMapping("/estoque/atualizar")
        @ApiOperation(value = "Atualizar Estoque")
        public Estoque atualizarEstoque(@RequestBody Estoque estoque) {
            return estoqueService.atualizarEstoque(estoque);}

        @DeleteMapping("/estoque/excluir/{id}")
        @ApiOperation(value = "Deletar estoque")
        public void deleteEstoque(@PathVariable("id") Long id) {
            estoqueService.excluirEstoque(id);
        }

        @GetMapping("/todos")
        @ApiOperation(value = "Retornar uma lista do estoque")
        public List<Estoque> pegarTodosItensEstoque() {
            List<Estoque> estoques = estoqueService.pegarTodosItensEstoque();
            return estoques;
        }

    }

