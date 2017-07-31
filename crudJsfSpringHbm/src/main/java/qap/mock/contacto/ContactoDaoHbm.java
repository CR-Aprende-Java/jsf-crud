package qap.mock.contacto;

import java.io.Serializable;
import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 *
 * @author christian
 */
public class ContactoDaoHbm extends HibernateDaoSupport implements Serializable {
    
    public List findAll(String owner) {
        String hquery = "from Contacto where propietario = 'demo'";

        return getHibernateTemplate().find( hquery );
    }
    
}
