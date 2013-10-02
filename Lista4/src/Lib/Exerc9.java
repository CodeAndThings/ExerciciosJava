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
        double SemiPerimetro = (_NumeroDeLados * _ComprimentoDosLados) / 2;
        double Apotema = (double)_ComprimentoDosLados / 2;        
        return String.format("A área do polígono é: %s√3cm³.", (SemiPerimetro * Apotema));
    }
}
