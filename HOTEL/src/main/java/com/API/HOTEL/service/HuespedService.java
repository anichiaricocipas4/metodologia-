package com.API.HOTEL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.API.HOTEL.repository.HuespedRepository;
import com.API.HOTEL.model.Huesped;
import java.util.List;

@Service
public class HuespedService {
    @Autowired
    private HuespedRepository huespedRepository;
    //Mostrar Huesped.
    public List<Huesped> getALLHuespedes(){

        return huespedRepository.findAll();
    }
    //crear Huesped.
    public Huesped crearHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }
    //editar Huesped.
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }
    //eliminar Huesped.
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }
}
