
import java.util.Random;

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
        int [] arreglo = {1,1,2,2,3,3};
        GenerarTablero(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) 
        {
            System.out.println(arreglo[i]);   
        }
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
}
