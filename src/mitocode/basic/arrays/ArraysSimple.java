package mitocode.basic.arrays;

import java.util.Scanner;

/**
 * Created by Ivans on 09/04/2017.
 */
public class ArraysSimple {

    public String llenarArray(){

        System.out.println("Ingrese el tamaño del array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el elemento de la posicion: " + i);
            String valor = input.nextLine();
            array[i] = valor;
        }

        return llenarArray();
    }

}