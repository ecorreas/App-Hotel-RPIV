package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.TurismoDTO;
import com.rp4.hotelaria.interfaces.ITurismoService;
import com.rp4.hotelaria.model.Turismo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/turismos")
public class TurismoController{
    private ITurismoService turismoService;

    @Autowired
    public TurismoController(ITurismoService service){ this.turismoService = service; }

    @PostMapping("/salvar")
    @ApiOperation(value = "Salvar Passeio Turistico")
    public void cadastrarTurismo(@RequestBody TurismoDTO turismoDTO){
        Turismo turismo = new Turismo();
        turismo.setIdTurismo(turismoDTO.getIdTurismo());
        turismo.setHotel(turismoDTO.getHotel());
        turismo.setHora(turismoDTO.getHora());
        turismo.setData(turismoDTO.getData());

        turismoService.cadastrarTurismo(turismo);
    }


    @GetMapping("/turismo/{id}")
    @ApiOperation(value = "Retornar Passeios")
    public ResponseEntity<?> getTurismoById(@PathVariable("id")Long id){
        Turismo turismo = turismoService.getTurismoById(id);
        return new ResponseEntity<> (turismo, HttpStatus.OK);
    }


    @PutMapping("/turismo/atualizar")
    @ApiOperation(value = "Atualizar Passeio Turistico")
    public Turismo atualizarTurismo(@RequestBody Turismo turismo) {
        return turismoService.atualizarTurismo(turismo);
    }

    @DeleteMapping("/turismo/excluir/{id}")
    @ApiOperation(value = "Deletar Passeio Turistico")
    public void deleteTurismo(@PathVariable("id")Long id) {
        turismoService.excluirTurismo(id);
    }

    @GetMapping("/todos")
    @ApiOperation(value = "Retornar uma lista de passeios")
    public List<Turismo> pegarTodosPasseios(){
        List<Turismo> turismos = turismoService.pegarTodosPasseios();
        return turismos;
    }

}
