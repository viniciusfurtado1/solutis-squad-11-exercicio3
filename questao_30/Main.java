package lista3.questao_30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ponto[] vertices = new Ponto[4];
        Retangulo primeiroRetangulo = null, segundoRetangulo = null;

        for (int i = 1; i <= 2; i++) {
            System.out.printf("\nDigite as coordenadas dos 4 vertices do retangulo %s: ", i);

            for (int j = 0; j < 4; j++) {
                System.out.print("\nVertice " + (j + 1) + " (x y): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                vertices[j] = new Ponto(x, y);
            }

            Retangulo retangulo = new Retangulo(vertices[0], vertices[1], vertices[2], vertices[3]);

            if (!retangulo.ehValido(vertices[0], vertices[1], vertices[2], vertices[3])) {
                System.out.println("Os pontos fornecidos nao formam um retangulo valido.");
                return;
            }

            if (i == 1) primeiroRetangulo = retangulo;
             else segundoRetangulo = retangulo;
        }

        if (primeiroRetangulo.seInterceptam(segundoRetangulo)) {
            System.out.println("Os retangulos se interceptam!");
        } else {
            System.out.println("Os retangulos nao se interceptam.");
        }

        scanner.close();
    }
}
