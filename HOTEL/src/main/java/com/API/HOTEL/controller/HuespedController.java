package com.API.HOTEL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.API.HOTEL.service.HuespedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.API.HOTEL.model.Huesped;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;



@RestController
@RequestMapping("api/v1/huespedes")   

public class HuespedController {
    @Autowired
    private HuespedService huespedService;
    //get
    @GetMapping
    public List<Huesped> getALLHuesped(){
        return huespedService.getALLHuespedes();
    }
    //post
    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped){
        return huespedService.crearHuesped(huesped); 
    }
    //put
    @PostMapping("editar/{id}")
    public Huesped update(@RequestBody Huesped huesped,@PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }
    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
    
}
