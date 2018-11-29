package produtos;
import interfaces.Produto;

public class Potinho implements Produto {
    //Atributos
    String nome = "POTINHO";
    String descricao = "POTINHO ECO 250ml";
    float preco = (float)(23.00);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
    
}
