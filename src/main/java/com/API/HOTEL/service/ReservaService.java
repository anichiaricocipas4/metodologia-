package com.API.HOTEL.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.API.HOTEL.model.Reserva;
import com.API.HOTEL.repository.ReservaRepository;

@Service

public class ReservaService {
 @Autowired
    private ReservaRepository reservaRepository;

    // Mostrar Reservas.
    public List<Reserva> getAllHuesped() {
        return reservaRepository.findAll();
    }
    // Crear Reserva.
    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    // Editar Reserva.
    public Reserva updateReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    // Eliminar Reserva.
    public void deleteReservaById(Long id) {
        reservaRepository.deleteById(id);
    }
}
