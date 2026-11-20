
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
public class Juego_de_Memoria {
    
    public static void ejecutar()
    {
        
        Scanner sc = new Scanner(System.in);
        
        int [] arreglo = {1,1,2,2,3,3};
        boolean [] conciden = new boolean[6];
        int indice_usuario1 , indice_usuario2;
        int contador =0;
        
        GenerarTablero(arreglo);
        do{
        
        MostrarTablero(arreglo,conciden);
        System.out.println("\nIngrese la primera posicion ");
        indice_usuario1 = sc.nextInt();
        while(indice_usuario1< 0 || indice_usuario1 > 5)
        {
            System.out.println("Error el numero debe estar entre 0 y 5");
            indice_usuario1 = sc.nextInt();
        }
        
        System.out.println("Ingrese la segunda posicion ");
        indice_usuario2= sc.nextInt();
        while(indice_usuario2 < 0 || indice_usuario2 > 5)
        {
            System.out.println("Error el numero debe estar entre 0 y 5");
            indice_usuario2 = sc.nextInt();
        }
        while(indice_usuario2  == indice_usuario1)
        {
            System.out.println("Error deben ser posiciones diferentes");
            System.out.println("Ingrese la segunda posicion: ");
            indice_usuario2 = sc.nextInt();
            while(indice_usuario2 < 0 || indice_usuario2 > 5)
        {
            System.out.println("Error el numero debe estar entre 0 y 5");
            indice_usuario2 = sc.nextInt();
        }
           

        }
         System.out.println("Los numeros son "  + arreglo[indice_usuario1] + " y " + arreglo[indice_usuario2]);
         Verificar(arreglo,conciden,indice_usuario1,indice_usuario2);
        contador ++;
        }while(true);
    }
        
    public static int [] GenerarTablero(int [] arreglo_inicial)
    {
        Random rnd = new Random();
        int tmp;
        
        for (int i = 0; i < arreglo_inicial.length; i++) 
        {
            int indice = rnd.nextInt(0, 6);
            tmp = arreglo_inicial [i];
            arreglo_inicial[i] = arreglo_inicial[indice];
            arreglo_inicial[indice] = tmp;
        }
        return arreglo_inicial;
        
    }
    public static void MostrarTablero(int [] arreglo, boolean [] coincidir)
    {
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (coincidir[i] != true)
            {
                System.out.print(" [ * ] ");
            }
            else if(coincidir[i] == true)
            {
                System.out.printf(" [ %d ]", arreglo[i]);
            }
        }
    }
    
    public static boolean [] Verificar(int [] arreglo ,boolean [] coincidir,int indice1,int indice2)
    {
        boolean tmp = true;
        
        if(arreglo[indice1] == arreglo[indice2])
        {
                coincidir[indice1] = tmp;
                coincidir[indice2] = tmp;
                System.out.println("Coinciden");
        }
        return coincidir;
    }
 
}
