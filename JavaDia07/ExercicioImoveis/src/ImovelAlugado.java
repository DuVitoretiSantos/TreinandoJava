public class ImovelAlugado extends Imovel {

    private float valorImovelAlugado;
    private boolean casaAlugada;

    public ImovelAlugado(String endereco,int area,int numeroQuartos, int id,boolean casaEmReforma,float valorImovelAlugado,boolean casaAlugada){
        super(endereco, area, numeroQuartos, id, casaEmReforma);
        this.valorImovelAlugado = valorImovelAlugado;
        this.casaAlugada = casaAlugada;
    }

    public void setValorImovelAlugado(float valorImovelAlugado){
        this.valorImovelAlugado = valorImovelAlugado;
    }
    public float getValorImovelAlugado(){
        return valorImovelAlugado;
    }

    public void setCasaAlugada(boolean casaAlugada){
        this.casaAlugada = casaAlugada;
    }
    public boolean getCasaAlugada(){
        return casaAlugada;
    }


    public void alugar()
    {
        setCasaAlugada(true);
    }

    public void devolver()
    {
        setCasaAlugada(false);
    }

}
