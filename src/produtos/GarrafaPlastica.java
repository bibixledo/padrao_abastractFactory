package produtos;
import interfaces.Produto;

public class GarrafaPlastica implements Produto{
    //Atributos
    String nome = "GARRAFA PLASTICA";
    String descricao = "GARRAFA PLÁTICA 1L AMARELA";
    float preco = (float)(55.00);
    
    //Metodos
    @Override
    public String getNome(){return nome;}
    @Override
    public String getDescricao(){return descricao;}
    @Override
    public float getPreco(){return preco;}
    
}
