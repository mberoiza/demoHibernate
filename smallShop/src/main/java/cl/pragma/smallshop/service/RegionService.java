/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.service;

import cl.pragma.smallshop.dao.beans.domain.Region;

/**
 *
 * @author mberoiza
 */
public interface RegionService {
    
    public void addRegion(Region r);
    public void updateRegion(Region r);
    public Iterable<Region> listRegiones();
    public Region getRegion(Integer id);
    public void removeRegion(Integer id);
}
