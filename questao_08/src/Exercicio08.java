package questao_08.src;

public class Exercicio08 {
    public static void main(String[] args) {
        int num, den;
        float rac;

        num = 2; den = 0; // exemplo de caso: denominador = 0
        if (den == 0) {
            System.out.println(num + "/" + den + "\nALERTA: o denominador é zero!");
        } else {
            rac = (float) num / den;
            System.out.println(num + "/" + den + " = " + rac);
        }
    }
}