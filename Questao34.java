public class NumerosPares {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int numero = random.nextInt(1, 101);
            System.out.println(numero);
        }
    }
}
