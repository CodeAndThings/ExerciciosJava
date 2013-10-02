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
public class Exerc7App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Exerc7 exe = new Exerc7(20, 10);
            System.out.print(exe);
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
