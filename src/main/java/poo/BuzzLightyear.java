package poo;

import java.util.Scanner;

public class BuzzLightyear {

    public void FrasesBuzz () {

        //6 Frases do Buzz
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número de 1 a 6 para ver as frases do Buzz: ");
        int frases = teclado.nextInt();

        switch (frases){

            case 1: System.out.println("Ao infinito... e além!");
              break;
            case 2: System.out.println("Só quero que saiba que embora tenha tentado me eliminar, vingança não é uma ideia que cultivamos em meu planeta.");
              break;
            case 3: System.out.println("Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!");
              break;
            case 4: System.out.println("Isto não é voar. Isto é cair, com estilo!");
              break;
            case 5: System.out.println("Alvo se aproximando.");
              break;
            case 6: System.out.println("Pare!!! Ordeno que pare!");
            break;
            default:
                System.out.println("Não é um número válido!");
        }


    }

    public void Capacete(){

        //Capacete retrátil
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Capacete retrátil (Digite 1 para aberto e 2 para fechado): ");
        int  capacete = teclado2.nextInt();

        if(capacete == 1){
            System.out.println("Coloque capacete!");
        }else if(capacete == 2){
            System.out.println("Tire o capacete!");
        }
        else{
            return;
        }
    }
}
