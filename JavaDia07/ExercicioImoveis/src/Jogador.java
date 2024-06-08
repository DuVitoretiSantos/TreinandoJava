public class Jogador {

    private String nome;
    private float saldoDisponivel;


    public Jogador(String nome, float saldoDisponivel){
        this.nome = nome;
        this.saldoDisponivel = saldoDisponivel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setSaldoDisponivel(float saldoDisponivel){
        this.saldoDisponivel = saldoDisponivel;
    }
    public float getSaldoDisponivel(){
        return saldoDisponivel;
    }


}
