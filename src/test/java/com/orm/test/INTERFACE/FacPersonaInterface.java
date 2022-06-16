package com.orm.test.INTERFACE;

import com.orm.test.ENTITY.TbFacPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacPersonaInterface extends CrudRepository<TbFacPersona, Integer> {
}
