package produto;

import java.util.Scanner;

public class produto {
    private int codigo;
    private String nome;
    private double tamanho, peso;
    private String cor;
    private int quantidade_estoque;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public String getCor() {
        return cor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String pagamento_quantia(String tipo) {
        if (tipo.equals("credito")) {
            return "Você pagou " + getPreco() / 3 + "R$";
        } else if (tipo.equals("dinheiro")) {
            System.out.println("Quanto que você ira dar? ");
            Scanner sc = new Scanner(System.in);
            double quantpreco = sc.nextDouble();
            quantpreco = quantpreco - getPreco();
            sc.close();
            return "Você recebeu de troco " + quantpreco;
        }

        else {
            return "Você pagou " + getPreco() * 0.05 + "R$";
        }
    }

    public String toString() {
        return "%nNome:"  + getNome() + "%nCodigo: " + getCodigo() + "%nCor: " + getCor() + "%ntamanho: " + getTamanho() + "%nquantidade: " + getQuantidade_estoque() + "%npreço: " + getPreco();
    }

}
