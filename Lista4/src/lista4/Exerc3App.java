/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;
import Lib.*;

/**
 *
 * @author JoãoM
 */
public class Exerc3App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Exerc3 exe3 = new Exerc3(250);
            exe3.Calcular(250, 5.3);
            System.out.println(exe3);
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
    }
}
