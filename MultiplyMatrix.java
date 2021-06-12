
import java.util.Scanner;
import java.util.Random;

public class MultiplyMatrix {

	/*
	 * 
	 *  INSTRUCTIONS
	 	1. Votre programme doit demander à l'utilisateur les dimensions des deux matrices 
	 	carrées, en s'assurant que l'entrée utilisateur est inférieure à 50.
		2. Si les conditions ci-dessus ne sont pas remplies, demandez à l'utilisateur une nouvelle valeur.
		3. Générez maintenant des nombres entiers aléatoires (allant de 0 à 50) pour remplir les deux matrices.
		4. Affichez ces deux matrices à l'écran.
		5. Multipliez les deux matrices et affichez le résultat à l'écran.
		6. Invitez l'utilisateur à lui demander s'il souhaite répéter le programme. « Y » pour oui


	 */
	public static void main(String[] args) {
		// Multiply two matrix
		
		//Variables
		int dimension = 0;
		
		//Input from user
		System.out.println(" Bonjour ");
		
		//String est une classe
		String answer = "y";
		while( answer.compareTo("y") == 0 ) { //Starting the calculation
			
			
			System.out.println(" Entrez la dimension de la matrice. ");
			
			//Create a scanner
			Scanner input = new Scanner(System.in);
			
			//Create Random object
			Random random  = new Random();
			
			
			dimension = input.nextInt();
			
			while(dimension > 50 ) { // Dimension is not good.
				System.out.println("Entrez une dimension inferieure à 50. ");
				dimension = input.nextInt();
			}
			
			System.out.println("Dimension = " + dimension);
			
			//arrays - tableaux 
			int[][] mat1 = new int[dimension][dimension] ; 
			int[][] mat2 = new int[dimension][dimension] ; 
			int[][] matProduct = new int[dimension][dimension] ; 

			
			//Generates value for this two matrix
			for(int i=0; i<dimension ; i++) { //lignes - rows
				for(int j=0; j<dimension ; j++ ) {// Colonne - colomn
					mat1[i][j] =  random.nextInt(9); 			
				}
			}
			
			for(int i=0; i<dimension ; i++) { //lignes - rows
				for(int j=0; j<dimension ; j++ ) {// Colonne - colomn
					mat2[i][j] =  random.nextInt(9); 			
				}
			}
			
			
			//Printing matrix 1
			System.out.println("Matrice 1");
			printMat(mat1);
				
			//Printing matrix 2
			System.out.println("Matrice 2");
			printMat(mat2);
			
			
			int sum = 0;
			//Product of the matrix
			for(int i=0; i<dimension ; i++) { //lignes - rows
				for(int j=0; j<dimension ; j++ ) {// Colonne - colomn
					sum=0;
					for(int x=0; x<dimension; x++) 
						sum += mat1[i][x] * mat2[x][j]; 
					
					matProduct[i][j] = sum ;		
					
				}
			}
			
			System.out.println();
			
			
			//Printing matrix result
			System.out.println("Matrice RESULTAT");
			printMat(matProduct);
			
			input.nextLine();//Empty the buffer
			System.out.println("Voulez vous reprendre le calcul");
			answer = input.nextLine(); //String
				
		}
		
		
		System.out.println("----------  Fin calcul -------- ");
		
	

	}

	
	//Fucntion for printing the matrix
	public static void printMat(int[][] mat) {
		
		for(int i=0; i<mat.length ; i++) { //lignes - rows
			for(int j=0; j<mat[0].length ; j++ ) {// Colonne - colomn
				System.out.print (mat[i][j]  + " " );			
			}
			System.out.println();
		}
		System.out.println();	
	}
	
	
	
	
	
}
