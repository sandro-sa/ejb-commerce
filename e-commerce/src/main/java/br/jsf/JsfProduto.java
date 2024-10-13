package br.jsf;

import br.data.model.Produto;
import br.ejb.EjbProduto;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Sandro Amancio de Sá
 */
@Named(value = "jsfProduto")
@RequestScoped
public class JsfProduto {

    @EJB
    private EjbProduto ejbProduto;

    /**
     * Creates a new instance of JsfProduto
     */
    public JsfProduto() {
    }
    
    public ArrayList<Produto> getAll(){
        return ejbProduto.getAll();
    }
    
}
