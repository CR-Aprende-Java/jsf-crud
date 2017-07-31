package qap.mock.contacto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author christian
 */
@ManagedBean(name="contactos") // creado en faces-config
@SessionScoped
public class ContactoJsf implements Serializable {
    // lista
    private final CrudFilterOptions filter;
    private List items;
    private Contacto selected;

    public ContactoJsf() {
        this.filter = filterOptions();
    }

    public CrudFilterOptions getFilter() {
        return filter;
    }

    public List<Contacto> getItems() {
        if (items == null) {
            items = ContactoMock.mockList("demo", "Alumnos");
            //items = svc.getItems("demo", "Alumnos");
        }
        return items;
    }

    public Contacto getSelected() {
        return selected;
    }

    public void setSelected(Contacto selected) {
        this.selected = selected;
    }

    public void refresh() {
        //nada x ahora
    }

    // filter
    static public CrudFilterOptions filterOptions() {
        CrudFilterOptions filter = new CrudFilterOptions();
        
        filter.setModulos(    Arrays.asList("Alumnos", "Docentes") );
        filter.setCategorias( Arrays.asList("Activo", "Inactivo") );
        filter.setEtiquetas(  Arrays.asList("Matematica II - 2017", "Historia I - 2016", "Geografia I - 2016") );
        filter.setVistas(     Arrays.asList("Fotos", "Lista", "Info") );
        
        return filter;
    }
    
}
