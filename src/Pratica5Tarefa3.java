public class Pratica5Tarefa3 {
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3)); 
        System.out.println(intMax(3, 1, 2));
        System.out.println(intMax(2, 3, 1));
    }

    public static int intMax(int a, int b, int c) {
        if( a >= b && a >= c ){
            return a ;
        }

        if (b >= a && b >= c) {
            return b;
        }

        if( c >= a && c >= b){
            return c;
        }
        return a;
    }
}
