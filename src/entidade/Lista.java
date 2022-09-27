package entidade;
import No
public class Lista {
    private No inicio;
    private No ultimo;

    public Lista() {
        this.inicio = null;
        this.ultimo = null;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
    
    public void adicionar(int valor){
      No novoNo = new No(valor);
      No p = this.inicio;
      
      if (this.inicio == null) {
        this.inicio = novoNo;
        this.ultimo = novoNo
      }else{
        this.ultimo.setProximo(novoNo);
        this.ultimo = novoNo
        System.out.printf(this.inicio.getInicio);
        System.out.printf(this.ultimo.getUltimo);
      }
    }
}
