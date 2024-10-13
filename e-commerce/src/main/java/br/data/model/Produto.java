package br.data.model;
import lombok.Data;

/**
 *
 * @author Sandro Amancio de Sá
 */
@Data
public class Produto {
    private int codigo;
    private String descricao;


    public Produto() { }
     
    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
 
    } 
}