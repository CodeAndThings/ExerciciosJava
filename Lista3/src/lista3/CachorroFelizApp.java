/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import Pack1.*;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author JoãoM
 */
public class CachorroFelizApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try
       {
           CachorroFeliz c = new CachorroFeliz();
           NumberFormat MoedaLocal = NumberFormat.getCurrencyInstance();
           
           Scanner Input = new Scanner(System.in);           
           System.out.println("Digite o peso do animal:");
           double PesoDoAnimal = Input.nextDouble();
           
           System.out.println("Digite o número de dias da hospedagem:");
           int NumeroDeDiasDaHospedagem = Input.nextInt();
           
           System.out.println(String.format("Caro cliente o custo da hospedagem do seu animal é de: %s", MoedaLocal.format(c.CalcularCustoDoServico(PesoDoAnimal, NumeroDeDiasDaHospedagem))));
       }
       catch(Exception ex)
       {      
           
       }        
    }
}
