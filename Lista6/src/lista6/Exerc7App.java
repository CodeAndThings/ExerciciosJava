/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6;
import Lib.*;
/**
 *
 * @author joaomarcelo
 */
public class Exerc7App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Exerc7 exe7 = new Exerc7(150, 46);
            System.out.println(exe7);   
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
    }
}
