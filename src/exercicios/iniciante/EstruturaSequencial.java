package exercicios.iniciante;

public class EstruturaSequencial {

/*

1 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

2 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

6 - Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

*/

    public int soma(int num1, int num2) {
        return num1+num2;
    }

    public double areaCirculo(double raio) {
        double pi = 3.14159;
        return pi * Math.pow(raio, 2);
    }

    public int diferencaProduto(int productA, int productB, int productC,int productD) {
        return (productA * productB) - (productC * productD);
    }

    public String empregadoDetalhes(int numeroEmpregado, double horasTrabalhadas, double valorPorHora) {
        return "Number = " + numeroEmpregado + "\n" + "Salary = U$" + (horasTrabalhadas * valorPorHora);
    }

    public String calculaPeca(int codPeca1, int codPeca2, int qtdPeca1, int qtdPeca2, double vlUnitPeca1, double vlUnitPeca2) {
        double result = (qtdPeca1 * vlUnitPeca1) + (qtdPeca2 * vlUnitPeca2);
        return "VALOR A PAGAR: R$" + result;
    }

    public String caculoArea(double A, double B, double C) {
        double triangulo = A * C / 2.0;
        double circulo = 3.14159 * C * C;
        double trapezio = (A + B) / 2.0 * C;
        double quadrado = B * B;
        double retangulo = A * B;

        return String.format(
                "Triangulo: %.3f\nCirculo: %.3f\nTrapezio: %.3f\nQuadrado: %.3f\nRetangulo: %.3f",
                triangulo, circulo, trapezio, quadrado, retangulo
        );


    }

}
