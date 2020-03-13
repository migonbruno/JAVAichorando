
import javax.swing.JOptionPane;

/*
 Exercicio 03: Estrutura FOR
Inserir 5 nomes de funcionários e seus salários brutos.
Para cada funcionário faça os seguintes cálculos:
inss
salbruto >= 1800 = 11%
salbruto <1800 e salbruto >= 1200 = 9%
salbruto < 1200 = 8%
saláro liquido
salbruto - inss
obs.: mostrar com o contador a posição de cada funcionário
 */
public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Folha de Pagamento");
        System.out.println("");
        for(int i=1;i<=5;i++){
            String nome = JOptionPane.showInputDialog("Nome: ");
            double sal = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
            
            double inss = 0;
            
            if(sal >=1800){
             // inss = sal * 0.11;
                inss = (sal/100) * 11;
            }else if(sal<1800 && sal>=1200) {
             // inss = sal * 0.09;
                inss = (sal/100) * 9;
            }else{
                // inss = sal * 0.08;
                inss = (sal/100) * 8;
            }
            
            double liq = sal - inss;
            
            System.out.println("Funcionário: "+i);
            System.out.println("Nome: "+nome);
            System.out.println("Salário: "+sal);
            System.out.println("INSS: "+inss);
            System.out.println("Salário Líquido: "+liq);
            System.out.println("");
                    
        }
    }
}
