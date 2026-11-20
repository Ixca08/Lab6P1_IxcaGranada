
import java.util.Random;

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
    int [] carton = new int[50];
    generarCarton(carton);
        for (int i = 0; i < carton.length; i++) 
        {
            System.out.println(carton[i]);
        }
    }
    public static int [] generarCarton(int [] arreglo_inicial)
    {
        Random rnd = new Random();
        for (int i = 0; i < arreglo_inicial.length; i++)
        {
            arreglo_inicial[i] = rnd.nextInt(0,50);
        }
        return arreglo_inicial;
    }
    
}
