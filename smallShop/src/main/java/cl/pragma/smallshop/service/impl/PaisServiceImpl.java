/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.service.impl;

import cl.pragma.smallshop.dao.beans.domain.Pais;
import cl.pragma.smallshop.repository.PaisRepository;
import cl.pragma.smallshop.service.PaisService;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mberoiza
 */
public class PaisServiceImpl implements PaisService{
    
    private PaisRepository paisRep;

    public void setPaisRepository(PaisRepository paisRepo) {
        this.paisRep = paisRepo;
    }
    
    @Override
    @Transactional
    public void addPais(Pais p) {
        this.paisRep.save(p);
    }

    @Override
    @Transactional
    public void updatePais(Pais p) {
        this.paisRep.save(p);
    }

    @Override
    @Transactional
    public Iterable<Pais> listPaises() {
        return this.paisRep.findAll();
    }

    @Override
    @Transactional
    public Pais getPais(String id) {
        return this.paisRep.findOne(id);
    }

    @Override
    @Transactional
    public void removePais(String id) {
        this.paisRep.delete(id);
    }
    
}
