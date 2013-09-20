/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

/**
 *
 * @author JoãoM
 */
public class CachorroFeliz {
    private final double _ValorPorKilo = 2.00;
    
    public CachorroFeliz()
    {
        
    }
    
    public double CalcularCustoDoServico(double Peso, int NumeroDeDiasHospedado) throws Exception
    {
        if (Peso <= 0)
            throw new Exception("O peso do animal não pode ser zero");
        if (NumeroDeDiasHospedado <= 0)
            throw new Exception("O número de dias não pode ser zero");
        
        return (Peso * _ValorPorKilo) * NumeroDeDiasHospedado;
        
    }
}
