package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //BuzzLightyear ex1 = new BuzzLightyear();
        //ex1.FrasesBuzz();

      //  System.out.println();
        //BuzzLightyear ex2 = new BuzzLightyear();
        //ex2.Capacete();


        int buzz1 = 1;
        int buzz2 = 2;
        int buzz3 = 3;

        int[] buzz = new int[3];

        buzz[0] = 1;
        buzz[1] = 2;
        buzz[2] = 3;

        //System.out.println("Boneco Buzz " + buzz[0]);

        for(int i = 0; i < 3; i++) {
            //  System.out.println("Boneco do Buzz " + buzz[i]);

            Scanner teclado = new Scanner(System.in);
            System.out.print("Qual boneco do Buzz deseja : ");
            int boneco = teclado.nextInt();

            if (boneco == buzz[0]) {
                BuzzLightyear ex1 = new BuzzLightyear();
                ex1.FrasesBuzz();
            } else if (boneco == buzz[1]) {
                BuzzLightyear ex2 = new BuzzLightyear();
                ex2.Capacete();
            }else if(boneco == buzz[3]){

            }

        }

    }
}
