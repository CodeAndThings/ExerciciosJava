/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author JoãoM
 */
public class Exerc9 {
    private int _ComprimentoDosLados;
    private int _NumeroDeLados;
    
    public Exerc9(int ComprimentoDosLados, int NumeroDeLados) throws Exception
    {
        if (ComprimentoDosLados <= 0)
            throw new Exception("O comprimento dos lados não pode ser zero.");
        if (NumeroDeLados <= 0)
            throw new Exception("O número de lados não pode ser zero.");
        
        _ComprimentoDosLados = ComprimentoDosLados;
        _NumeroDeLados = NumeroDeLados;
    }
    
    @Override
    public String toString()
    {
        //Todo o polígono regular pode ser dividido em triangulos
        //A area do polígodo regular é calculada por A = p * a onde p é o semiperímetro e a é a apótema.
        //O semiperimetro é dado pela soma de todos os lados. A fórmula do semiperimetro é p = nlados * comprimentodolado / 2
        //A apotema é a altura do triangulo.
        
        
        double SemiPerimetro = (_NumeroDeLados * _ComprimentoDosLados) / 2; //encontrando o semiperimetro do triangulo
        // a metade de um triangulo possue um angulo de 30 graus entao
        // simplifica-se coseno de 30 pela hipotenusa.
        double Apotema = (double)_ComprimentoDosLados / 2;  
        return String.format("Os dados deste Polígono regular são: Semiperímetro: %s, apótema: %s e a área do polígono é: %s√3cm³.", SemiPerimetro, Apotema, (SemiPerimetro * Apotema));
    }
}
