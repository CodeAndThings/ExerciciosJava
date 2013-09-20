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
public class AceleracaoMediaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            int VelocidadeInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Velocidade inicial:"));
            int VelocidadeFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Velocidade final:"));
            int Tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a variação de tempo"));
            
            AceleracaoMedia AM = new AceleracaoMedia(VelocidadeInicial, VelocidadeFinal, Tempo);
            JOptionPane.showMessageDialog(null, String.format("A aceleração média é: %s Km/h/s", AM.AceleracaoMedia()));
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
