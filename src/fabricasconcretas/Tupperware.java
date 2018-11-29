package fabricasconcretas;
import produtos.GarrafaPlastica;
import produtos.Potinho;
import interfaces.Produto;
import fabricas.FabricaAbstrata;

public class Tupperware extends FabricaAbstrata{
    
    public Tupperware(){
        marca = "TUPPERWARE";
    }
    @Override
    public Object[] getListaDeProdutos(){
        Object[] lista = {"GARRAFA PLASTICA","POTINHO"};
        return lista;
    }
    @Override
    public Produto getProduto( String modelo ) { 
        if( null == modelo ) {
            return null; 
        }
        else switch (modelo) {
            case "GARRAFA PLASTICA":
                return new GarrafaPlastica();
            case "POTINHO":
                return new Potinho();
            default:
                return null; 
        } 
    }
}
