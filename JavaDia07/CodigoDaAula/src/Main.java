import java.util.ArrayList;

public class Main{


    public static void main(String[] args){

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Aluno aluno = new Aluno("Gabriel Cantor","cigarro",0,"Desistente");
        pessoas.add(aluno);

        Professor professor = new Professor("Girafales", "florinda" ,1,"Engenharia","Todas");
        pessoas.add(professor);

        Estagiario estagiario = new Estagiario("Juca","0000",2,"cagão",256.99f);
        pessoas.add(estagiario);


        for(Pessoa people : pessoas){
            System.out.println("===========================================");
            System.out.println("Nome:" + people.getNome());
            System.out.println("ID" + people.getId());
            System.out.print("SENHA" + people.getSenha());

            if(people instanceof Aluno){
                Aluno a = (Aluno) people;
                System.out.println("Curso: " + a.getCurso());
            }


        }




    }
}