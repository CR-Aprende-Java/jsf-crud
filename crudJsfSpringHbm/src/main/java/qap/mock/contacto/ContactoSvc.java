package qap.mock.contacto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author christian
 */
public class ContactoSvc implements Serializable {
        
    protected ContactoDaoHbm dao;

    // Bean properties
    public void setDao(ContactoDaoHbm dao) {
        this.dao = dao;
    }

    public ContactoDaoHbm getDao() {
        return dao;
    }

    public String getTestData() {

        return "JSF/Primefaces 6.1 + Spring 4.3.10 + Hibernate 3.6 Integration";

    }
    
    public List getItems(String propietario, String modulo) {
        
        //return ContactoMock.mockList(propietario, modulo);
        return dao.findAll(propietario);
                
    }
    
}
