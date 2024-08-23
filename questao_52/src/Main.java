package questao_52.src;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
    	
        BigDecimal[][] tabuleiro = new BigDecimal[8][8];
        BigDecimal graoInicial = new BigDecimal("1");
        BigDecimal soma = new BigDecimal("0");
        
        //preencher tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
            	
            	tabuleiro[i][j] = graoInicial;
                graoInicial = graoInicial.multiply(new BigDecimal("2"));
                 
            }
        }
        
        //somar todos valores
        for (int i = 0; i < tabuleiro.length; i++) {
        	
            for (int j = 0; j < tabuleiro.length; j++) soma = soma.add(tabuleiro[i][j]);
                 
        }
        
        System.out.println("Valor total: " + soma);
    }
}