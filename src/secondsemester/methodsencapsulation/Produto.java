package secondsemester.methodsencapsulation;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
