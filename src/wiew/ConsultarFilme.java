
package wiew;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConsultarFilme extends JFrame {
         JLabel labeltitulo = new JLabel(" Titulo do filme: ");
         JTextField textFieldtitulo = new JTextField();
         JLabel labelcodigo = new JLabel(" codigo do Filme:");
         JTextField textFieldcodigo = new JTextField();


         JButton consulta = new JButton("Consultar Filme");
         JButton voltar = new JButton("Cancelar");
    
         public ConsultarFilme(){
             super("Consultar Filme");
              setDefaultCloseOperation(DISPOSE_ON_CLOSE);
              setLayout(new FlowLayout());

             add(labeltitulo);
             textFieldtitulo.setColumns(25);
             add(textFieldtitulo);
             
             add(labelcodigo);
             textFieldcodigo.setColumns(25);
             add(textFieldcodigo);
             
             add(consulta);
         }
      
}
