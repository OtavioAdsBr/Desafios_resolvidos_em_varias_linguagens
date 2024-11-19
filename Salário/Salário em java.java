import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = (leitorDeEntradas.nextFloat());

        float valorImposto = 0;
        if (valorSalario > 0 && valorSalario > 0) {
            valorImposto = 0.05F * valorSalario;
        }  else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }
        


        float saida = valorSalario - valorImposto - valorBeneficios;
        System.out.println(String.format("R$ %.2f", saida));

    }
}
