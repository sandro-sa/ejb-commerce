package br.data.model;

import lombok.Data;

/**
 *
 * @author Sandro Amancio de Sá
 */
@Data
public class ItemCompra {
    
    private Produto produto;
    private int quantidade;
 
    public ItemCompra() {
    }

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
     
    }
}
