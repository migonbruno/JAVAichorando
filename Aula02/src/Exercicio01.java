/*
 Exercício 01: Estrutura FOR (para)
Verificar os números de 20 a 50 e mostrar os números pares.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Números pares entre 20 e 50");
        for(int i=20;i<=50;i++){
            if(i %2==0){
                System.out.println(i);
            }
        }
    }
}
