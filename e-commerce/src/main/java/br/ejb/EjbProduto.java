package br.ejb;

import br.data.crud.CrudProduto;
import br.data.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author Sandro Amancio de Sá
 */
@Stateless
public class EjbProduto {

    public ArrayList<Produto> getAll(){
       return new CrudProduto().getAll();
   }
}
