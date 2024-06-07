public class Pessoa {

    private String nome;
    private int id;
    private String senha;


    public Pessoa(String nome,String senha,int id){

        this.nome = nome;
        this.senha = senha;
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setId(int id){
        this.senha= senha;
    }

    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    public int getId(){
        return id;
    }





    public void mudarSenha(String s){
        this.setSenha(s);
    }


}
