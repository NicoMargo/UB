package Main;

public class Main {
    public static void main(String[] args) {

        Ventana v1 = new Ventana();
        v1.setVisible(true);

    System.out.println(calcularFactorial(6));

    }
    public static int calcularFactorial(int n){
        int acum = n*(n-1);
        n = n-2;
        while (n>1){
            acum*=n;
            n--;
        }
        return  acum;
    }
}
