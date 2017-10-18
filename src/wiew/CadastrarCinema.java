package wiew;

import Controle.CrudC;
import bancoDAO.CinemaDAO;
import entidade.Cinemas;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class CadastrarCinema extends JFrame {

    JLabel labelnome = new JLabel(" Nome do cinema: ");
    JTextField textFieldnome = new JTextField();
    JLabel labelCNPJ = new JLabel("CNPJ do Cinema:");
    JTextField textFieldCNPJ = new JTextField();
    JLabel lbEndereco = new JLabel(" Endereço do cinema: ");
    JTextField tbEndereco = new JTextField();
    JLabel cidade = new JLabel(" Cidade  do cinema: ");
    JTextField cidade2 = new JTextField();
    JLabel referencia = new JLabel(" Referencia  do cinema: ");
    JTextField referencia2 = new JTextField();
    JLabel cep = new JLabel(" CEP  do cinema: ");
    JTextField cep2 = new JTextField();
    JLabel proprietario = new JLabel("Proprietario do cinema:");
    JTextField proprietario2 = new JTextField();
    JLabel proprietariocpf = new JLabel("CPF do Proprietario:");
    JTextField tbPropCpf = new JTextField();
    JLabel proprietarioid = new JLabel("Identidade do Proprietario:");
    JTextField proprietarioid2 = new JTextField();
    JButton voltar = new JButton("Voltar");
    JButton cadastrar = new JButton("Cadastrar");

    Cinemas cine = new Cinemas();
    CinemaDAO cineDAO = new CinemaDAO();


    public CadastrarCinema() {
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   setLayout(new FlowLayout());
   setLocationRelativeTo(null);    
    
        add(labelnome);
        textFieldnome.setColumns(20);
        
        add(textFieldnome);
          
        add(labelCNPJ);
        textFieldCNPJ.setColumns(20);
        add(textFieldCNPJ);

        add(lbEndereco);
        tbEndereco.setColumns(20);
        tbEndereco.setLayout(null);
        add(tbEndereco);

        add(cidade);
        cidade2.setColumns(20);
        add(cidade2);

        add(referencia);
        referencia2.setColumns(20);
        add(referencia2);

        add(cep);
        cep2.setColumns(20);
        add(cep2);

        add(proprietario);
        proprietario2.setColumns(20);
        add(proprietario2);

        add(proprietariocpf);
        tbPropCpf.setColumns(20);
        add(tbPropCpf);
        

        add(proprietarioid);
        proprietarioid2.setColumns(20);
        add(proprietarioid2);
        
        voltar.getComponentAt(50, 50);
        add(voltar);
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrudC crudc = new CrudC();
                crudc.setVisible(true);
                setVisible(false);
            }
        });
        
        cadastrar.getComponentAt(30, 30);
        add(cadastrar);
        
       cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        cineDAO.inserir(cine);
                    } catch (SQLException erro) {
                        JOptionPane.showMessageDialog(null, erro);
                    }
                    cine.setNomeCinema(textFieldnome.getText());
                    cine.setCnpjCinema(Long.parseLong(textFieldCNPJ.getText()));
                    cine.setEnderecoCinema(tbEndereco.getText());
                    cine.setCidadeCinema(cidade2.getText());
                    cine.setRefCinema(referencia2.getText());
                    cine.setCepCinema(Long.parseLong(cep2.getText()));
                    cine.setPropCinema(proprietario2.getText());
                    cine.setCpfPropCinema(Long.parseLong(tbPropCpf.getText()));
                    cine.setRgPropCinema(Integer.parseInt(proprietarioid2.getText()));

                    JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");

                } catch (HeadlessException | NumberFormatException errow) {
                    JOptionPane.showMessageDialog(null, "houve um ero no cadastro " + e);
                }
            }
        });

        

    }

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            try {
                cineDAO.inserir(cine);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            cine.setNomeCinema(textFieldnome.getText());
            cine.setCnpjCinema(Long.parseLong(textFieldCNPJ.getText()));
            cine.setEnderecoCinema(tbEndereco.getText());
            cine.setCidadeCinema(cidade2.getText());
            cine.setRefCinema(referencia2.getText());
            cine.setCepCinema(Long.parseLong(cep2.getText()));
            cine.setPropCinema(proprietario2.getText());
            cine.setCpfPropCinema(Long.parseLong(tbPropCpf.getText()));
            cine.setRgPropCinema(Integer.parseInt(proprietarioid2.getText()));

            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "houve um ero no cadastro " + e);
        }

    }
}
