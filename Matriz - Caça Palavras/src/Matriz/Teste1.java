package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Teste1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia=new Scanner(System.in);
		
		
		char m[][]= new char[8][8]; 
		int a=1;
		
		int tamanho1;
		String palavra;
	
		int x=0;
		int linha=0;
		int coluna1 = 1;
	
		int tamanho2;
		String palavra2;
	
		int y=0;
		int linha2 = 0;
		int coluna2 = 0;
		
	
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][8]=temp7;
//		}

	
	System.out.println("1)");
	 for(int i=0;i<m.length;i++){
		 
		 for(int j =0;j<m[i].length;j++){
			System.out.print(m[i][j]+"|");				 
		 }
		 System.out.println();
	 }
	 
	 
	
	//________________________________________________________________
	 System.out.println("2)");
	loop1: while(x<3){	
		
		System.out.println("Digite a palavra (horizontal)");
		palavra=leia.nextLine().toUpperCase();
		
			if(palavra.length()>8){
				System.out.println("Informe a palavra com no maximo 8 letras! ");
				continue loop1;
			}
		
			tamanho1=palavra.length();
			for(int i=0;i<tamanho1;i++){
				
			m[0+linha][i+1]=palavra.charAt(i);
			
			}
		
		linha=linha+2;
		
		x=x+1;
		
	}//while
	//________________________________________________________________
	System.out.println("3)");
	 for(int i=0;i<m.length;i++){
		 System.out.print("|");
		 
		 for(int j =0;j<m[i].length;j++){
			 
			System.out.print(m[i][j]+"|");				 
		 }
		 System.out.println();
	 }
	//________________________________________________________________
	 System.out.println("4)");
	 loop2:while(a==1){ System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine().toUpperCase();
		
		if(palavra2.length()>8){
			System.out.println("Informe a palavra com no maximo 8 letras! ");
			continue loop2;
		}
		
		tamanho2=palavra2.length();
		
		//char v1[]=new char[tamanho2];
		
		for(int i=0;i<tamanho2;i++){
			
			m[i][0]=palavra2.charAt(i);
			
			
		}
		a=2;
	 }//while
	//________________________________________________________________
	 

	 int b=1;
	 loop3:while(b==1){ System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine().toUpperCase();
		
		if(palavra2.length()>8){
			System.out.println("Informe a palavra com no maximo 8 letras! ");
			continue loop3;
		}
		
		tamanho2=palavra2.length();
		
		//char v2[]=new char[tamanho2];
		
		for(int i=0;i<tamanho2;i++){
			
			m[i][6]=palavra2.charAt(i);
			
			
		}
	
		b=2;
	}//while
		
		//_______________________________________________________________
	
	 	int c = 1;
		loop4:while(c==1){ System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine().toUpperCase();
		
				if(palavra2.length()>8){
					System.out.println("Informe a palavra com no maximo 8 letras! ");
					continue loop4;
				}
				
			tamanho2=palavra2.length();
					
			//char v3[]=new char[tamanho2];
					
			for(int i=0;i<tamanho2;i++){
						
				m[i+1][7]=palavra2.charAt(i);
						
					
			}
			c=2;
		}
	//_______________________________________________________________
	System.out.println("5)");
	 for(int i=0;i<m.length;i++){
		 System.out.print("|");
		 
		 for(int j =0;j<m[i].length;j++){
			 
			System.out.print(m[i][j]+"|");				 
		 }
		 System.out.println();
	 }
	//________________________________________________________________
		 	



	}

}

