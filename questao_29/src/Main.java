package questao_29.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static class Pair<X1 extends Number, X2 extends Number>{
		
		public X1 xc;
		public X2 yc;
		public Pair(X1 xc, X2 yc) {
			this.xc = xc;
			this.yc = yc;
		}
		
		public boolean verificarRetangulo(Pair<Integer, Integer> c1) {
			
			if(this.xc == c1.xc && this.yc == c1.yc) 
				System.out.println("É um ponto");
			else if(this.xc == c1.xc && this.yc != c1.yc)
				System.out.println("É uma reta vertical");
			else if(this.xc != c1.xc && this.yc == c1.yc)
				System.out.println("É uma reta horizontal");
			else {
				System.out.println("É um retângulo");
				return true;
			}
			
			return false;
		}
		
		public int calcularArea(Pair<Integer, Integer> c1) {
			return Math.abs((int)this.xc - (int)c1.xc)*
					Math.abs((int)this.yc - (int)c1.yc);
		}
		
		public int returnBigger(Pair<Integer, Integer> c1, int coord) {
			if(coord == 0) {// eixo X
				if((int)c1.xc > (int)this.xc) return (int)c1.xc;
				else return (int)this.xc;
			}
			else {
				if((int)c1.yc > (int)this.yc) return (int)c1.yc;
			}
			return (int)this.yc;
				
		}
		
		public int returnSmaller(Pair<Integer, Integer> c1, int coord) {
			if(coord == 0) {// eixo X
				if((int)c1.xc < (int)this.xc) return (int)c1.xc;
				else return (int)this.xc;
			}
			else {
				if((int)c1.yc < (int)this.yc) return (int)c1.yc;
			}
			return (int)this.yc;
				
		}
		
		
		public void pontoExtra(Pair<Integer, Integer> c1, Pair<Integer, Integer> p1) {
			if((int)p1.xc > returnBigger(c1, 0) && (int)p1.yc > returnBigger(c1, 1))
				System.out.println("Está acima e à direita");
			else if((int)p1.xc > returnBigger(c1, 0) && (int)p1.yc < returnSmaller(c1, 1))
				System.out.println("Esta embaixo e à direita");
			else if((int)p1.xc < returnSmaller(c1, 0) && (int)p1.yc < returnSmaller(c1, 1))
				System.out.println("Está embaixo e à esquerda");
			else if((int)p1.xc < returnSmaller(c1, 0) && (int)p1.yc > returnBigger(c1, 1))
				System.out.println("Está acima e à esquerda");
			
			else if((int)p1.xc <= returnBigger(c1, 0) && p1.xc >= returnSmaller(c1, 0) && p1.yc > returnBigger(c1, 1))
				System.out.println("Está acima");
			else if((int)p1.xc <= returnBigger(c1, 0) && p1.xc >= returnSmaller(c1, 0) && p1.yc < returnSmaller(c1, 1))
				System.out.println("Está embaixo");
			
			else if((int)p1.yc <= returnBigger(c1, 1) && p1.yc >= returnSmaller(c1, 1) && p1.xc > returnBigger(c1, 0))
				System.out.println("Está à direita");
			else if((int)p1.yc <= returnBigger(c1, 1) && p1.yc >= returnSmaller(c1, 1) && p1.xc < returnSmaller(c1, 0))
				System.out.println("Está à esquerda");
			
			else if((int)p1.yc < returnBigger(c1, 1) && p1.yc > returnSmaller(c1, 1) && p1.xc < returnBigger(c1, 0) && p1.xc > returnSmaller(c1, 0))
				System.out.println("Está dentro do retângulo");
			else System.out.println("Está em cima da linha do retângulo");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Pair<Integer, Integer>> pontos = new ArrayList<>();
		
		for(int i = 0; i<2; i++) {
			int[] coords = new int[2];
			
			System.out.printf("Digite as coordenadas do %d ponto: ", i+1);
			for(int j = 0; j<2; j++) {
				coords[j] = sc.nextInt();
				}
			pontos.add(new Pair<>(coords[0], coords[1]));
		}
		
		if(pontos.get(0).verificarRetangulo(pontos.get(1))) {
			System.out.println("Área: " + pontos.get(0).calcularArea(pontos.get(1)));
			
			// criar outro ponto
			System.out.println("Digite um novo ponto: ");
			pontos.get(0).pontoExtra(pontos.get(1), new Pair<>(sc.nextInt(), sc.nextInt()));
			
			
		}
		
		sc.close();
	}

}
