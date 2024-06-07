public class Professor extends Aluno {

    private String area;

    public Professor(String nome, String senha, int id, String curso, String area){
         super(nome, senha, id, curso);
         this.area = area;
    }

    public void setArea(String area){
        this.area = area;
    }

    public String getArea(){
        return area;
    }


}
