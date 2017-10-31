package com.smael.SpringMySQLJPA.Resource;

import com.smael.SpringMySQLJPA.Entity.Membre;
import com.smael.SpringMySQLJPA.Repository.IMembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value ="/membre")
public class MembreResource {

    @Autowired
    IMembreRepository iMembreRepository;

    @GetMapping( value = "/all")
    public List<Membre> getAll(){
        return iMembreRepository.findAll();
    }
    @GetMapping( value = "/{lastname}")
    public List<Membre> findByName(@PathVariable final String lastname){
        return iMembreRepository.findByLastname(lastname);
    }

    @PostMapping(value = "/load")
    public List<Membre> persist(@RequestBody final Membre aMembre){
        iMembreRepository.save(aMembre);
        return iMembreRepository.findAll();

    }

    @PostMapping(value = "/load1")
    public List<Membre> load(@RequestBody final Membre aMembre){
        iMembreRepository.save(aMembre);
        return iMembreRepository.findByLastname(aMembre.getLastname());
    }
}
