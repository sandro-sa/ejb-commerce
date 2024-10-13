package br.data.crud;

import br.data.model.ItemCompra;
import br.data.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateful;

/**
 *
 * @author Sandro Amancio de sa
 */
@Stateful
public class EjbCompra {

    private final ArrayList<ItemCompra> listaDeCompra;

    public EjbCompra() {
        listaDeCompra = new ArrayList<>();
    }

    public void add(Produto produto) {
        boolean achou = false;
        for (ItemCompra itemCompra : listaDeCompra) {
            if (itemCompra.getProduto().getCodigo() == produto.getCodigo()) {
                itemCompra.setQuantidade(itemCompra.getQuantidade() + 1);
                achou = true;
                break;
            }
        }
        if (!achou) {
            listaDeCompra.add(new ItemCompra(produto, 1));
        }
    }

   public void remove(Produto produto) {
    for (ItemCompra itemCompra : listaDeCompra) {
        if (itemCompra.getProduto().getCodigo() == produto.getCodigo()) {
            if (itemCompra.getQuantidade() > 1) {
                itemCompra.setQuantidade(itemCompra.getQuantidade() - 1);
            } else {
                listaDeCompra.remove(itemCompra);
            }
            break; 
        }
    }
}

    public ArrayList<ItemCompra> getAll() {
        return listaDeCompra;
    }
}
