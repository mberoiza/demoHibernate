/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.service;

import cl.pragma.smallshop.dao.beans.domain.Pais;
import java.util.List;

/**
 *
 * @author mberoiza
 */
public interface PaisService {
    
    public void addPais(Pais p);
    public void updatePais(Pais p);
    public Iterable<Pais> listPaises();
    public Pais getPais(String id);
    public void removePais(String id);
}
