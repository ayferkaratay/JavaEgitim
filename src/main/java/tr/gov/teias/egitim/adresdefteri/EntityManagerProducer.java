/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ayfer
 */
public class EntityManagerProducer {
    
    @PersistenceContext(name="AdresDefteriPU")
    private EntityManager entitiyManager;
    
    @Produces
    public EntityManager produceEntityManager(){
        return entitiyManager;
        
    }  
    
}
