/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.pragma.smallshop.repository;

import cl.pragma.smallshop.dao.beans.domain.Region;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mberoiza
 */
public interface RegionRepository extends CrudRepository<Region, Integer> {
    
}
