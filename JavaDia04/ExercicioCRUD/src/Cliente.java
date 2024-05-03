public class Cliente {

    private String nomeCliente;

    private long cpf;
    private float valorTotal;

    private boolean possuiCupom;

    public Cliente(String nome,long cpf){

        this.nomeCliente = nome;
        this.cpf = cpf;


    }
    public String getNomeCliente(){
        return nomeCliente;
    }

    public long getCpf() {
        return cpf;
    }

   public float getValorTotal(){
        return valorTotal;
   }

   public boolean getPossuiCupom(){
       return possuiCupom;
   }

   public void setNomeCliente(String nome){
        this.nomeCliente = nomeCliente;
   }
   public void setCpf(long cpf){
        this.cpf = cpf;
   }
   public void setValorTotal(float valorTotal){
        this.valorTotal = valorTotal;
   }
}
