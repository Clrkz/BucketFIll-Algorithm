//Implementation By: Clarence Andaya
//BucketFill 
class BucketFill{
	public static void main(String args[]){
		String[][] arr = {
				//Test Cases Inputs
				/*
				{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"},
				{"*"," "," "," "," "," "," "," ","*"," "," "," "," "," ","*"},
				{"*"," "," "," ","*","*","*","*","*"," "," "," "," "," ","*"},
				{"*"," "," "," ","*"," "," "," "," "," "," "," ","+"," ","*"},
				{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"}
				*/
				/*
				{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"},
				{"*"," "," "," "," "," "," "," "," "," "," "," "," "," ","*"},
				{"*"," "," "," ","*","*","*","*","*","*"," "," "," "," ","*"},
				{"*"," "," "," ","*"," ","+"," "," ","*"," "," "," "," ","*"},
				{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"}
				*/
				
				{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"},
				{"*"," "," "," ","*"," "," "," "," ","*"," "," "," "," ","*"},
				{"*"," "," "," "," "," ","+"," "," "," "," "," "," "," ","*"},
				{"*"," "," "," ","*"," "," "," "," ","*"," "," "," "," ","*"},
				{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"}
				
				};
		int[][] imageSize = new int[arr.length][arr[0].length]; 
		//Find Plus (+) Sign 
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j].equals("+")){ 
					imageSize[i][j] = 1;
				}
			}
		}  
		int n = arr.length*arr[0].length;
		while(n > 0){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(imageSize[i][j]==1){
					try{
					up(arr,i,j,imageSize);
					down(arr,i,j,imageSize);
					left(arr,i,j,imageSize);
					right(arr,i,j,imageSize); 
					}catch(Exception e){

					}
				}
			}
		}
		n--;
		} 
		//Print Image	
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				sop(arr[i][j]); 
			}
			sopln("");
		}
	}  
	static void up(String[][] arr, int row, int col, int[][] imageSize){  
		if(arr[row-1][col].equals(" ")){
			arr[row-1][col] = "+"; //fill current pixel 
			if(!arr[row-1][col].equals("+") || !arr[row-1][col].equals("*")){
			imageSize[row-1][col] = 1;  //up
			}
		} 
	}
	static void down(String[][] arr, int row, int col, int[][] imageSize){  
		if(arr[row+1][col].equals(" ")){ 
			arr[row+1][col] = "+";  
			if(!arr[row+1][col].equals("+") || !arr[row+1][col].equals("*")){
			imageSize[row+1][col] = 1; //down
			} 
		} 
	}
	static void left(String[][] arr, int row, int col, int[][] imageSize){  
		if(arr[row][col-1].equals(" ")){ 
			arr[row][col-1] = "+";  
			if(!arr[row][col-1].equals("+") || !arr[row][col-1].equals("*")){
			imageSize[row][col-1] = 1;  //left
			} 
		} 
	} 
	static void right(String[][] arr, int row, int col, int[][] imageSize){  
		if(arr[row][col+1].equals(" ")){ 
			arr[row][col+1] = "+"; 
			if(!arr[row][col+1].equals("+") || !arr[row][col+1].equals("*")){
			imageSize[row][col+1] = 1;  //right
			}
		} 
	}  
	static void sop(String s){
		System.out.print(s);
	}
	static void sopln(String s){
		System.out.println(s);
	}
}
