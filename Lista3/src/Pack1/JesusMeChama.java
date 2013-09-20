/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

/**
 *
 * @author JoãoM
 */
public class JesusMeChama {
    public JesusMeChama()
    {
        
    }
    
    public boolean ValidarPassagem(String NumeroDaPassagem) throws Exception
    {
        if ("".equals(NumeroDaPassagem))
            throw new Exception("O número da passagem não pode ser em branco");
        
        Integer NumeroIntDaPassagem = Integer.parseInt(NumeroDaPassagem.substring(0, NumeroDaPassagem.length() - 1));
        Integer DigitoValidador = Integer.parseInt(NumeroDaPassagem.substring(NumeroDaPassagem.length() - 1, NumeroDaPassagem.length()));
        
        return NumeroIntDaPassagem % 7 == DigitoValidador;
    }
}
