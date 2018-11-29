package fabricasconcretas;

import produtos.Fogao;
import produtos.Geladeira;
import interfaces.Produto;
import fabricas.FabricaAbstrata;

public class Electrolux extends FabricaAbstrata {
    
    public Electrolux(){
        marca = "ELECTROLUX";
    }
    
    @Override
     public Object[] getListaDeProdutos(){
        Object[] lista = {"FOGAO","GELADEIRA"};
        return lista;
    }
    @Override
    public Produto getProduto( String modelo ) { 
        if( modelo == null ) {
            return null;
        } else switch (modelo) {
            case "FOGAO":
                return new Fogao();
            case "GELADEIRA":
                return new Geladeira();
            default:
                return null;
        } 
    }
    
}
