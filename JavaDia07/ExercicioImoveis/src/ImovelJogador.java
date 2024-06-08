public class ImovelJogador extends Imovel{

    private float priceForSell;

  public ImovelJogador(String endereco,int area,int numeroQuartos, int id,boolean casaEmReforma,float priceForSell){
      super(endereco, area, numeroQuartos, id, casaEmReforma);
      this.priceForSell = priceForSell;
  }

  public void setPriceForSell(float priceForSell){
      this.priceForSell = priceForSell;
  }
  public float getPriceForSell(){
      return priceForSell;
  }

  public void venderImovel(){

  }
  public void tentarValorizarImovel(){

  }

}
