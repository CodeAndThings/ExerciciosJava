/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;
import java.lang.*;
/**
 *
 * @author JoãoM
 */
public class Exerc4 {
    private String _Texto;
    
    public Exerc4(String Texto)
    {
        _Texto = Texto;
    }
        
    @Override
    public String toString()
    {
        StringBuilder IntChars = new StringBuilder();                
        for (int i = 0; i <= _Texto.length() - 1; i++)
        {  
            IntChars.append(String.format("Carectere: %s - Número ASCII: %s", _Texto.charAt(i), (int)_Texto.charAt(i)));
            IntChars.append("\n");
        }
        return IntChars.toString();
    }
}
