/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author JoãoM
 */
public class Exerc7 {
    
    private int _CatetoOposto;
    private int _CatetoAdjacente;
    
    public Exerc7(int CatetoOposto, int CatetoAdjacente) throws Exception
    {
        if (CatetoOposto <= 0)
            throw new Exception("Cateto Oposto não pode ser zero.");
        
        if (CatetoAdjacente <= 0)
            throw new Exception("Cateto Adjacente não pode ser zero.");
        _CatetoAdjacente = CatetoAdjacente;
        _CatetoOposto = CatetoOposto;
    }
        
    @Override
    public String toString()
    {
        return String.format("O valor da hipotenusa é: %s", (int)Math.sqrt((Math.pow(_CatetoOposto, 2) + Math.pow(_CatetoAdjacente, 2))));
    }
}
