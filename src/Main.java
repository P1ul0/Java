import entidade.Lista;
import entidade.No;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Lista l2 = new Lista();
        lista.adicionar(4);
        lista.adicionar(5);
        lista.adicionar(1);
        lista.adicionar(3);
        lista.adicionar(6);
        lista.verificar(4);
        lista.removerPar();
        lista.imprimirLista();
        lista.copiarLista(l2);
        l2.imprimirLista();

    }
}
