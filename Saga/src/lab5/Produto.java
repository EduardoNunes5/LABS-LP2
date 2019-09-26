package lab5;

import java.util.Objects;

public class Produto {
    private String preco;
    private String nome;
    private String descricao;

    public Produto(String preco, String nome, String descricao) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) &&
                Objects.equals(descricao, produto.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - R$%s", getNome(), getDescricao(), getPreco());
    }
}
