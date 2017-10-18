
package entidade;

public class Ingressos {

    
public int preco;
public int data;
public int sessao;
public String tipoticket;
public int acento;
public int sala;

    
    public void setPreco(int preco) {
        this.preco = preco;
    }
    
     public int getPreco() {
        return  preco;
    }

    
     public void setData(int data) {
        this.data = data;
    }
    
     public int getData() {
        return data;
    }

   public void setSessao(int sessao) {
        this.sessao = sessao;
    }
    
     public int getSessao() {
        return sessao;
    }   
 
     
     public void setTicket(String tipoticket) {
        this.tipoticket = tipoticket;
    }
    
     public String getTicket() {
        return tipoticket;
    }
     
      
     public void setAcento(int acento) {
        this.acento = acento;
    }
    
     public int getAcento() {
        return acento;
    }    
     
      public void setSala(int sala) {
        this.sala = sala;
    }
    
     public int getSala() {
        return sala;
    }    
}
