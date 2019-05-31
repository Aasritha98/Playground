import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
     int i, j;
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] matrix = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
       for( i = r-1; i >= 0; i--)
        {
            for( j = 0; j <= c-1; j++)
            { 
              System.out.print(matrix[j][i]+" ");
            }
         System.out.println();
       }
  }
}