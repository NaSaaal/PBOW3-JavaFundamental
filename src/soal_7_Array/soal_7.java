package soal_7_Array;

public class soal_7 {
	 public static void main(String[] args)
	    {
	        //One Dimensional Arrays
	        int[] fisrtArray = {2, 5, 3};
	        int[] secondArray = {9, 5, 3};
	        int[] thirdArray = {2, 4, 9};
	        int[] fourthArray = {10, 11, 12};
	        int[] fifthArray = {13, 14, 15};
	        int[] sixthArray = {16, 17, 18};
	        int[] seventhArray = {19, 20, 21};
	        int[] eighthArray = {22, 23, 24};
	        int[] ninthArray = {25, 26, 27};
	        //Arrays 2D
	        int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
	                thirdArray};
	        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
	                sixthArray};
	        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
	                ninthArray};
	        //Arrays 3D
	        int[][][] threeDimensionalArray = {twoDimensionalArray1,
	                twoDimensionalArray2, twoDimensionalArray3};
	        //Loop untuk tampilan
	        for(int z=0; z < 3; z+=1) {
	            System.out.print("{");
	            for(int y=0; y < 3; y+=1) {
	                System.out.print("{");
	                for(int x=0; x < 3; x+=1) {
	                    System.out.print(threeDimensionalArray[z][y][x]+" ");
	                    //Array 3d: x untuk kolom, y untuk baris dan z untuk volume
	                }
	                System.out.print("} ");
	            }
	            System.out.print("}");
	            System.out.println();
	        }
	    }
}
