package Principal;

import java.util.List;

public class Professor {

    //Adicionando atributos
    protected String nome;
    protected String disciplina;
    protected List<Curso> cursoList;

    public Professor(String disciplina, List<Curso> cursoList) {
        this.disciplina = disciplina;
        this.cursoList = cursoList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
