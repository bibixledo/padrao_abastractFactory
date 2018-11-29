package produtos;
import interfaces.Produto;

public class Geladeira implements Produto {
    //Atributos
    String nome = "GELADEIRA";
    String descricao = "GELADEIRA SIDE BY SIDE 504L";
    float preco = (float)(7625.49);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
    
}
