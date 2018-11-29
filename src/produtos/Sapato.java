package produtos;
import interfaces.Produto;

public class Sapato implements Produto{
    //Atributos
    String nome = "SAPATO";
    String descricao = "SAPATO FLOWER T 40";
    float preco = (float)(120.00);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
    
}
