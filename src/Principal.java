
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Unitec
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char opcion;
        
        do
        {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1 Juego de Memoria");
            System.out.println("2. Bingo Matematico");
            System.out.println("3. Buscaminas Lineales");
            System.out.println("S. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = Character.toUpperCase(sc.next().charAt(0));
            
            switch (opcion)
            {
                case '1':
                    System.out.println("Juego de Memoria");
                    Juego_de_Memoria.ejecutar();
                    
                    break;
                
                case '2':
                    System.out.println("Bingo Marematico");
                    Loteria_a_Ciegas.ejecutar();
                    break;
                
                case '3':
                    System.out.println("Buscaminas Lineales");
                    break;
                
                case 'S':
                    System.out.println("Saliendo...");
                    break;
                
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'S');
    }
    
}
