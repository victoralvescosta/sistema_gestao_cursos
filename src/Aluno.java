import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    //Atributos
    private int matricula;
    private List<Double> notas = new ArrayList<>();

    //Adicionando aluno
    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    //Adicionando a nota
    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    //Adicionando média
    public double calcularMediaAluno() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    //Verificar aprovação
    public boolean verificarMedia() {
        return calcularMediaAluno() >= 7;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + matricula +
                "\nMédia: " + String.format("%.2f", calcularMediaAluno()) +
                "\nSituação: " + (verificarMedia() ? "Aprovado" : "Reprovado");
    }
}
