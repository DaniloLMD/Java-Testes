package DesafiosAulas.Ex015DescontoLoja;

public class DescontoLoja {
    static double desconto = 0.75;
    double preco;
    String nome;

    double precoComDesconto(double precoProduto){
        preco = precoProduto;
        return preco * desconto;
    }
    double precoComDesconto(double precoProduto, double descontoGerente){
        preco = precoProduto;
        desconto = 1 - 0.25 - (descontoGerente/100);
        return preco * desconto;
    }
}
