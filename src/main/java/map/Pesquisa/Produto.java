package main.java.map.Pesquisa;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(double preco, int quantidade, String nome) {
    this.preco = preco;
    this.quantidade = quantidade;
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "ContagemPalavras{" +
            "nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            '}';
  }
}
