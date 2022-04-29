package com.example.skucise.webserving;

import com.example.skucise.modeli.Oglas;
import com.example.skucise.repository.AdvertisementRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@RestController
public class AdvertisementController
{
    AdvertisementRepository advrRepo = new AdvertisementRepository();

    @GetMapping(value = "/")
    @CrossOrigin(origins = "http://localhost:4200/")
    public ResponseEntity<List<Oglas>> getAll() throws SQLException {

        List<Oglas> listaOglasa =  advrRepo.gettAllAdvertisiment();
        if(listaOglasa == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(listaOglasa);
    }
}
