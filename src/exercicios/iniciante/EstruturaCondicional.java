/*

✅ 1. Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

✅ 2. Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

✅ 3. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

✅4. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


✅5. Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

✅6. Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
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

import java.util.Locale;
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
        int gameResultDuration;

        if(initialHour < endHour) {
            gameResultDuration = endHour - initialHour;
            return "The game duration was " + gameResultDuration + "h";
        } else {
            gameResultDuration = 24 - initialHour + endHour;
            return "The game duration was " + gameResultDuration + "h";
        }

    }

    public String totalOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CODIGO | ESPECIFICACAO | PRECO");
        System.out.println("1 | Cachorro Quente | R$ 4.00");
        System.out.println("2 | X-Salada        | R$ 4.50");
        System.out.println("3 | X-Bacon         | R$ 5.00");
        System.out.println("4 | Torrada simples | R$ 2.00");
        System.out.println("5 | Refrigerante    | R$ 1.50");

        System.out.println("Insert the code:");
        int orderNumber = sc.nextInt();

        System.out.println("Insert the quantity:");
        int orderQuantity = sc.nextInt();

        switch(orderNumber) {
            case 1:
                return "You chose " + orderQuantity+ "x Cachorro Quente and the total is R$ " + orderQuantity * 4.00;
            case 2:
                return "You chose " + orderQuantity+ "x X-Salada and the total is R$ " + orderQuantity * 4.50;
            case 3:
                return "You chose " + orderQuantity+ "x X-Bacon and the total is R$ " + orderQuantity * 5.00;
            case 4:
                return "You chose " + orderQuantity+ "x Torrada simples and the total is R$ " + orderQuantity * 2.00;
            case 5:
                return "You chose " + orderQuantity+ "x Refrigerante and the total is R$ " + orderQuantity * 1.50;
            default:
                return "Insert a valid code.";
        }
    }

    public String interval() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert an interval");
        double newInterval = sc.nextDouble();
        // ([0,25], (25,50], (50,75], (75,100])
        if(newInterval <= 25) {
            return "Intervalo entre [0,25]";
        } else if(newInterval > 25 && newInterval <= 50) {
            return "Intervalo entre [25,50]";
        } else if(newInterval > 50 && newInterval <= 75) {
            return "Intervalo entre [50,75]";
        } else if(newInterval > 75 && newInterval <= 100) {
            return "Intervalo entre [75,100]";
        } else {
            return "Fora do intervalo";
        }
    }

    public String coordenations() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert first value: ");
        double x = sc.nextDouble();
        System.out.println("Insert second value: ");
        double y = sc.nextDouble();
        sc.close();

        if (x == 0.0 && y == 0.0) {
            return "Origem";
        }
        else if (x == 0.0) {
            return "Eixo Y";
        }
        else if (y == 0.0) {
            return("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            return "Q1";
        }
        else if (x < 0.0 && y > 0.0) {
            return "Q2";
        }
        else if (x < 0.0 && y < 0.0) {
            return "Q3";
        }
        else {
           return "Q4";
        }

    }

    public String tax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert salary: ");
        double salary = sc.nextDouble();

        if(salary >= 0 && salary <= 2000) {
            return "Isento";
        } else if(salary >= 2000.01 && salary <= 3000) {
            return "8%";
        } else if(salary >= 3000.01 && salary <= 4500) {
            return "18%";
        } else if(salary > 4500) {
            return "28%";
        }

        return "invalid number";
    }
}
