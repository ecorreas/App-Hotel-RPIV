package com.rp4.hotelaria.ServiceImplements;

import com.rp4.hotelaria.interfaces.IHotelService;
import com.rp4.hotelaria.model.Hotel;
import com.rp4.hotelaria.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class HotelServiceImplements implements IHotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImplements(HotelRepository hotelR){
        this.hotelRepository = hotelR;

    }

    @Override
    @Transactional
    public void salvarHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }
}
