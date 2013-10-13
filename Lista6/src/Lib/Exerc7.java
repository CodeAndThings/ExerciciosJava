/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;
import java.text.NumberFormat;

/**
 *
 * @author joaomarcelo
 */
public class Exerc7 {
    private double _Altura;
    private double _Comprimento;
    private double _AreaTotal;
    private double _NumeroDeGaloes;
    private double _CorrecaoDeQuantidade;
    private double _FatorDeCorrecao;
    private NumberFormat _FormatoDeMoedaLocal;
    
    public Exerc7(double Altura, double Comprimento) throws Exception
    {
        if (Altura <= 0)
            throw new Exception("O sistema não permite altura igual a zero");
        
        if (Comprimento <= 0)
            throw new Exception("O sistema não permite comprimento igual a zero");
        
        
        _FormatoDeMoedaLocal = NumberFormat.getCurrencyInstance();
        _FatorDeCorrecao = 0.01;
        _Altura = Altura;
        _Comprimento = Comprimento;
    }
    
    public Exerc7(double Altura, double Comprimento, double FatorDeCorrecao) throws Exception
    {
        if (Altura <= 0)
            throw new Exception("O sistema não permite altura igual a zero");
        
        if (Comprimento <= 0)
            throw new Exception("O sistema não permite comprimento igual a zero");
        
        _FormatoDeMoedaLocal = NumberFormat.getCurrencyInstance();
        _FatorDeCorrecao = FatorDeCorrecao;
        _Altura = Altura;
        _Comprimento = Comprimento;
    }
    
    private void CalcularArea()
    {
        _AreaTotal = _Comprimento * _Altura;
    }
    
    private void NumeroDeGaloes()
    {
        _NumeroDeGaloes = _AreaTotal / (Math.pow(50, 2));
        _CorrecaoDeQuantidade = _NumeroDeGaloes - (int)(_NumeroDeGaloes);
    }
    
    @Override
    public String toString()
    {
        CalcularArea();
        NumeroDeGaloes();
        int NumeroDeGaloes;
        
        String MensagemDeRetorno;
        if ((int)_NumeroDeGaloes > 1)
        {
            if (_CorrecaoDeQuantidade > _FatorDeCorrecao)
            {
                NumeroDeGaloes = (int)_NumeroDeGaloes + 1;
                MensagemDeRetorno = String.format("Você precisa de %s galões de tinta, o valor total da pintura é: %s\nATENÇÃO: O software ajustou a quantidade de galões em 1 galão de tinta para que não falte na hora da pintura.", NumeroDeGaloes, _FormatoDeMoedaLocal.format(NumeroDeGaloes * 30));
            }
            else
            {
                NumeroDeGaloes = (int)_NumeroDeGaloes;
                MensagemDeRetorno = String.format("Você precisa de %s galões de tinta, o valor total da pintura é: %s", NumeroDeGaloes, _FormatoDeMoedaLocal.format(NumeroDeGaloes * 30));
            }
        }
        else
        {
            NumeroDeGaloes = 1;
            _CorrecaoDeQuantidade = 0;
            MensagemDeRetorno = String.format("Você precisa de %s galões de tinta, o valor total da pintura é: %s", NumeroDeGaloes, _FormatoDeMoedaLocal.format(NumeroDeGaloes * 30));
        }   
        return MensagemDeRetorno;
    }
}
