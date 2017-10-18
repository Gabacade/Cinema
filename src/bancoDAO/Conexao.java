package bancoDAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection con;

    private Statement stm;

    //objeto para conexão com banco de dados
    private String usuario = "root";
    private String senha = "";
    private String url = "jdbc:mysql://localhost/cinema";
    private String driver = "com.mysql.jdbc.Driver";

    public void conecta() throws ClassNotFoundException {
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, usuario, senha);
            stm = (Statement) con.createStatement();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "houve um erro na conexão\n" + erro);
        }
    }
    
    public void desconecta(){
        try {
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "houve um erro na desconexão\n" + erro);
        }
    
    }

}
