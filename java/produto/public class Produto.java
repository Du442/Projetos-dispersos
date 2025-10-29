package Produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double valor;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valor = preco * quantidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
        atualizarValor();
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
        atualizarValor();
    }

    public double getValor(){
        return valor;
    }

    private void atualizarValor(){
        this.valor = this.preco * this.quantidade;
    }

    public void calcularTotal(){
        System.out.println("O valor total da compra foi de R$" + this.valor);
    }

}

