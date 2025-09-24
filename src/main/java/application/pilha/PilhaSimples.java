package application.pilha;

public class PilhaSimples {
    private String[] itens;
    private int topo;
    private int tamanho;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.itens = new String[tamanho];
        this.topo = -1;
    }

    public void empilhar(String valor) {
        if (topo == tamanho - 1) {
            System.out.println("Pilha cheia");
        } else {
            //topo++;
            //itens[topo] = valor;
            itens[++topo] = valor;
        }
    }

    public String desempilhar() {
        String resultado= "";
        if (topo == -1) {
            System.out.println("Pilha vazia");
        } else {
            //String valor = itens[topo];
            //topo--;
            resultado = itens[topo--];
        }
        return resultado;
    }


    @Override
    public String toString() {
        String resultado = "";

        for (String i : itens ) {
            resultado += i + "  ";
        }

        return resultado;
    }
}
