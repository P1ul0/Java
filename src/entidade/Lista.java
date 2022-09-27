package entidade;

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
}
