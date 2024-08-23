package questao_30;

class Retangulo {
    Ponto inferiorEsquerdo;
    Ponto superiorDireito;

    Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        Ponto[] pontos = {p1, p2, p3, p4};

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (Ponto p : pontos) {
            if (p.x < minX) minX = p.x;
            if (p.y < minY) minY = p.y;
            if (p.x > maxX) maxX = p.x;
            if (p.y > maxY) maxY = p.y;
        }

        inferiorEsquerdo = new Ponto(minX, minY);
        superiorDireito = new Ponto(maxX, maxY);
    }

    boolean ehValido(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        int[] x = {p1.x, p2.x, p3.x, p4.x};
        int[] y = {p1.y, p2.y, p3.y, p4.y};

        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            if (x[i] < minX) minX = x[i];
            if (x[i] > maxX) maxX = x[i];
            if (y[i] < minY) minY = y[i];
            if (y[i] > maxY) maxY = y[i];
        }

        int countMinX = 0, countMaxX = 0, countMinY = 0, countMaxY = 0;
        for (int i = 0; i < 4; i++) {
            if (x[i] == minX) countMinX++;
            if (x[i] == maxX) countMaxX++;
            if (y[i] == minY) countMinY++;
            if (y[i] == maxY) countMaxY++;
        }

        return (countMinX == 2 && countMaxX == 2 && countMinY == 2 && countMaxY == 2);
    }

    boolean seInterceptam(Retangulo outro) {

        return !(this.superiorDireito.x < outro.inferiorEsquerdo.x ||
                this.inferiorEsquerdo.x > outro.superiorDireito.x ||
                this.superiorDireito.y < outro.inferiorEsquerdo.y ||
                this.inferiorEsquerdo.y > outro.superiorDireito.y);
    }
}