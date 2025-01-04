package Principal;

import java.util.List;

public class Curso {

    //Adicionando atributos
    protected String curso;
    protected List<Aluno> alunoList;
    protected String professor;

    public Curso(String curso, List<Aluno> alunoList, String professor) {
        this.curso = curso;
        this.alunoList = alunoList;
        this.professor = professor;
    }

    //Adicionando alunos a um curso
    public void adicionarAlunos(String nome, long matricula, List<Double> nota) {
        Aluno aluno = new Aluno(nome, matricula, nota);
        alunoList.add(aluno);
    }
}
