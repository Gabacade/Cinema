
package wiew;

import entidade.Ingressos;
import bancoDAO.CinemaDAO;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class VendadeIngressos extends JFrame{
JLabel preco = new JLabel("Preço: ");
JTextField preco2 = new JTextField();
JLabel sala = new JLabel("  Sala : ");
JTextField sala2 = new JTextField(); 
JLabel data = new JLabel(" Data : ");
JTextField data2 = new JTextField();
JLabel sessao = new JLabel("Sessão: ");
JTextField sessao2 = new JTextField();
JLabel tipoticket = new JLabel("Ingresso: ");
JTextField tipoticket2 = new JTextField();
JLabel acento = new JLabel(" Acento: ");
JTextField acento2 = new JTextField();
JButton voltar= new JButton("Voltar");    
JButton cadastrar= new JButton("comprar Ingresso");    
        
    Ingressos ingres = new Ingressos();
    CinemaDAO cineDAO = new CinemaDAO();

public VendadeIngressos(){
       super("Venda de Ingressos"); 
        setLayout(new FlowLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
       
             add(preco);
             preco2.setColumns(20);
             add(preco2);
             
             add(sala);
             sala2.setColumns(20);
             add(sala2);
                             
             add(data);
             data2.setColumns(20);
             add(data2);
             
             add(sessao);
             sessao2.setColumns(20);
             add(sessao2);
             
             add(tipoticket);
             tipoticket2.setColumns(20);
             add(tipoticket2);
             
             add(acento);
             acento2.setColumns(20);
             add(acento2);
     
     
            add(voltar);
             voltar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     ConsultarCinema cc= new ConsultarCinema();
                     cc.setSize(500, 500);
                     cc.setVisible(true);
                     setVisible(false);
                     }
            });
                     
             add(cadastrar);
             cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    cineDAO.inseriringresso(ingres);
                    ingres.setPreco(Integer.parseInt(preco2.getText()));
                    ingres.setSessao(Integer.parseInt(sessao2.getText()));
                    ingres.setTicket((tipoticket2.getText()));
                    ingres.setData(Integer.parseInt(data2.getText()));
                    ingres.setAcento(Integer.parseInt(acento2.getText()));
                    ingres.setAcento(Integer.parseInt(sala2.getText()));


                    JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");

                } catch (HeadlessException | NumberFormatException errow) {
                    JOptionPane.showMessageDialog(null, "houve um erro no cadastro " + e);
                } catch (SQLException ex) {
                    Logger.getLogger(VendadeIngressos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

   

    }

          private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            try {
                cineDAO.inseriringresso(ingres);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            cineDAO.inseriringresso(ingres);
                    ingres.setPreco(Integer.parseInt(preco2.getText()));
                    ingres.setSessao(Integer.parseInt(sessao2.getText()));
                    ingres.setTicket((tipoticket2.getText()));
                    ingres.setData(Integer.parseInt(data2.getText()));
                    ingres.setAcento(Integer.parseInt(acento2.getText()));
                    ingres.setAcento(Integer.parseInt(sala2.getText()));


            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "houve um erro no cadastro " + e);
        }

    }
}

            
                     


    
      

    

