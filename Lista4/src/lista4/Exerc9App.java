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
public class Exerc9App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Exerc9 exe = new Exerc9(8, 6);
            System.out.print(exe);
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
    }
}
