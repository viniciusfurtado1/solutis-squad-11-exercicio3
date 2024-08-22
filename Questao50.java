public class Main {
    public static void main(String[] args) {

        long num1 = 1, num2 = 1;


        System.out.println(num1);
        System.out.println(num2);


        for (int i = 3; i <= 50; i++) {
            long proximoNumero = num1 + num2;
            System.out.println(proximoNumero);

           
            num1 = num2;
            num2 = proximoNumero;
        }
    }
}
