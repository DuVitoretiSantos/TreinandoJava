public class ImovelDeVenda extends Imovel{

    private float preco;

    public ImovelDeVenda(String endereco,int area,int numeroQuartos, int id,boolean casaEmReforma,float preco)
    {
        super(endereco, area, numeroQuartos, id, casaEmReforma);
        this.preco = preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }
}
