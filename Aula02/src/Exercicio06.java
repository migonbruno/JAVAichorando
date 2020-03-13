import javax.swing.JOptionPane;

/*
 Exercício 06: Estrutura CASE
 */
public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Operações Básicas");
        System.out.println("");
        
        
        int x = Integer.parseInt
        (JOptionPane.showInputDialog("1º Valor:"));
        int y = Integer.parseInt
        (JOptionPane.showInputDialog("2º Valor:"));
        
       
        
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Média");
        System.out.println("");
      
        
       
        
        String op = JOptionPane.showInputDialog("OPÇÃO:");
        
        int resp = JOptionPane.YES_OPTION;
        while(resp == JOptionPane.YES_OPTION){
      
        switch(op){
            case "1":
                System.out.println("SOMA");
                int soma = x + y;
                System.out.println(x+" + "+y+" = "+soma);
            break;
            case "2":
                System.out.println("SUBTRAÇÃO");
                int sub = x - y;
                System.out.println(x+" - "+y+" = "+sub);
            break;
            case "3":
                System.out.println("MULTIPLICAÇÃO");
                int mult = x * y;
                System.out.println(x+" X "+y+" = "+mult);
            break;
            case "4":
                System.out.println("DIVISÃO");
                double divi = x / y;
                System.out.println(x+" / "+y+" = "+divi);
            break;
            case "5":
                System.out.println("MÉDIA");
                double media = (x + y)/2;
                System.out.println
            ("A média de "+x+" com "+y+" é "+media);
            break;
            default:
                System.out.println("Opção inválida");
        }
        resp = JOptionPane.showConfirmDialog(null,"Deseja continuar?","Confirm",JOptionPane.YES_NO_OPTION);
        if(resp == JOptionPane.YES_OPTION){
            op = JOptionPane.showInputDialog("OPÇÃO");
        }
        
        }     
    }   
}
