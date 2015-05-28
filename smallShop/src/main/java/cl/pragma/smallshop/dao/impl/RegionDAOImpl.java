package cl.pragma.smallshop.dao.impl;


import cl.pragma.smallshop.dao.RegionDAO;
import cl.pragma.smallshop.dao.beans.domain.Region;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

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
@Repository
public class RegionDAOImpl implements RegionDAO{
    
    private static final Logger log = LoggerFactory.getLogger(RegionDAOImpl.class);
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    
    @Override
    public void addRegion(Region r) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(r);
        log.info("Region guardada de forma correcta, Detalles="+r);
    }

    @Override
    public void updateRegion(Region r) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(r);
        log.info("Region actualizada de forma correcta, Detalles="+r);
    }

    @Override
    public List<Region> listRegiones() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Region> regionList = session.createQuery("from Region").list();
        for(Region r : regionList){
            log.info("Region List::"+r);
        }
        return regionList;
    }

    @Override
    public Region getRegion(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();      
        Region r = (Region) session.load(Region.class, id);
        log.info("Region cargada correctamente, detailles="+r);
        return r;
    }

    @Override
    public void removeRegion(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Region r = (Region) session.load(Region.class, id);
        if(null != r){
            session.delete(r);
        }
        log.info("Region eliminado correctamente, detalles="+r);
    }
    
}
