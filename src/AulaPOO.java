import java.util.Scanner;

public class AulaPOO {

    public static void main(String []args) {

        Scanner ovo = new Scanner(System.in);

        System.out.println("a:");
        int a = ovo.nextInt();
        System.out.println("b:");
        int b = ovo.nextInt();

        int soma = somar(a, b);
        System.out.println(soma);


    }
    public static int somar(int a, int b) {
        return a + b;
    }

}













