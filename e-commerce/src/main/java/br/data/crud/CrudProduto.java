package br.data.crud;

import br.data.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Sandro Amancio de Sá
 */
public class CrudProduto {
    
      public ArrayList<Produto> getAll(){
        
       ArrayList<Produto> listaDeProdutos = new ArrayList<>();
       listaDeProdutos.add(new Produto(1, "Computador"));
       listaDeProdutos.add(new Produto(2, "Notebook"));
       listaDeProdutos.add(new Produto(3, "Workstation"));
       listaDeProdutos.add(new Produto(4, "Servidor"));
       return listaDeProdutos;
    } 
}
