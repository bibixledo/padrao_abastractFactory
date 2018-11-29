package fabricasconcretas;

import produtos.Bolsa;
import produtos.Sapato;
import interfaces.Produto;
import fabricas.FabricaAbstrata;

public class Insecta extends FabricaAbstrata {
    
    public Insecta(){
        marca = "INSECTA";
    }
    @Override
    public Object[] getListaDeProdutos(){
        Object[] lista = {"BOLSA","SAPATO"};
        return lista;
    }
    @Override
    public Produto getProduto( String modelo ) { 
        if( null == modelo ) {
            return null; 
        }
        else switch (modelo) {
            case "BOLSA":
                return new Bolsa();
            case "SAPATO":
                return new Sapato();
            default:
                return null; 
        } 
    }
    
}
