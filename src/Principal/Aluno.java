package Principal;

import java.util.List;

public class Aluno {

    //Adicionando atributos
    protected String nome;
    protected long matricula;
    protected List<Double> notas;

    //Adicionando aluno
    public Aluno(String nome, long matricula, List<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    //Método para calcular média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    //Método para verificar a aprovação
    public boolean verificarAprovação() {
        return calcularMedia() >= 7;
    }


}
