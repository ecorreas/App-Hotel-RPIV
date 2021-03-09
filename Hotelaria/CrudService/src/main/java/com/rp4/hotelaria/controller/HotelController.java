package com.rp4.hotelaria.controller;

import com.rp4.hotelaria.dto.HotelDTO;
import com.rp4.hotelaria.interfaces.IHotelService;
import com.rp4.hotelaria.model.Hotel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hoteis")
public class HotelController {
    private IHotelService hotelService;

    public HotelController(IHotelService service){

        this.hotelService = service;
    }
    @PostMapping("/hotel")
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
}
