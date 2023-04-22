import java.util.Scanner;

class Main {
  /* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$ */
  public static void main(String[] args) {

    // declaração da variáveis 
    Scanner input = new Scanner(System.in);
    String texto = "Insira quanto voce ganha por hora: ";
    String textoDois = "Insira quantas horas voce trabalha por mes: ";
    float horaV, horaM, liquido, bruto, ir, inss, sind;
   
    // Pergunte ao usuario
    System.out.print(texto);
    horaV = input.nextFloat();
    System.out.println(textoDois);
    horaM = input.nextFloat();

    // Calculo
    bruto = (horaV * horaM);
    ir = (bruto * 0.11f);
    inss = (bruto * 0.08f);
    sind = (bruto * 0.05f);
    liquido = (bruto - ir - inss - sind );
    
    // Imprimir
    System.out.printf("Seu salario bruto eh de R$ %.2f. /n Foi descontado do INSS o valor de R$ %.2f. /n Foi descontado do Imposto de Renda o valor de R$ %.2f. /n E de taxa sindical foi descontado R$ %.2f. /n Seu salario liquido e de: R$ %.2f", bruto, inss, ir, sind, liquido);
    

    input.close();
  }
}





