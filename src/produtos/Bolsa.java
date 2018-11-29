package produtos;
import interfaces.Produto;

public class Bolsa implements Produto{
    //Atributos
    String nome = "BOLSA";
    String descricao = "BOLSA ECOBAG - GG";
    float preco = (float)(45.00);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
    
}
