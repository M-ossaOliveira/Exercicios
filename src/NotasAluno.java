import java.util.Locale;
import java.util.Scanner;

public class NotasAluno {
    public static void main (String[] args){
        /*Desafio: Escreva um programa que armazene 4 notas de um aluno
        em um array e calcule a média final, indicando se o aluno foi aprovado
         ou reprovado (média 7).*/

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        double [] vect= new double[4];
        double soma=0;

        System.out.println("Insira as notas do aluno");
        for(int i =0; i<4; i++){
            System.out.println("Insira a "+(i+1)+"a nota");
            vect[i]=s.nextDouble();
            soma+=vect[i];
        }

        double media=soma/4;

        System.out.printf("A média do aluno valor %.2f%n",media);
        if(media>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        s.close();
    }

}
