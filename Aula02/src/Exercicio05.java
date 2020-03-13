
import javax.swing.JOptionPane;

/*
 Exercício 05: Estrutura WHILE (enquanto)
Produzir na tela uma tabuada de multiplicar por um número escolhido pelo usuário.
Multiplique este número por 0 até 10 e apresente na tela o seguinte resultado:
ex.:
2 x 0 = 0
2 x 1 = 2
.
.
.
2 x 10 = 20
 */
public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Tabuada de multiplicar");
        System.out.println("");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        int i = 0;
        while (i <= 10){
            int r = num * i;
            System.out.println(num+" x "+i+" = "+r);
        i++;    
        }
        
        
        
    }
}
