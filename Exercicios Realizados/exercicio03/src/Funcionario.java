public class Funcionario extends Pessoa{

    private String cargo;
    private  String status;
    public Funcionario(String nome,int id,String senha,String cargo,String status){
        super(nome, id, senha);
        this.cargo = cargo;
        this.status = status;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public String getCargo(){
        return cargo;
    }
    public String getStatus(){
        return status;
    }

    public void ficarDesempregado() {
        setCargo("Desempregado");
    }


}
