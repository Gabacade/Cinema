package wiew;
import Controle.CrudC;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExcluirCinema extends JFrame{
    JLabel labelcodigo = new JLabel("Codigo do Cinema:");
    JTextField textFieldcodigo = new JTextField();
    JLabel labelCNPJ = new JLabel("CNPJ do Cinema:");
    JTextField textFieldCNPJ = new JTextField();
    JButton excluir = new JButton("Excluir Cinema");
    JButton voltar = new JButton("Voltar");
            
    public ExcluirCinema(){
    super("Excluir Cinema");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());
    
     add(labelcodigo);
             textFieldcodigo.setColumns(25);
             add(textFieldcodigo); 
              add(labelCNPJ);
             textFieldCNPJ.setColumns(25);
             add(textFieldCNPJ); 
             add(excluir);
             add(voltar);
             
              voltar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     CrudC crudc= new CrudC();
                     crudc.setVisible(true);
                     setVisible(false);
                     }
            });
}
}