public class Aluno extends Pessoa{

    private String curso;

    public Aluno(){}
    public Aluno(String nome,int id,String senha, String curso){
        super(nome, id, curso);
        this.curso = curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }



    public void trocarCurso(){
        setCurso(curso);
    }

}
