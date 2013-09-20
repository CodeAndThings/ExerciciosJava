/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

/**
 *
 * @author JoãoM
 */
public class StopSalmonella {
    private final double _PrecoPorParticipante = 150.0;
    private int _NumeroDeParticipantes;
    
    public StopSalmonella(int NumeroDeParticipantes) throws Exception
    {
        if (NumeroDeParticipantes <= 0)
            throw new Exception("O número de participantes não pode ser 0");
        _NumeroDeParticipantes = NumeroDeParticipantes;
    }
    
    public Boolean TamanhoDoEvento() throws Exception
    {
        return _NumeroDeParticipantes > 100;
    }
    
    public double ValorTotal() throws Exception
    {
        return _NumeroDeParticipantes * _PrecoPorParticipante;
    }
}
