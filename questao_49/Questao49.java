package questao_49;

public class Questao49 {

    public static void main(String[] args) {
        long posterior = 1, anterior = 1;

        System.out.print(anterior + ", " + posterior);

        for(int i = 2; i < 50; i++){
            posterior = posterior + anterior;
            anterior = posterior - anterior;
            System.out.print(", " + posterior);
        }
    }
}
