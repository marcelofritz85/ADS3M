
public class Matriz {
	
	int linha;
	int coluna;
	
	int[][] matriz = new int[9][5];
	
	void criaMatriz(){
		
		/*9-5
		0 0 0 0 0
		0 0 0 1 0
		1 0 0 0 0
		0 1 1 0 1
		1 0 0 0 0
		0 0 1 0 0
		0 1 0 0 1
		1 0 0 1 0
		0 1 1 0 1
		*/
				
		//coluna 1//coluna2//coluna 3//coluna 4//coluna 5
		
		
		matriz[0][0]=0;		matriz[0][1]=0; 	matriz[0][2]=0;		matriz[0][3]=0; 	matriz[0][4]=0;						 
		matriz[1][0]=0; 	matriz[1][1]=0;		matriz[1][2]=0;		matriz[1][3]=1; 	matriz[1][4]=0;
		matriz[2][0]=1;		matriz[2][1]=0;		matriz[2][2]=0;		matriz[2][3]=0; 	matriz[2][4]=0;
		matriz[3][0]=0;		matriz[3][1]=1; 	matriz[3][2]=1;		matriz[3][3]=0;		matriz[3][4]=1;
		matriz[4][0]=1; 	matriz[4][1]=0; 	matriz[4][2]=0;		matriz[4][3]=0; 	matriz[4][4]=0;
		matriz[5][0]=0;		matriz[5][1]=0;		matriz[5][2]=1; 	matriz[5][3]=0; 	matriz[5][4]=0;				 	
		matriz[6][0]=0;		matriz[6][1]=1;		matriz[6][2]=0;		matriz[6][3]=0; 	matriz[6][4]=1;
		matriz[7][0]=1; 	matriz[7][1]=0;		matriz[7][2]=0;		matriz[7][3]=1; 	matriz[7][4]=0;
		matriz[8][0]=0;		matriz[8][1]=1;		matriz[8][2]=1;		matriz[8][3]=0;		matriz[8][4]=1;
		
		
	}
	//---------------------------------------------------------------------------------------------
	
	void mostraMatriz(){
		
		System.out.println("\nA Matriz ficou: \n");
        for(int linha=0 ; linha < 9 ; linha++){
            for(int coluna = 0; coluna < 5 ; coluna++){
            	
                System.out.printf(" %d ",matriz[linha][coluna]);
                
                
            }
            System.out.println();
        }
  
		
	}
	//---------------------------------------------------------------------------------------------
	
	void quantidadeDeUm(){
		int cont1 = 0;
		for(int linha=0 ; linha < 9 ; linha++){
			
			for(int coluna = 0; coluna < 5 ; coluna++){
            	
            	if(matriz[linha][coluna]==1){
            		cont1 = cont1 + 1;
            	}
			}
		}
		System.out.println("\nQuantidade de 1: "+cont1);
    			
		
	}
	//---------------------------------------------------------------------------------------------


	public int numeroDeIlha() {
        int count = 0;
        if (matriz == null || matriz.length == 0) {
            return count;
        }
        int[][] tempMatriz = matriz.clone();
        for (int i = 0; i < tempMatriz.length; i++) {
            for (int j = 0; j < tempMatriz[i].length; j++) {
                if (ilhaDetectada(tempMatriz, false, i, j, matriz.length - 1, matriz[i].length - 1)) {
                    count++;
                }
            }
        }
        return count;
    }
	
	//---------------------------------------------------------------------------------------------

    private boolean ilhaDetectada(int[][] tempMatriz,
                                 boolean ilhaDetectada,
                                 int i,
                                 int j,
                                 int iMax,
                                 int jMax) {
        if (i > iMax || j > jMax || i < 0 || j < 0 || tempMatriz[i][j] == 0) {
            return ilhaDetectada;
        } else {
            tempMatriz[i][j] = 0;
            ilhaDetectada = true;
            ilhaDetectada(tempMatriz, ilhaDetectada, i - 1, j, iMax, jMax);
            ilhaDetectada(tempMatriz, ilhaDetectada, i, j - 1, iMax, jMax);
            ilhaDetectada(tempMatriz, ilhaDetectada, i + 1, j, iMax, jMax);
            ilhaDetectada(tempMatriz, ilhaDetectada, i, j + 1, iMax, jMax);
        }
        return ilhaDetectada;
    }
	
	

}
