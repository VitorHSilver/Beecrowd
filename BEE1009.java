package exemplos.Beecrowd;

/* SALARIO COM BôNUS


 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais,
 representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double total_sale = sc.nextDouble();

        double total = total_sale * 0.15 + salary;
        // Saida
        System.out.printf("CLIENTE: %s%n", name);
        System.out.printf("TOTAL R$ %.2f%n ", total);

        sc.close();
    }
}
