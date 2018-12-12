package fabricas;
import interfaces.Produto;
import bancodedados.bancoDados;
import javax.swing.JOptionPane;

public class Padrao_AbstractFactory {

     public static void imprimir(Produto obj, String marca){
        String saida = "Marca: " + marca + "\n";
        saida += "Produto: " + obj.getNome() + "\n";
        saida += "Descrição" + obj.getDescricao() + "\n";
        saida += "Preco: R$ " + obj.getPreco();
        JOptionPane.showMessageDialog(null, saida);
    }
     
    public static void main(String[] args) {
        bancoDados bd = new bancoDados();
        boolean controle1 = true;
        Object tipoDaFabrica;
        Object[] opcoesDeFabricas = FabricaAbstrata.getListaDeFabricas();
        do{
            tipoDaFabrica = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoesDeFabricas,
                                opcoesDeFabricas[2]);
            
            FabricaAbstrata objFabricaAbstrata = FabricaAbstrata.getInstance(tipoDaFabrica.toString());
            
            String fabrica = objFabricaAbstrata.getMarca();
            boolean controle2 = true;
            Object objetoDoProduto;
            Object[] opcoesDeProdutos = objFabricaAbstrata.getListaDeProdutos();
            do{
                objetoDoProduto = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoesDeProdutos,
                                opcoesDeProdutos[0]);
            if(objetoDoProduto==null) controle2=false;
            else{
                Produto objetoProduto = objFabricaAbstrata.getProduto(objetoDoProduto.toString());
                imprimir(objetoProduto, fabrica);
                bd.inserirCompra(objetoProduto);
            }
           }while(controle2); 
            
        }while(controle1);
        
    } // fim do main
    
}
