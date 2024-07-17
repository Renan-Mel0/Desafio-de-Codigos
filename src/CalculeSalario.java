import java.util.Scanner;

public class CalculeSalario {

    public static void main(String[] args) {
    //lê os valores de entrada:
    Scanner leitorDeEntradas = new Scanner(System.in);
    float valorSalario = leitorDeEntradas.nextFloat();
    float valorBeneficios = leitorDeEntradas.nextFloat();

    float valorImposto = 0;
    if (valorSalario >= 0 && valorSalario <=1100) {
        //atenção: atribuir valor de aliquota de 5% mediante o salario
        valorImposto = 0.05f * valorSalario;
    }else if (valorSalario >= 1100.01 && valorSalario <= 2500.0) {
        valorImposto = 0.10f * valorSalario;
    }else {
        valorImposto = 0.15f * valorSalario;
    }
       //Calcule e imprime a saida (com 2 casas decimais):
       float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
    
}