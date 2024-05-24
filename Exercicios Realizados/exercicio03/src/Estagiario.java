public class Estagiario extends Aluno{

    private String trabalho;

    public Estagiario(String nome,int id, String senha, String curso, String trabalho){
        super(nome, id, senha, curso);
        this.trabalho = trabalho;
    }

    public void setTrabalho(String trabalho){
        this.trabalho = trabalho;
    }
    public String getTrabalho(){
        return trabalho;
    }

    public void dormirNoTrabalho(){
        setTrabalho(trabalho);
    }
}
