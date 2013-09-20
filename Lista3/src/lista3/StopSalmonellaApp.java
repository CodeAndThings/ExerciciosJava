/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;
import Pack1.*;
import javax.swing.*;
import java.lang.*;
import java.text.NumberFormat;

/**
 *
 * @author JoãoM
 */
public class StopSalmonellaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            StopSalmonella Evento = new StopSalmonella(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de participantes do evento:")));
            StringBuilder RetornoDoUsuario = new StringBuilder();
            NumberFormat MoedaLocal = NumberFormat.getCurrencyInstance();
            
            RetornoDoUsuario.append("Detalhes do evento: \n");
            if (Evento.TamanhoDoEvento())
                RetornoDoUsuario.append("Evento com mais de 100 participantes\n");
            else
                RetornoDoUsuario.append("Evento com menos de 100 participantes\n");
            RetornoDoUsuario.append(String.format("Valor do evento: %s", MoedaLocal.format(Evento.ValorTotal())));
            
            JOptionPane.showMessageDialog(null, RetornoDoUsuario);
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
