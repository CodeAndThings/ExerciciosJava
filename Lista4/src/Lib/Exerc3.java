/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;
import java.text.NumberFormat;

/**
 *
 * @author JoãoM
 */

public class Exerc3 {    
    private double _Salario = 0;
    private double _Comissao = 0;    
    
    private NumberFormat _FormatoMoedaLocal;
    
    public Exerc3(double Salario)
    {
        _FormatoMoedaLocal = NumberFormat.getCurrencyInstance(); 
        _Salario = Salario;
    }
    
    public void Calcular(double TotalDeVendas, double TaxaDeComissao) throws Exception
    {
        if (TotalDeVendas <= 0)
            throw new Exception("Salário não pode ser zero.");
        
        if (TotalDeVendas <= 0)
            throw new Exception("Taxa de Comissao não pode ser zero.");
        
        _Comissao = (TotalDeVendas * (TaxaDeComissao / 100));
    }
    
    @Override
    public String toString()
    {
        return String.format("Salário Normal: %s. Comissão Recebida: %s. Salario Total: %s", _FormatoMoedaLocal.format(_Salario), _FormatoMoedaLocal.format(_Comissao), _FormatoMoedaLocal.format(_Comissao + _Salario));
    }       
}
