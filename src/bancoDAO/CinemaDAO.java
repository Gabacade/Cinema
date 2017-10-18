package bancoDAO;

import entidade.Cinemas;
import entidade.Ingressos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CinemaDAO {

    Conexao con = new Conexao();
    Cinemas cine = new Cinemas();
    Ingressos ingres= new Ingressos();
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;




    public void inserir(Cinemas cine) throws SQLException {
        sql = "INSERT INTO cinemas(nomeCinema, cnpjCinema, enderecoCinema, cidadeCinema, refCinema, cepCinema, propCinema,cpfPropCinema, rgPropCinema) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            con.conecta();
            ps = (PreparedStatement) con.con.prepareStatement(sql);
            ps.setString(1, cine.getNomeCinema());
            ps.setLong(2, cine.getCnpjCinema());
            ps.setString(3, cine.getEnderecoCinema());
            ps.setString(4, cine.getCidadeCinema());
            ps.setString(5, cine.getRefCinema());
            ps.setLong(6, cine.getCepCinema());
            ps.setString(7, cine.getPropCinema());
            ps.setLong(8, cine.getCpfPropCinema());
            ps.setInt(9, cine.getRgPropCinema());
            ps.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar cinema \n"+e);
        } finally {
            con.desconecta();
            ps.close();
        };

    }


public void inseriringresso(Ingressos ingres) throws SQLException {
        sql = "INSERT INTO ingressos( preco, data, sessao, tipoticket, acento, sala) VALUES (?,?,?,?,?,?)";
        try {
            con.conecta();
            ps = (PreparedStatement) con.con.prepareStatement(sql);
            ps.setInt(1,  ingres.getPreco());
            ps.setInt(2, ingres.getData());
            ps.setInt(3, ingres.getSessao());
            ps.setString(4, ingres.getTicket());
            ps.setInt(5, ingres.getAcento());
            ps.setInt(6, ingres.getSala());

            ps.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar cinema \n"+e);
        } finally {
            con.desconecta();
            ps.close();
        };
    

}
}