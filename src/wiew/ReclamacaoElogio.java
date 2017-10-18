
package wiew;

import Controle.CrudC;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class ReclamacaoElogio extends JFrame {
      JButton enviar = new JButton("Enviar");
      JButton voltar = new JButton("Voltar");
      JTextArea texto= new JTextArea();
      JLabel texto1= new JLabel();
    public ReclamacaoElogio(){
          super("Reclamações e Elogios");
             setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             setLayout(new FlowLayout()); 
 
      add(texto1);
      texto.setColumns(40);
      texto.setRows(20);
      add(texto);
      add(enviar);
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
