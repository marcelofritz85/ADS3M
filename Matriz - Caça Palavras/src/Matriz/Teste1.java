package Matriz;

import java.util.Scanner;

public class Teste1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia=new Scanner(System.in);

		char m[][]= new char[20][20]; 
		
		int tamanho1;
		String palavra;
	
		int x=0;
		int linha=0;
		int coluna1 = 3;
	//________________________________________________________________
		int tamanho2;
		String palavra2;
	
		int y=0;
		int linha2=0;
		int coluna2 = 3;
	//________________________________________________________________
	while(x<3){	
		System.out.println("Digite a palavra (horizontal)");
		palavra=leia.nextLine();
		
		tamanho1=palavra.length();
		
		char v[]=new char[tamanho1];
		
		for(int i=0;i<tamanho1;i++){
			
			m[0+linha][i]=palavra.charAt(i);
			
			
		}
		linha=linha+1;
		coluna1=coluna1+3;
		x=x+1;
	
	}//while	
	//________________________________________________________________
	while(y<3){	
		System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine();
		
		tamanho2=palavra2.length();
		
		char v[]=new char[tamanho2];
		
		for(int i=0;i<tamanho2;i++){
			
			m[i+linha2][0+coluna2]=palavra2.charAt(i);
			
			
		}
		linha2=linha2+1;
		coluna2=coluna2+3;
		y=y+1;
	
	}//while
	
	//_______________________________________________________________
	 for(int i=0;i<m.length;i++){
		 
		 for(int j =0;j<m[i].length;j++){
			System.out.print(m[i][j]+"|");				 
		 }
		 System.out.println();
	 }

		 	


	}

}
