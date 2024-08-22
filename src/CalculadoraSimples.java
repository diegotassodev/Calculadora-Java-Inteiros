
import javax.swing.JOptionPane;

/**
 * Modelo Simples de Calculadora de Inteiros
 * @author Diego Tasso
 */

public class CalculadoraSimples {
    public static void main (String [] args) {
        
        //Criação da variável de Loop
        boolean continuar = true;
        
        // Diálogo inicial.
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo a Calculadora de inteiros em Java", "Calculadora Simples", JOptionPane.PLAIN_MESSAGE);
        
        // Loop de continuação  
        while (continuar) {
            
            // Criação da variável para decisão do tipo de cálculo.
            String tipoCalculo = JOptionPane.showInputDialog("Escreva que tipo de cálculo você deseja realizar (SO) para soma, (M) para multiplicação, (D) para divisão, (SU) para subtração");

            // Criação das variáveis numéricas.
            int primeiroNumero = Integer.parseInt (JOptionPane.showInputDialog ("Me diga o valor do primeiro número: "));
            int segundoNumero = Integer.parseInt (JOptionPane.showInputDialog ("Me diga o valor do segundo número: "));
            
            // Verificação dos casos para soma - multiplicação - divisão - subtração
            if (null != tipoCalculo) {
                switch (tipoCalculo) {
                case "SO":
                    int resultado = primeiroNumero + segundoNumero;
                    JOptionPane.showMessageDialog(null, "O resultado da soma entre "+ primeiroNumero + "+" + segundoNumero + "=" + resultado, "Resultado Soma", JOptionPane.PLAIN_MESSAGE);
                    break;
                case "M":
                    int resultado2 = primeiroNumero * segundoNumero;
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação entre "+ primeiroNumero + "X" + segundoNumero + "=" + resultado2, "Resultado Multiplicação", JOptionPane.PLAIN_MESSAGE);
                    break;
                case "D":
                    int resultado3 = primeiroNumero / segundoNumero;
                    JOptionPane.showMessageDialog(null, "O resultado da divisão entre "+ primeiroNumero + "/" + segundoNumero + "=" + resultado3, "Resultado Divisão", JOptionPane.PLAIN_MESSAGE);
                    break;
                case "SU":
                    int resultado4 =  primeiroNumero - segundoNumero;
                    JOptionPane.showMessageDialog(null, "O resultado da subtração entre "+ primeiroNumero + "-" + segundoNumero + "=" + resultado4, "Resultado Subtração", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    break;
                }
            }
            
            // Alteração no valor da variável para continuação do loop.
            continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer outro cálculo?", "Continuar?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }
    }
}
