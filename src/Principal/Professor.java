package Principal;

import java.util.List;

public class Professor {

    //Adicionando atributos
    protected String nome;
    protected String disciplina;
    protected List<Curso> cursoList;

    public Professor(String nome, String disciplina, List<Curso> cursoList) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.cursoList = cursoList;
    }
}
