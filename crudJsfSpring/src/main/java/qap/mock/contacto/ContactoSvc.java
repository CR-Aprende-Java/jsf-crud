package qap.mock.contacto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author christian
 */
public class ContactoSvc implements IContactoSvc, Serializable {
        
    @Override
    public String getTestData() {

        return "JSF 2 + Spring 3 Integration";

    }
    
    @Override
    public List getItems(String propietario, String modulo) {
        
        return ContactoMock.mockList(propietario, modulo);
                
    }
    
}
