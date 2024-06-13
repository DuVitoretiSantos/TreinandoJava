import java.util.ArrayList;
import javax.swing.*;

public class Main{



    public static void main(String[] args){
        int randomId;
        boolean idExiste = false;
        int numEscolha = -1;
        int casaEscolha = -1;
        int numEscolhaSelect = -1;
        int randomThings = 0;
        String casaLista = "";

        // IMOVEIS ////////////////////////////

        ArrayList<ImovelDeVenda> imoveis = new ArrayList<>();
        ImovelDeVenda imovel = new ImovelDeVenda("Praia do cagão", 26, 0, -1, true, 5525.09f);

        ArrayList<ImovelJogador> imoveisPossuidos = new ArrayList<ImovelJogador>();
        ImovelJogador imovelComprado = new ImovelJogador("a", 2, 1, 0, false,1);
        ////////////////////////////////////////

        // JOGADOR ///////////////////////////

        String nomeJogador = JOptionPane.showInputDialog(null, "Digite seu nome");

        Jogador j = new Jogador(nomeJogador, 10000.00f);


        // CIDADE DOS IMOVEIS ////////////////////

        ArrayList<String> cidade = new ArrayList<>();

        cidade.add("Florianopolis");
        cidade.add("São Paulo");
        cidade.add("Rio de janeiro");
        cidade.add("Belo horizonte");
        cidade.add("Porto alegre");
        cidade.add("Salvador");
        cidade.add("Curitiba");

        //////////////////////////////////////////

        do{
            numEscolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "========================================     SALDO DISPONIVEL: " + j.getSaldoDisponivel() +
                            "\nQUAL AÇÃO VOCÊ DESEJA REALIZAR?" +
                            "\n=======================================     JOGADOR: " + j.getNome() +
                            "\n\n 1 - COMPRAR IMOVEL" +
                            "\n\n 2 - BOTAR PARA ALUGAR UM IMOVEL" +
                            "\n\n 3 - VENDER IMOVEL  " +
                            "\n\n 4 - SAIR DO JOGO\n\n"));
            switch(numEscolha){

                case 1:

                    casaLista = "ESCOLHA UMA CASA";
                    for(int i = 0; i != imoveis.size();i++){
                        imoveis.remove(imovel);
                    }


                    for(int i = 0; i < 3; i++){
                        randomThings = (int) Math.floor(Math.random() * 6);
                        imovel.setEndereco(cidade.get(randomThings));
                        int areaImovel = (int) Math.floor(Math.random() * 140);
                        imovel.setArea(areaImovel+1);
                        int numQuartos = (int) Math.floor(Math.random() * 4);
                        imovel.setNumeroQuartos(numQuartos+1);
                        imovel.setCasaEmReforma(false);
                        imovel.setId(imoveis.size()+1+i+1);
                        float res = (int) Math.floor(Math.random() * 7895) + 1 * areaImovel * numQuartos;
                        imovel.setPreco(res);


                        // PERGUNTAR SOBRE NA PROXIMA AULA
                        //for(Imovel m : imoveis){
                        //    System.out.println("Cheguei AQUI!");
                        //    randomId = (int) Math.floor(Math.random() * 1);
                        //    if(m.getId() == randomId){
                        //        idExiste = true;
                        //        while(idExiste){
                        //            if(m.getId() != randomId){
                        //                idExiste = false; imovel.setId(randomId);

                        //            }
                        //        }
                        //    }else{
                        //        imovel.setId(randomId);
                        //    }
                        //}
                      imoveis.add(imovel);
                        casaLista += "\n\nCASA " + (i + 1) +
                                "-\n\nCidade: " + imovel.getEndereco() +
                                "\nArea: " + imovel.getArea() +
                                "\nNumero de quartos: " + imovel.getNumeroQuartos() +
                                "\nNumero do imovel: " + imovel.getId() +
                                "\nValor imovel: " + imovel.getPreco();


                    }
                    System.out.println(imoveis.size());
                    String[] opcoes = {"Casa 1", "Casa 2" , "Casa 3", "Retornar"};
                     casaEscolha = JOptionPane.showOptionDialog(null, casaLista,
                            "HOMESEARCH APP", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, "Escolher");
                    if(casaEscolha != 3){
                        System.out.println(" PREÇO CASA: "+ imoveis.get(casaEscolha).getPreco());
                        j.setSaldoDisponivel(j.getSaldoDisponivel() - imoveis.get(casaEscolha).getPreco());

                      float precoImovemComprado = imoveis.get(casaEscolha).getPreco();
                      int areaImovemComprado = imoveis.get(casaEscolha).getArea();
                      String enderecoImovemComprado = imoveis.get(casaEscolha).getEndereco();
                      int numeroQuartosImovemComprado = imoveis.get(casaEscolha).getNumeroQuartos();
                      int idImovemComprado = imoveis.get(casaEscolha).getId();
                      boolean casaEmReformaImovemComprado = imoveis.get(casaEscolha).getCasaEmReforma();

                      imovelComprado.setPriceForSell(precoImovemComprado);
                      imovelComprado.setArea(areaImovemComprado);
                      imovelComprado.setId(idImovemComprado);
                      imovelComprado.setCasaEmReforma(casaEmReformaImovemComprado);
                      imovelComprado.setEndereco(enderecoImovemComprado);
                      imovelComprado.setNumeroQuartos(numeroQuartosImovemComprado);

                       imoveisPossuidos.add(imovelComprado);
                       System.out.println(casaEscolha);
                       System.out.println(j.getSaldoDisponivel());
                    }

                     if(j.getSaldoDisponivel() <= 0){
                         numEscolha = 0;
                         int msgEndGame = (int) Math.floor(Math.random() * 2);
                         if(msgEndGame == 0){
                             JOptionPane.showMessageDialog(null,"Infelizmente seu dinheiro acabou,assim peço carinhosamente: engole o choro e FAZ O L\n\n" + " END GAME");
                         }else if(msgEndGame == 1){
                             JOptionPane.showMessageDialog(null, "FALENCIA, infelizmente sua jornada acabou, da proxima vez saiba gerenciar seu dinheiro de uma melhor maneira!\n\n" + " END GAME");
                         }else if(msgEndGame == 2){
                             JOptionPane.showMessageDialog(null, "Boa tentativa em conseguir grana, mas não foi desta vez guerreiro, voce faliu infelizmente...\n\n" + " END GAME");
                         }

                     }



                     break;

                case 2:



            }


        }while(numEscolha != 0);


    }
}







