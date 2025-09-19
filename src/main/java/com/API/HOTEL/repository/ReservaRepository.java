package com.API.HOTEL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.API.HOTEL.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
