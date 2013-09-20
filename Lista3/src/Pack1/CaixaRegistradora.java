/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;
import java.text.NumberFormat;

/**
 *
 * @author JoãoM
 */
public class CaixaRegistradora {
    private NumberFormat _FormatoMoedaLocal;
    private double _ValorDaCompra;
    private double _TaxaDeDesconto = 0.0;    
    private double _ValorDoDesconto = 0.0;
    
    public CaixaRegistradora(double ValorDaCompra) throws Exception
    {
        _FormatoMoedaLocal = NumberFormat.getCurrencyInstance();                
        
        if (ValorDaCompra <= 0)
            throw new Exception(String.format("O valor da compra é inválido pois o valor é: %s", _FormatoMoedaLocal.format(ValorDaCompra)));
        _ValorDaCompra = ValorDaCompra;
    }
    
    public double ValorDaCompraSemDesconto()
    {
        return _ValorDaCompra;        
    }
    
    public double AplicarDesconto(double TaxaDeDesconto) throws Exception
    {
        if (TaxaDeDesconto < 0.0)
            throw new Exception("A taxa de desconto é inferior a 0.0%");
        _TaxaDeDesconto = TaxaDeDesconto;
        
        _ValorDoDesconto = (_ValorDaCompra * _TaxaDeDesconto) / 100;
                
        return  _ValorDoDesconto;
    }
    
    public double ValorFinalDaCompra()
    {
        return _ValorDaCompra - _ValorDoDesconto;
    }
    
    public double TaxaDeDesconto()
    {
        return _TaxaDeDesconto;
    }
}
