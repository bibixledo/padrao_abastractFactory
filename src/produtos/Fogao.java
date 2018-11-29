package produtos;
import interfaces.Produto;

public class Fogao implements Produto{
    //Atributos
    String nome = "FOGAO";
    String descricao = "FOGAO 5 BOCAS";
    float preco = (float)(950.00);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
}
