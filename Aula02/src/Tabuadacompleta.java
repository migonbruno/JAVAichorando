
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
2 x 10 = 20S
 */
public class Tabuadacompleta {
    public static void main(String[] args) {
        System.out.println("Tabuada de multiplicar");
        System.out.println("");
        for(int j=1;j<=10;j++){
       // int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int i = 0;
        while (i <= 10){
            int r = j * i;
            System.out.println(j+" x "+i+" = "+r);
        i++;    
        } 
      System.out.println("");
    }          
    }
}
