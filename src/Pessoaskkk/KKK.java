package Pessoaskkk;

public class KKK {

    public static void main(String []args) {

        Pai rafael = new Pai("Rafael", 85, null, null);
        Mae pamela = new Mae("Pamela", 83, null, null);

        Pai ricardo = new Pai("Ricardo", 50, rafael, pamela);

        Pai robson = new Pai("robson", 80, null, null);
        Mae marina = new Mae("Marina", 77, null, null);

        Mae flavia = new Mae("Flávia", 50, robson, marina);




        System.out.println(rafael.toString());
        System.out.println(pamela.toString());

        System.out.println(ricardo.toString());

        System.out.println(robson.toString());
        System.out.println(marina.toString());

        System.out.println(flavia.toString());


    }



}
