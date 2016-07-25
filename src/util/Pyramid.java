package util;

public class Pyramid {
	
	public static void printSpace(int numOfSpace){
		for(int i =1;i<=numOfSpace;i++){
			System.out.print("  ");
		}
	}
	public static void printStar(int numOfStar){
		for(int i =1;i<=numOfStar;i++){
			System.out.print("* ");
		}
	}

	public static void main(String[] args) {
//		System.out.println("Pyramid one");
//		drawPyramid(5);
//		System.out.println("\n\nPyramid two");
//		drawPyramid2(5);
//		System.out.println("\n\nPyramid three");
//		drawPyramid3(5);
//		System.out.println("\n\nPyramid four");
//		drawPyramid4(5);
		//drawPyramid5(5);
//		drawPyramid6(5);
//		drawPyramid7(5);
//		drawPyramid8(5);
//		drawPyramid9(5);
		drawPyramid10(5);
		
		 
	}
	
/*  *
	* * 
	* * * 
	* * * * 
	* * * * *
*/	
	public static void drawPyramid(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j = 1; j<=i;j++){
				//if(i>=j)
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
/* 	* * * * * 
    * * * * 
    * * * 
    * * 
    *  
 */	
	public static void drawPyramid2(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j = numOfLines; j>=1;j--){
				if(j>=i)
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void drawPyramid3(int numOfLines){
		 
		for(int i =1;i<=numOfLines;i++){
			for(int j=numOfLines;j>=1;j--){
				if(j>i){
					System.out.print("  ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
	public static void drawPyramid4(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j=numOfLines;j>=1;j--){
				if(i<=j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void drawPyramid5(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			 for(int j=1;j<=i;j++){
				 System.out.print("* ");
			 }
			System.out.println("");
		}
		for(int i =1;i<=numOfLines-1;i++){
			 for(int j=numOfLines-1;j>=1;j--){
				 if(j>=i){
					 System.out.print("* ");
				 }else{
					 System.out.print("  ");
				 }
			 }
			System.out.println("");
		}
	}

	public static void drawPyramid6(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j=numOfLines;j>=1;j--){
				if(j>i){
					System.out.print("  ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		for(int i =1;i<=numOfLines-1;i++){
			 for(int j=1;j<=numOfLines;j++){
				 if(j>i){
					 System.out.print("* ");
				 }else{
					 System.out.print("  ");
				 }
			 }
			System.out.println("");
		}
	}

	public static void drawPyramid7(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j = numOfLines; j>=1;j--){
				if(i>=j){
				System.out.print("* ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

/*	
		  	* 
		  * * * 
		* * * * * 
	  * * * * * * * 
	* * * * * * * * * 
*/
	public static void drawPyramid8(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j =numOfLines; j>=1;j--){
				if(i>=j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			for(int k =1;k<=i-1;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
/* 
	* * * * * * * * * 			* * * * * * * * * 
	  * * * * * * *				  * * * * * * * 
		* * * * *					* * * * * 
		  * * *						  * * * 
			*					        * 
								      * * * 
								    * * * * * 
								   * * * * * * * 
								 * * * * * * * * * 
 */
	
	public static void drawPyramid9(int numOfLines){
		for(int i =1;i<=numOfLines;i++){
			for(int j =1; j<=numOfLines;j++){
				if(j>=i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			for(int k =1;k<=numOfLines-i;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i =2;i<=numOfLines;i++){
			for(int j =numOfLines; j>=1;j--){
				if(i>=j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			for(int k =1;k<=i-1;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void drawPyramid10(int numOfLines){
		for(int i=1; i<=numOfLines; i++){
			for(int j=1;j<=i;j++){
				if(i>=j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			for(int k=numOfLines;k>=1;k--){
				if(k>i){
					System.out.print("    ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
