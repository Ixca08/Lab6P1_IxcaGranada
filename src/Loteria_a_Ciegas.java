
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Unitec
 */
public class Loteria_a_Ciegas {
    
    public static void ejecutar()
    {
        Scanner sc = new Scanner(System.in);
        int [] carton = new int[10];
        String numeros;
        generarCarton(carton);
        System.out.println("Ingrese sus numeros separados por espacios: ");
        sc.nextLine();
        
    }
    
    public static int [] generarCarton(int [] arreglo_inicial)
    {
        Random rnd = new Random();
        for (int i = 0; i < arreglo_inicial.length; i++)
        {
            arreglo_inicial[i] = rnd.nextInt(1,50);
        }
        return arreglo_inicial;
    }
    public static boolean esPrimo(int valor)
    {
        for (int i = 2; i < valor; i++)
        {
            if (valor % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean verificarPrimos(int[] carton, int ... intentos)
    {
        int contador = 0;
        for (int i = 0; i < carton.length; i++) 
        {
            if (esPrimo(carton[i])) 
            {
                contador ++;
            }
        }
        return false;
    }
}
