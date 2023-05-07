

public class Pratica5tarefa1{
    public static void main(String[] args) throws Exception {
    }

    public boolean lastDigit(int a, int b) {
        int restoA = a % 10;
        int restoB = b % 10;

        if (restoA == restoB){
            return true;
        } else{
            return false;
        }
    }
}
