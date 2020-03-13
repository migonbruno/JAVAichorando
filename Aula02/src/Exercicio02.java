
import javax.swing.JOptionPane;

/*
 Exercício 02: Estrutura FOR (para)
Testar 10 números inteiros e verificar se é par ou impar.
*/
public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Verificação de números");
        for(int i=1;i<=10;i++){
            int x = Integer.parseInt(JOptionPane.showInputDialog("Número"));
            if(x %2==0){
                System.out.println(x+" é par.");
            }else{
                System.out.println(x+" é impar.");
            }
        }
    }
}
