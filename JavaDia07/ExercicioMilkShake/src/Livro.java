public class Livro extends Pedido{
    private String nome;
    public Livro(String nome,String tipo, int id){
        super(id, tipo);
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
