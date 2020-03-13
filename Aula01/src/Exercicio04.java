
import javax.swing.JOptionPane;

/*
 Exercício 04: Estrutura de Decisão composta
 */
public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Comparação de números");
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("1º Valor"));
        
        int y = Integer.parseInt(JOptionPane.showInputDialog("2º Valor"));
        
        /*
        if(x > y){
            System.out.println(x+" é maior que "+y);
        }else if(x < y){
            System.out.println(x+" é menor que "+y);
        }else{
            System.out.println(x+" é igual a "+y);
        }
        */
        
        if(x > y){
            System.out.println(x+" é maior que "+y);
        }
        if(x < y){
            System.out.println(x+" é menor que "+y);
        }
        if(x == y){
            System.out.println(x+" é igual a "+y);
        }
    }
}
