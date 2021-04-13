package com.rp4.reservaservice.repository;

import com.rp4.reservaservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
