
package wiew;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class CadastrarFilme extends JFrame {
         JLabel labeltitulo = new JLabel(" Titulo do filme: ");
         JTextField textFieldtitulo = new JTextField();
         JLabel labelcodigo = new JLabel("Codigo do filme:");
         JTextField textFieldcodigo = new JTextField();    
         JLabel genero1 = new JLabel(" genero do filme: ");
         JTextField genero2 = new JTextField();
         JLabel  class1 = new JLabel("classificação do filme:");
         JTextField class2 = new JTextField();    
         JButton voltar= new JButton("Voltar");
    
    public CadastrarFilme(){
       super("Cadastro de Filme"); 
              setLayout(new FlowLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

       
          
       
       
             add(labeltitulo);
             textFieldtitulo.setColumns(20);
             add(textFieldtitulo);
             
             add(labelcodigo);
             textFieldcodigo.setColumns(20);
             add(textFieldcodigo);
                             
             add(genero1);
             genero2.setColumns(20);
             add(genero2);
             
             add(class1);
             class2.setColumns(20);
             add(class2);
     
            add(voltar);
             voltar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     ConsultarCinema cc= new ConsultarCinema();
                     cc.setSize(500, 500);
                     cc.setVisible(true);
                     setVisible(false);
                     }
            });
    
    }
  
    
    
}
