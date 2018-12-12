package bancodedados;
import fabricas.FabricaAbstrata;
import interfaces.Produto;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class bancoDados {
  
    private Connection con;
                
    public bancoDados(){
        try {
            con = DriverManager.getConnection("jdbc:sqlite:bancoDeDados.db");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private ResultSet getRS(String query){
        ResultSet rs = null;
        try{
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            return rs;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    /*
    public Iterator<FabricaAbstrata> getListaMarcas() {
        List<FabricaAbstrata> listaCliente = new ArrayList<FabricaAbstrata>();
        try{
            ResultSet rs = getRS("SELECT * FROM marcas");
            while(rs.next()){
                FabricaAbstrata novo = new FabricaAbstrata();
                novo.setNome(rs.getString("nome"));
                listaFabricaAbstrata.add(novo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return listaCliente.iterator();
    }
*/
    
    public void inserirCompra(Produto prod) {
        try {
            String p = "'"+prod.getNome()+"','"+prod.getDescricao()+"','"+prod.getPreco() + "'";
            String update = "INSERT INTO carrinho(nome,descricao,preco) VALUES("+p+")";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(update);  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
