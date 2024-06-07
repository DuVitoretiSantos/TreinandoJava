public class Estagiario extends Aluno {

    private float bolsa;

    public Estagiario(String nome,String senha,int id,String curso, float bolsa){
        super(nome, senha, id, curso);
        this.bolsa = bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

    public float getBolsa(){
        return bolsa;
    }


}
