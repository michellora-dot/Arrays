import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definir los arreglos
        int Arreglo1[] = new int[7];
        int Arreglo2[] = new int[7];
        int Arreglo3[] = new int[7];

        // Primer arreglo
        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < Arreglo1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            Arreglo1[i] = entrada.nextInt();
        }

        // Segundo arreglo
        System.out.println("Ingrese 7 números para el segundo arreglo: ");
        for (int i = 0; i < Arreglo2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            Arreglo2[i] = entrada.nextInt();
        }

        // Tercer arreglo llenado con la diferencia de los dos primeros y se calcula la suma
        int suma = 0;
        for (int i = 0; i < Arreglo3.length; i++) {
            Arreglo3[i] = Arreglo1[i] - Arreglo2[i];
            suma += Arreglo3[i];
        }

        // Calcular promedio
        double promedio = (double) suma / Arreglo3.length;

        // Datos del tercer arreglo
        System.out.println("Promedio del tercer arreglo: ");
        for (int i = 0; i < Arreglo3.length; i++) {
            System.out.println("Posición " + i + " = " + Arreglo3[i]);
        }

        // Promedio
        System.out.println("El promedio de los datos del tercer arreglo es: " + promedio);

        entrada.close();





        }
    }
