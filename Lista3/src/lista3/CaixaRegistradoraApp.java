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
public class CaixaRegistradoraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            StringBuilder RetornoDoUsuario = new StringBuilder();
            NumberFormat FormatoLocalDaMoeda = NumberFormat.getCurrencyInstance();
            CaixaRegistradora Caixa = new CaixaRegistradora(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra:")));
            double ValorDoDesconto = Caixa.AplicarDesconto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de desconto (%)")));
            
            RetornoDoUsuario.append("O resumo da compra é:\n");
            RetornoDoUsuario.append(String.format("Valor da compra sem o desconto aplicado: %s\n", FormatoLocalDaMoeda.format(Caixa.ValorDaCompraSemDesconto())));
            RetornoDoUsuario.append(String.format("Valor do desconto aplicado: %s (%s%\u0025)\n", FormatoLocalDaMoeda.format(ValorDoDesconto), Caixa.TaxaDeDesconto()));
            RetornoDoUsuario.append(String.format("Valor final da compra é: %s", FormatoLocalDaMoeda.format(Caixa.ValorFinalDaCompra())));
            
            JOptionPane.showMessageDialog(null, RetornoDoUsuario);
        }
        catch (Exception ex)
        {
            
        }
    }
}
