public class Main {
    public static float result;
    public static float calcRealEstate(float terrainPrice,float heightOfTerrain){
          result = terrainPrice * heightOfTerrain;
         return result;
    }

    public static void main(String[] args) {
        System.out.println(Imovel.statusPossuiDono());

        System.out.println(calcRealEstate(5.25f,6.25f));
    }
}