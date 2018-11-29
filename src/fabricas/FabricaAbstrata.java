package fabricas;
import interfaces.Produto;
import fabricasconcretas.Electrolux;
import fabricasconcretas.Insecta;
import fabricasconcretas.Tupperware;

/*Lêdo*/

public abstract class FabricaAbstrata {
    //Atributos
    protected String marca;
    
    public static Object[] getListaDeFabricas(){
        Object[] lista = {"ELECTROLUX","INSECTA","TUPPERWARE"};
        return lista;
    }
    
    public String getMarca(){return marca;}
    public abstract Object[] getListaDeProdutos();
    public abstract Produto getProduto(String produto);
    
    public static FabricaAbstrata getInstance( String marca ) { 
        if( null == marca ) {
            return null; 
        }
        else switch (marca) {
            case "ELECTROLUX":
                return new Electrolux();
            case "INSECTA":
                return new Insecta();
            case "TUPPERWARE":
                return new Tupperware();
            default:
                return null;
        }
    }
    
}
