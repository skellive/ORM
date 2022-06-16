package com.orm.test.SERVICE;

import com.orm.test.ENTITY.TbFacPersona;
import com.orm.test.INTERFACE.FacPersonaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FacPersonaRepository {
    @Autowired
    FacPersonaInterface personaInterface;

    public TbFacPersona getPersonaById1(int id){
        return personaInterface.findById(id).get();
    }
    public List<TbFacPersona> getAllPersona1(){
        List<TbFacPersona> persona = new ArrayList<TbFacPersona>();
        personaInterface.findAll().forEach(persona::add);
        return persona;
    }

    public void saveOrUpdate1(TbFacPersona persona){
        personaInterface.save(persona);
    }

    public void deletePersona1(int id){
        personaInterface.deleteById(id);
    }
}
