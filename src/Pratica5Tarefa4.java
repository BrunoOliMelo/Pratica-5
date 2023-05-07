public class Pratica5Tarefa4 {
    public static void main(String[] args) {
        System.out.println(close10(8,13));
        System.out.println(close10(13,8));
        System.out.println(close10(13,7));
    }
    public static int close10(int a, int b){
        int distanciaA, distanciab;

        distanciaA = a - 10;
        distanciab = b - 10;

        if(a < 10){
            distanciaA  = -1* distanciaA;
        }
        if(b < 10){
            distanciab = -1* distanciab;
        }
        if(distanciaA > distanciab){
            return b;
        } else{
            return a;
        }
  }

}
