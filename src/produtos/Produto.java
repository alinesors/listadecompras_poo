package produtos;

public class Produto {
    private String nome;
    private double precoEstimado;
    private int quantidade;

    public Produto(String nome, double precoEstimado, int quantidade){
        this.nome = nome;
        this.precoEstimado = precoEstimado;
        this.quantidade = quantidade;
    }

    public void atualizar(double precoEstimado, int quantidade){
        this.precoEstimado = precoEstimado;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoEstimado() {
        return precoEstimado;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
