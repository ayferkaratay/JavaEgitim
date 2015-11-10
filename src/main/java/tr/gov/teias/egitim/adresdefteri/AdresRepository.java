/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Repository;
import tr.gov.teias.egitim.adresdefteri.entities.Adres;

/**
 *
 * @author ayfer
 */

@Repository
@Dependent
public abstract class AdresRepository extends AbstractEntityRepository<Adres,Long> {
    

/*@Inject 
private EntityManager em;
Public List<Adres> findByTckn(String tckn){
    return em.CreateQuery ("Select c from Adres c Where c.Tckn=:tckn")
            .setParameter("tckn",tckn)
            .GetResultList();
}*/

/**
 * Verilen tcknye göre adres kayıt listesini döndürür*
 * @param tckn 11 digit tckimlikno
 * @return eğer kayıt bulamzsa içi boşliste dödürür
 */

//Select c from Adres c Where c.Tckn=:tckn
    public abstract List<Adres> findByTckn(String tckn) ;
}
