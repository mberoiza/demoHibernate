package cl.pragma.smallshop.dao;


import cl.pragma.smallshop.dao.beans.domain.Region;
import java.util.List;

/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */

/**
 *
 * @author mberoiza
 */
public interface RegionDAO {
    
    public void addRegion(Region r);
    public void updateRegion(Region r);
    public List<Region> listRegiones();
    public Region getRegion(Integer id);
    public void removeRegion(Integer id);
}
