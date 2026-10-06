
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu primeiro número: "));
        int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu segundo número: "));
        while (numeroA <= numeroB) {
            soma += numeroA;
            numeroA++;
        }
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    }
}