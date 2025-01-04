package Principal;

import java.util.List;

public class Aluno {

    //Adicionando atributos
    protected String nome;
    protected long matricula;
    protected List<Double> nota;

    public Aluno(String nome, long matricula, List<Double> nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
}
