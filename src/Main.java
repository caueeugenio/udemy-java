import exercicios.ExerciciosIniciante;

public class Main {
    public static void main(String[] args) {
        ExerciciosIniciante exercicios = new ExerciciosIniciante();
        int num1 = 10, num2 = 30;
        double raio = 2.0;

        int resultExercise01 = exercicios.soma(num1,num2);
        double resultExercise02 = exercicios.areaCirculo(raio);
        int resultExercise03 = exercicios.diferencaProduto(5,6,7,8);
        String resultExercise04 = exercicios.empregadoDetalhes(25,100,5.50);
        String resultExercise05 = exercicios.calculaPeca(12, 16, 1, 2, 5.30, 5.10);
        String resultExercise06 = exercicios.caculoArea(3.0, 4.0, 5.2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + resultExercise01);
        System.out.println("\n");
        System.out.println("The area of a circle with radius " + raio + " is: " + String.format("%.4f", resultExercise02));
        System.out.println("\n");
        System.out.println("Diferença: " + resultExercise03);
        System.out.println("\n");
        System.out.println(resultExercise04);
        System.out.println("\n");
        System.out.println(resultExercise05);
        System.out.println("\n");
        System.out.println(resultExercise06);

    }
}