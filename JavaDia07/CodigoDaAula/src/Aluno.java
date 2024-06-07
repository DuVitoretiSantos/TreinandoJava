public class Aluno extends Pessoa{

    private String curso;

    public Aluno(String nome,String senha,int id,String curso){
        super(nome, senha, id);
        this.curso = curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }

}
