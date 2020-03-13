/*
 Exercício 04: Estrutura WHILE (enquanto)
Produzir na tela os números ímpares de 1 a 9
 */
public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 1 a 9");
        int i = 1;
        
        while(i<=9){
            if(i %2==1){
                System.out.println(i);
            }
        i++;    
        }
    }
}
