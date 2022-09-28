package entidade;
public class Lista {
    private No inicio;
    private No ultimo;

     public Lista() {
          this.inicio = null;
          this.ultimo = null;
     }

    public void  verificar(int valor){
         String msg = "valor nao existe na lista";
         No p = this.inicio;
         while (p != null){
             if (p.getValor() == valor){
                 msg ="valor existe na lista";
                 break;
             }
             p = p.getProximo();
         }
        System.out.println(msg);
    }
    public void adicionar(int novoValor){
      No novoNo = new No(novoValor);

        if (this.inicio == null) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else if (this.inicio.getValor() > novoValor) {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        } else if (this.ultimo.getValor() < novoValor) {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
        } else if (this.inicio.getValor() < novoNo.getValor() && this.inicio.getProximo().getValor() > novoNo.getValor()) {
            novoNo.setProximo(this.inicio.getProximo());
            this.inicio.setProximo(novoNo);
        } else{
            No ant = null;
            No p = this.inicio;
            while (p != null) {
                if (p.getValor() > novoValor){
                    ant.setProximo(novoNo);
                    novoNo.setProximo(p);
                }
                    ant = p;
                    p = p.getProximo();

            }

        }
      }



    public void remover(int novoValor) {
        No ant = null;
        No p = this.inicio;
        while (p != null && p.getValor() != novoValor) {
            ant = p;
            p = p.getProximo();
        }
        if (p == this.inicio) {
            this.inicio = p.getProximo();
        } else if (p == this.ultimo) {
            this.ultimo = ant;
            ant.setProximo(null);
        } else {
            ant.setProximo(p.getProximo());
        }



    }
    public void imprimirLista(){
         No p = this.inicio;
         while (p != null){
             if (p.equals(this.inicio)){
                 System.out.print(p.getValor());
             }else {
                 System.out.print(","+p.getValor());
             }

             p = p.getProximo();

         }
        System.out.println();
    }
    public void copiarLista(Lista l){
         No p = this.inicio;
         while (p != null){
             l.adicionar(p.getValor());
             p = p.getProximo();
         }
    }
    public void removerPar(){
         No ant = null;
         No p = this.inicio;
         while (p != null){
             if ((p.getValor() % 2) == 0){
                 if (p.equals(this.ultimo)){
                     this.ultimo = ant;
                     ant.setProximo(null);
                 }else {
                     ant.setProximo(p.getProximo());
                 }

             }
             ant=p;
             p = p.getProximo();
         }
    }

}
