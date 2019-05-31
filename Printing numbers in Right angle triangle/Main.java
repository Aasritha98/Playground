import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
  		// Type your code here
  		int n = in.nextInt();
      for(int curr_row=1;curr_row<=n;curr_row++){
        for(int curr_col=1;curr_col<=curr_row;curr_col++){
          System.out.print(curr_row);
        }
        System.out.println();
      }
	}
}
	
