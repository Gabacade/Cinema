
package wiew;

import Controle.CrudC;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class AtualizarCinema extends JFrame  {

         JLabel labelnome = new JLabel("Digite o Nome do Cinema: ");
         JTextField textFieldnome = new JTextField();
         JLabel labelcodigo = new JLabel("Digite o codigo do cinema");
         JTextField textFieldcodigo = new JTextField();    
         JButton voltar= new JButton("Voltar");    
         JButton consultarcinema= new JButton("Consultar Cinema");    

         
    

    public AtualizarCinema(){
    super("Atualização de Cinema");
     setLayout(new FlowLayout());
     setDefaultCloseOperation(DISPOSE_ON_CLOSE);
     setLocationRelativeTo(null);

             add(labelnome);
             textFieldnome.setColumns(25);
             add(textFieldnome);
             
             add(labelcodigo);
             textFieldcodigo.setColumns(25);
             add(textFieldcodigo); 
             
             add(voltar);
             add(consultarcinema); 
             
             voltar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     CrudC crudc= new CrudC();
                     crudc.setVisible(true);
                     setVisible(false);
                     }
            });
             
             consultarcinema.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     AtualizarFilme af= new AtualizarFilme();
                     af.setSize(400,500);
                     af.setVisible(true);
                     setVisible(false);
                     }
            });
                     

    }    
      
}
