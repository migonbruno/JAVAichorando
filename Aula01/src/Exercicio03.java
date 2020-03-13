
import javax.swing.JOptionPane;

/*
 Exerício 03: Estrutura de Decisão Simples
 */
public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Escola do saber");
        System.out.println("");
        String nome =JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Prova 01:"));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Prova 02:"));
        
        double media = (p1+p2)/2;
        
        String situacao = "";
        
         if(media>= 6){
             situacao = "Aprovado";
         }else{
             situacao ="Reprovado";
         }
         
         System.out.println("Resultado da Aplicação");
         System.out.println("");
         System.out.println("Nome: "+nome);
         System.out.println("Idade: "+idade);
         System.out.println("Prova 01: "+p1);
         System.out.println("Prova 02: "+p2);
         System.out.println("Média: "+media);
         System.out.println("Situação: "+situacao);
    }
}
