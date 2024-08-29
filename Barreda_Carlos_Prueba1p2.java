/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1p2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_Prueba1p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner lea = new Scanner(System.in);
        int contadorA= 0;
        int contadorB=0;
        String palabras[ ] = { "radar", "level", "world", "civic", "java", "deified", "python", "rotor",
            "language", "madam", "refer", "stats", "noon", "hello",
            "moon", "wow", "racecar", "kayak", "apple", "deed" };
        
      
        
        
        for (int contador = 0; contador < palabras.length; contador++) {
            System.out.println("["+ contador +"]"+ palabras[contador]);
             
        }
        
        System.out.println("Ingerese el tamaño del arreglo: ");
        int tamanio = lea.nextInt();
        
        String A[] = new String[tamanio];
        String B[] = new String[tamanio];
        
        System.out.println("Arreglo A: ");
        
        while (contadorA < A.length) {
            String palabra = palabras[random.nextInt(palabras.length)];
            String invertida = "";
            for (int comparacionA = palabra.length() - 1; comparacionA >= 0; comparacionA--) {
                invertida += palabra.charAt(comparacionA);
            }
            if (palabra.equals(invertida)) {
                A[contadorA] = palabra;
                System.out.println("[" + contadorA + "] " + A[contadorA]);
                contadorA++;
            }
        }
        
        System.out.println("Arreglo B");
        while (contadorB < B.length) {
            String palabra = palabras[random.nextInt(palabras.length)];
            String invertida = "";
            for (int comparacionB = palabra.length() - 1; comparacionB >= 0; comparacionB--) {
                invertida += palabra.charAt(comparacionB);
            }
            if (palabra.equals(invertida)) {
                A[contadorB] = palabra;
                System.out.println("[" + contadorB + "] " + A[contadorB]);
                contadorB++;
            }
        }
        
        System.out.println("Palabras del Arreglo A que no estan en el B");
        for (int contadorgeneral = 0; contadorgeneral < tamanio; contadorgeneral++) {
            boolean encontrado = false;
            for (int j = 0; j < tamanio; j++) {
                if (A[contadorgeneral].equals(B[j])) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("[" + contadorgeneral + "]: " + arregloA[contadorgeneral]);
            }
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
