package Principal;

import java.util.List;

public class Curso {

    //Adicionando atributos
    protected String curso;
    protected List<Aluno> alunoList;
    protected String professor;

    //Adicionando curso
    public Curso(String curso, List<Aluno> alunoList, String professor) {
        this.curso = curso;
        this.alunoList = alunoList;
        this.professor = professor;
    }

    //Adicionando alunos a um curso
    public void adicionarAlunos(String nome, long matricula, List<Double> notas) {
        Aluno aluno = new Aluno(nome, matricula, notas);
        alunoList.add(aluno);
    }

    //Exibindo detalhes do curso
    public void exibirCurso() {
        System.out.println("Curso: " + curso);
        System.out.println("Professor: " + professor);
        System.out.println("Lista de Alunos: " );
        for (Aluno aluno : alunoList) {

        }
        System.out.println("Média: " + curso);
    }
}
