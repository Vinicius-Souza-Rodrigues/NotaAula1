package aluno;

public class aluno {
    private String nome, situacao;
    private double nota1, nota2, nota3;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }

    public String situacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado!";
        } else if (calcularMedia() < 4) {
            return "Reprovado!";
        } else {
            return "Recuperação!";
        }
    }
}
