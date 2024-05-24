public class Pessoa {
    private String nome;
    private int id;
    private String senha;

    public Pessoa(){}
    public Pessoa(String nome,int id, String senha){
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public int getId(){
        return id;
    }
    public String senha(){
        return senha;
    }


    public void alterarSenha(){
        setSenha(senha);
    }

}
