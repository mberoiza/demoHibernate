/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.service.impl;

import cl.pragma.smallshop.dao.RegionDAO;
import cl.pragma.smallshop.dao.beans.domain.Region;
import cl.pragma.smallshop.service.RegionService;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mberoiza
 */
public class RegionServiceImpl implements RegionService{
    
    private RegionDAO regionDAO;

    public void setRegionDAO(RegionDAO regionDAO) {
        this.regionDAO = regionDAO;
    }
    
    @Override
    @Transactional
    public void addRegion(Region r) {
        this.regionDAO.addRegion(r);
    }

    @Override
    @Transactional
    public void updateRegion(Region r) {
        this.regionDAO.updateRegion(r);
    }

    @Override
    @Transactional
    public List<Region> listRegiones() {
        return this.regionDAO.listRegiones();
    }

    @Override
    @Transactional
    public Region getRegion(Integer id) {
        return this.regionDAO.getRegion(id);
    }

    @Override
    @Transactional
    public void removeRegion(Integer id) {
        this.regionDAO.removeRegion(id);
    }
    
}
