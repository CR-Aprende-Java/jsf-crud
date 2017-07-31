package qap.mock.contacto;

import java.util.List;

/**
 *
 * @author christian
 */
public interface IContactoSvc {
    public String getTestData();    
    public List getItems(String propietario, String modulo);
}
