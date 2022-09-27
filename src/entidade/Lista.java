package entidade;
public class Lista {
    private No inicio;
    private No ultimo;

 public Lista() {
      this.inicio = null;
      this.ultimo = null;
   }
  public void adicionar(int novoValor){
      No novoNo = new No(novoValor);
      No p = this.inicio;
    
      if (this.inicio == null) {
        this.inicio = novoNo;
        this.ultimo = novoNo
      }else{
        this.ultimo.setProximo(novoNo);
        this.ultimo = novoNo;
      }
    }
    
  public void remover(int novoValor){
    ant = null;
    p = this.inicio;
    while(p != null){
      ant = p;
      p = p.getProximo();
      if(p == novoValor){
        if (p == inicio){
          this.inicio = this.inicio.getProximo();
        }else if (p == ultimo){
          this.ultimo = ant;
          ant.setProximo(null);
        }else{
          ant.setProximo(this.inicio.getProximo());
        }
       break;
    }
  }
}
