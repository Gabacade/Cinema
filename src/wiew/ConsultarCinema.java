
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

public class ConsultarCinema extends JFrame{
JLabel labeltitulo = new JLabel(" Nome do Cinema: ");
         JTextField textFieldtitulo = new JTextField();
         JLabel labelcodigo = new JLabel(" codigo do Cinema:");
         JTextField textFieldcodigo = new JTextField();


         JButton consultar = new JButton("Consultar");
         JButton voltar = new JButton("Voltar");    
  
         
    public ConsultarCinema(){
         super("Consulta de Cinemas");
         setLayout(new FlowLayout());
         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         setLocationRelativeTo(null);
    
             add(labeltitulo);
             textFieldtitulo.setColumns(25);
             add(textFieldtitulo);
             
             add(labelcodigo);
             textFieldcodigo.setColumns(25);
             add(textFieldcodigo);
             
             add(consultar);
             add(voltar);
             
              voltar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     CrudC crudc= new CrudC();
                     crudc.setVisible(true);
                     setVisible(false);
                     }
            });
              
              consultar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     AtualizarFilme af= new AtualizarFilme();
                     af.setSize(400, 500);
                     af.setVisible(true);
                     setVisible(false);
                     }
            });
}    
    
}
