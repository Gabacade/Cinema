
package wiew;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AtualizarFilme extends JFrame {
         JLabel labeltitulo = new JLabel(" Titulo do filme: ");
         JTextField textFieldtitulo = new JTextField();
         JLabel labelcodigo = new JLabel("Codigo do filme:");
         JTextField textFieldcodigo = new JTextField();    
         JLabel genero1 = new JLabel(" genero do filme: ");
         JTextField genero2 = new JTextField();
         JLabel  class1 = new JLabel("classificação do filme:");
         JTextField class2 = new JTextField();    
    
         JButton atualizar = new JButton("Inserir Filme");
         JButton excluirfilme = new JButton("Excluir Filme");
         JButton voltar = new JButton("Voltar");
         JButton vendaingresso = new JButton("Venda de Ingresso");


         public AtualizarFilme(){
             super("Atualizar Filme");
             setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             setLayout(new FlowLayout());
             
             add(labeltitulo);
             textFieldtitulo.setColumns(25);
             add(textFieldtitulo);
             
             add(labelcodigo);
             textFieldcodigo.setColumns(25);
             add(textFieldcodigo); 
             
             add(genero1);
             genero2.setColumns(20);
             add(genero2);
             
             add(class1);
             class2.setColumns(20);
             add(class2);
             
             
             add(atualizar);
             add(excluirfilme);
             add(vendaingresso);
             
              vendaingresso.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     VendadeIngressos vi= new VendadeIngressos();
                     vi.setSize(400,400);
                     vi.setVisible(true);
                     setVisible(false);
                     }
            });
             
             add(voltar);
              voltar.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     AtualizarCinema at= new AtualizarCinema();
                     at.setSize(500,500);
                     at.setVisible(true);
                     setVisible(false);
                     }
            });
         }
      
}
