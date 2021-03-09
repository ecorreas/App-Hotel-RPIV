package com.rp4.hotelaria.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp4.hotelaria.dto.HotelDTO;
import com.rp4.hotelaria.interfaces.IHotelService;
import com.rp4.hotelaria.model.Hotel;

@RestController
@RequestMapping("/api/hoteis")
public class HotelController {
    private IHotelService hotelService;

    public HotelController(IHotelService service){
        this.hotelService = service;
    }

    @PostMapping("/salvar")
    public void saveHotel(@RequestBody HotelDTO hotelDTO){
        Hotel hotel = new Hotel();
        hotel.setCidade(hotelDTO.getCidade());
        hotel.setDescricao(hotelDTO.getDescricao());
        hotel.setNumeroQuarto(hotelDTO.getNumeroQuarto());
        hotel.setEndereco(hotelDTO.getEndereco());
        hotel.setPreco(hotelDTO.getPreco());
        hotel.setStatus(hotelDTO.getStatus());
        hotelService.salvarHotel(hotel);
    }

    @GetMapping("/hotel/{id}")
    public ResponseEntity<?> pegarHotelPeloId(@PathVariable("id")Long id){
    	Hotel hotel = hotelService.getHotelById(id);
    	return new ResponseEntity<> (hotel, HttpStatus.OK);
    }
    
    @PutMapping("/hotel/atualizar")
    public Hotel atualizarHotel(@RequestBody Hotel hotel) {
    	return hotelService.atualizarHotel(hotel);
    }
    
    @DeleteMapping("/hotel/excluir/{id}")
    public void deleteHotel(@PathVariable("id")Long id) {
    	hotelService.excluirHotel(id);
    }

    @GetMapping("/todos")
    public List<Hotel> pegarTodosHoteis(){
    	List<Hotel> hoteis = hotelService.pegarTodosHoteis();
    	return hoteis;
    }
    
}
