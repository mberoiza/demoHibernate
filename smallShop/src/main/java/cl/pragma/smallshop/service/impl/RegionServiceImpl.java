/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.service.impl;

import cl.pragma.smallshop.dao.beans.domain.Region;
import cl.pragma.smallshop.repository.RegionRepository;
import cl.pragma.smallshop.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mberoiza
 */
@Service
public class RegionServiceImpl implements RegionService{
    
    private RegionRepository regionRepo;
    
    @Autowired(required=true)
    @Qualifier(value="regionRepository")
    public void setRegionRepository(RegionRepository regionRepo) {
        this.regionRepo = regionRepo;
    }
    
    @Override
    @Transactional
    public void addRegion(Region r) {
        this.regionRepo.save(r);
    }

    @Override
    @Transactional
    public void updateRegion(Region r) {
        this.regionRepo.save(r);
    }

    @Override
    @Transactional
    public Iterable<Region> listRegiones() {
        return this.regionRepo.findAll();
    }

    @Override
    @Transactional
    public Region getRegion(Integer id) {
        return this.regionRepo.findOne(id);
    }

    @Override
    @Transactional
    public void removeRegion(Integer id) {
        this.regionRepo.delete(id);
    }
    
}
