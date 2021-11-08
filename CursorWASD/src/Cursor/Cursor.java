package Cursor;

import java.util.Scanner;

public class Cursor {
	static int [][]mapa=new int[3][3];
	static int [][]mapaView=new int[3][3];
	
	static int filaActual;
	static int columnaActual;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String palabra;
		char index;
		int menu=0;
		int fila;
		int columna;
		 mapaView[1][1]=1;
		for(int f=0;f<mapaView.length;f++) {
			for(int c=0;c<mapaView[2].length;c++) {
				System.out.print(mapaView[f][c]+"\t");
				filaActual=1;
				columnaActual=1;
			}
			System.out.println();
		}
		
		do {
			
			
			
			palabra=sc.next();
			index=palabra.charAt(0);
			
			
			switch(index) {
			case 'w': 
				encontrarCursor();
				resetMapa();
				dibujarMapa(filaActual-1,columnaActual);
				break;
				
			case 's':
				encontrarCursor();
				resetMapa();
				dibujarMapa(filaActual+1,columnaActual);
				break;
				
			case 'a':
				encontrarCursor();
				resetMapa();
				dibujarMapa(filaActual,columnaActual-1);
				break;
				
			case 'd':
				encontrarCursor();
				resetMapa();
				dibujarMapa(filaActual,columnaActual+1);
				break;
			}
			
			
			
			
			
			
		}while(menu==0);
		

	}
	
	private static void encontrarCursor() {
		for(int f=0;f<mapa.length;f++) {
			for(int c=0;c<mapa[2].length;c++) {
				if(mapa[f][c]==1) {
					filaActual=f;
					columnaActual=c;
				}
			}
		}
	}
	
	

	private static void dibujarMapa(int fila, int columna) {
		try {
		for(int f=0;f<mapa.length;f++) {
			for(int c=0;c<mapa[2].length;c++) {
				mapa[fila][columna]=1;
			}
			System.out.println();
		}
		
		
		for(int f=0;f<mapa.length;f++) {
			for(int c=0;c<mapa[2].length;c++) {
				
				System.out.print(mapa[f][c]+"\t");
			}
			System.out.println();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Te has pasado del mapa");
		}
	}
	
	private static void resetMapa() {
		for(int f=0;f<mapa.length;f++) {
			for(int c=0;c<mapa[2].length;c++) {
				mapa[f][c]=0;
			}
		}
	}

}
