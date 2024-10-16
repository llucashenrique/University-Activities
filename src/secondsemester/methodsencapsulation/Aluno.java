package secondsemester.methodsencapsulation;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public boolean verificarAprovacao() {
        return nota >= 6;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

