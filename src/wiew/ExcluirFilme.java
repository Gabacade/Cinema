
package wiew;

import Controle.CrudC;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExcluirFilme extends JFrame {
         
         JLabel labelcodigo = new JLabel("Codigo do filme:");
         JTextField textFieldcodigo = new JTextField();
         JButton excluir = new JButton("Excluir Filme");
         JButton voltar = new JButton("Voltar");
          public ExcluirFilme(){
             super("Excluir Filme");
             setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             setLayout(new FlowLayout());
             
           
             add(labelcodigo);
             textFieldcodigo.setColumns(25);
             add(textFieldcodigo); 
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
