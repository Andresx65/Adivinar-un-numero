import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroOculto = aleatorio.nextInt(50) + 1;
        int intento;

        for (int intentos = 1; intentos <= 3; intentos++) {

            System.out.print("Adivina el numero un numero del 1 al 50): ");
            intento = sc.nextInt();

            if (intento == numeroOculto) {
                System.out.println("Adivinaste el numero");
                break;
            }

            if (intentos == 3) {
                System.out.println("El numero era: " + numeroOculto);
            }
        }

        sc.close();
    }
}