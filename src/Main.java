import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero =0, n ;
        int i=0;
        n=(int)(Math.random()*100);
        System.out.println(n);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("bievenido a nuestro juego para adivinar el numero aleatorio.");
        System.out.println("recuerda 1. que se generará un numero aleatoreo del 0 al 100.");
        System.out.println("2. el programa será identificara cuantos intentos has hecho.");
        System.out.println("3. el juego acaba cuando adivines el numero.");
        System.out.println("------------------------------------------------------------------------");
        while (numero != n){
            System.out.println("porfavor ingrese el numero que creas que es");
            numero=entrada.nextInt();
            if (numero==n){
                System.out.println("usted escogio el numero correcto. "+numero);
            } else if (numero>n) {
                System.out.println("su numero es mayor al numero generado. "+numero);
            }else {
                System.out.println("su numero es menor al numero generado. "+numero);
            }
            i++;
        }
        System.out.println("el numero de veces que lo intento fue. "+i);
    }
}