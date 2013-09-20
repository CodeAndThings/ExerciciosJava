/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import com.sun.media.sound.MidiUtils;

/**
 *
 * @author JoãoM
 */
public class AceleracaoMedia {
    
    private int _VelocidadeInicial;
    private int _VelocidadeFinal;
    private int _Tempo;
    
    public AceleracaoMedia(int VelocidadeInicial, int VelocidadeFinal, int Tempo) throws Exception
    {
        if (VelocidadeFinal <= 0)
            throw new Exception("A velocidade final não pode ser zero");
        
        if (VelocidadeInicial < 0)
            throw new Exception("A velocidade final não pode ser zero");
        
        if (Tempo <= 0)
            throw new Exception("A velocidade final não pode ser zero");
        
        _VelocidadeInicial = VelocidadeInicial;
        _VelocidadeFinal = VelocidadeFinal;
        _Tempo = Tempo;
    }
    
    public int AceleracaoMedia()
    {
        return (_VelocidadeFinal - _VelocidadeInicial) / _Tempo;
    }        
}
