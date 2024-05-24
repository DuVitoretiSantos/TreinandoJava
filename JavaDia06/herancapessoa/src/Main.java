import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Aluno alunoUm = new Aluno("Jozefina",25,"1234","Historia");
        //System.out.println(alunoUm.getCurso());
        //System.out.println(alunoUm.getNome());

        pessoas.add(alunoUm);

        Aluno alunoDois = (Aluno) pessoas.getFirst();

        Professor profUm = new Professor("Gleimon",2,"#Rb9*4--Lol", "BD");
        pessoas.add(profUm);

        Aluno alunoTres = new Aluno("Flash",pessoas.size()+1, "onibus", "React de video de K pop");

        pessoas.add(alunoTres);
        Professor profeDois = new Professor("Tia vera",4, "3,14", "Matemática");

        pessoas.add(profeDois);

        // PARA CADA PESSOA FAZ ESTA MESMA AÇÂO
       for(Pessoa p : pessoas){
           System.out.println("----------------- PESSOA - " + pessoas.indexOf(p)+1 + " -----------------");
           System.out.println("Nome: " + p.getNome());
           System.out.println("ID: " + p.getId());
           System.out.println("Senha: " + p.getSenha());
           if( p instanceof Aluno){
               Aluno aluno = (Aluno) p;
               System.out.println("Curso: " + aluno.getCurso());
           }else if(p instanceof Professor){

           }

           //OU

           //if(p.getClass() == Professor.class){
           // Professor pUm = (Professor) p;
           // System.out.println("Area: " + pUm.getArea());
           //}
       }
    }
}