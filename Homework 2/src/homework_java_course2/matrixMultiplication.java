package homework_java_course2;

public class matrixMultiplication {
	
	public static void main (String[] args) {
		
		int [][] matrixA = {{1,2,3},{1,2,3},{1,2,3}}; //define matrix A 
		int [][] matrixB = {{4,5,6},{4,5,6},{4,5,6}}; //define matrix B
		
		int matrixC[][]= new int [3][3];	//create matrix C
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				matrixC[i][j]=0;      //set value of matrix C as 0
				for(int k=0;k<3;k++){      
					matrixC[i][j] += matrixA[i][k]*matrixB[k][j];	//multiplication of a particular element of both matrixes and setting this value as new value for C matrix 
				}
				System.out.print(matrixC[i][j]+" ");  //printing matrix element  
			}
		}
}
}