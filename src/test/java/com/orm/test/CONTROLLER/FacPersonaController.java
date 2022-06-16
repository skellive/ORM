package com.orm.test.CONTROLLER;

import com.orm.test.ENTITY.TbFacPersona;
import com.orm.test.SERVICE.FacPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacPersonaController {
    @Autowired
    FacPersonaRepository person;


    @GetMapping("/listaPersona")
    public List<TbFacPersona> getAllPersona(){
        return person.getAllPersona1();
    }

    @GetMapping("/listaFiltro/{id}")
    public TbFacPersona getPersona(@PathVariable("id") int id){
        return person.getPersonaById1(id);
    }

    @PostMapping("/personaAdd")
    public void addPersona(@RequestBody TbFacPersona persona){
        person.saveOrUpdate1(persona);
    }

    @PutMapping("/personaUpdate")
    public void updatePersona(@RequestBody TbFacPersona persona){
        person.saveOrUpdate1(persona);
    }

}
