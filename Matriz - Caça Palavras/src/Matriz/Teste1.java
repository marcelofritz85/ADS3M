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
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][9]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][10]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][11]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][12]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][13]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][14]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][15]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][16]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][17]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][18]=temp7;
//		}
//	for(int i=0; i<20;i++){
//		char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//		char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//		m[i][19]=temp7;
//		}
//	
//	
	
	System.out.println("1)");
	 for(int i=0;i<m.length;i++){
		 
		 for(int j =0;j<m[i].length;j++){
			System.out.print(m[i][j]+"|");				 
		 }
		 System.out.println();
	 }
	 
	 System.out.println("_________________________________________");
	 System.out.println("_________________________________________");
	
	//________________________________________________________________
	 System.out.println("2)");
	while(x<3){	
		System.out.println("Digite a palavra (horizontal)");
		palavra=leia.nextLine().toUpperCase();
		
		
		tamanho1=palavra.length();
		
		char v[]=new char[tamanho1];
		
		for(int i=0;i<tamanho1;i++){
			
			m[0+linha][i+1]=palavra.charAt(i);
			
			
		}
		linha=linha+2;
		//coluna1=coluna1+3;
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
	 System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine().toUpperCase();
		
		tamanho2=palavra2.length();
		
		char v1[]=new char[tamanho2];
		
		for(int i=0;i<tamanho2;i++){
			
			m[i][0]=palavra2.charAt(i);
			
			
		}

	//________________________________________________________________
	 
	//while(y<3){	
		System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine().toUpperCase();
		
		tamanho2=palavra2.length();
		
		char v2[]=new char[tamanho2];
		
		for(int i=0;i<tamanho2;i++){
			
			m[i][6]=palavra2.charAt(i);
			
			
		}
		//linha2=linha2+1;
		//coluna2=coluna2+1;
		//y=y+1;
	
	//}//while
		//_______________________________________________________________
	 //System.out.println("4)");
			//while(y<3){	
		System.out.println("Digite a palavra (vertical)");
		palavra2=leia.nextLine().toUpperCase();
				
		tamanho2=palavra2.length();
				
		char v3[]=new char[tamanho2];
				
		for(int i=0;i<tamanho2;i++){
					
			m[i][7]=palavra2.charAt(i);
					
					
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
		 	

	//________________________________________________________________
		
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][0]=temp7;
//			
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][1]=temp7;
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][2]=temp7;
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][3]=temp7;
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][4]=temp7;
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][5]=temp7;
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][6]=temp7;
//			}
//		for(int i=0; i<8;i++){
//			char templetras[]={'a', 'b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','x','z'};
//			char temp7 = (templetras[new Random().nextInt(templetras.length)]);
//			m[i][7]=temp7;
//			}
		//____________________________________________________________________________


	}

}
