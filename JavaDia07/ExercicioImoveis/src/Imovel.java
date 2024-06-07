public class Imovel {

    private String endereco;
    private String area;
    private int numeroQuartos;
    private int id;

    private boolean casaEmReforma;

    private static boolean possuiDono = true;

    public Imovel(String endereco,String area,int numeroQuartos, int id,boolean casaEmReforma){
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
        this.casaEmReforma = casaEmReforma;
    }

    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }

    public void setNumeroQuartos(int numeroQuartos){
        this.numeroQuartos = numeroQuartos;
    }
    public int getNumeroQuartos(){
        return numeroQuartos;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setCasaEmReforma(boolean casaEmReforma){
        this.casaEmReforma = casaEmReforma;
    }
    public boolean getCasaEmReforma(){
        return casaEmReforma;
    }

     public void reformar(boolean casaEmReforma){
        setCasaEmReforma(true);
     }

     public static boolean statusPossuiDono(){
        return possuiDono;
     }



}
