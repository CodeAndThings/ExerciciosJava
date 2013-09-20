/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
import Pack1.*;
import javax.swing.*;

/**
 *
 * @author JoãoM
 */
public class JesusMeChamaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            
            JesusMeChama Bl = new JesusMeChama();
            Boolean BilheteValido = Bl.ValidarPassagem(JOptionPane.showInputDialog(null, "Digite o número do bilhete:"));
            if (!BilheteValido)
                java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, String.format("%b", BilheteValido));
            
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }                        
    }
}
