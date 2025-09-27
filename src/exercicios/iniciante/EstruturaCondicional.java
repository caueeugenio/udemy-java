/*

✅ 1. Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

✅ 2. Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

✅ 3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

4. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


5. Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
6. Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
7. Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
8.Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

* */

package exercicios.iniciante;

import java.util.Scanner;

public class EstruturaCondicional {

    public String isPositiveOrNegative() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a integer number:");
        int num = sc.nextInt();
        sc.close();

        if(num >= 0 ) {
            return "This number " + num + " positive.";
        } else {
            return "This number " + num + " negative.";
        }
    }

    public String isOddOrEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a integer number:");
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0 ) {
            return "This number " + num + " is even.";
        }
        return "This number " + num + " is odd.";
    }

    public String isMultiple() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the first number:");
        int num1 = sc.nextInt();
        System.out.print("Insert the second number:");
        int num2 = sc.nextInt();
        sc.close();

        if(num1 == 0 || num2 == 0) {
            return "The number cannot be zero.";
        } else if(num1 > num2) {
            return num1 % num2 == 0 ? "They are multiples." : "They aren't multiples.";
        } else {
            return num2 % num1 == 0 ? "They are multiples." : "They aren't multiples.";
        }
    }

    public String gameDuration() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial game hour:");
        int initialHour = sc.nextInt();
        System.out.print("End game hour:");
        int endHour = sc.nextInt();
        sc.close();
        int gameResultDuration = (initialHour + endHour);
        if(gameResultDuration < 1) {
            return "The minimum game duration is 1 hour.";
        } else if(gameResultDuration > 24) {
            return "The maximum game duration is 24 hour.";
        }

        return "The total game hour is " + (initialHour + endHour) + "hour.";


    }
}
