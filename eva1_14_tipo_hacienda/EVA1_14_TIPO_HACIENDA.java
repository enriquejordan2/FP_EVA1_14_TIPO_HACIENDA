/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FISICAS---> F
        //NORMALES-->N
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Caputra el tipo de persona F:Fisica o M:Moral");
        //nextline()--> String--> cadenas de caracter (indicar la posicion)
        //la primer posicion de cero
        tipo = captu.nextLine().charAt(0);
        //System.out.println("El Caracter es:"+ tipo);
        if (tipo== 'F')// los tipo char se pueden manejar en enteros
            System.out.println("Persona Fisica");
        else
            System.out.println("Persona Moral");
        
    }
    
}
