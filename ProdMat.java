import java.util.Scanner;
import java.util.Random;

public class ProdMat
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        Random random = new Random ();

        int tam = scan.nextInt();


        int [][] matriz = new int [tam][tam];
        int [][] matriz1 = new int [tam][tam];
        int [][] matriz2 = new int [tam][tam];

        for ( int i = 0; i < tam; i++)
        {
            for ( int j = 0; j < tam; j++)
            {
                matriz [i] [j] = random.nextInt(100);
                matriz1 [i] [j] = random.nextInt(100);
            }

        }

        for ( int i = 0; i < tam; i++)
        {
            for ( int j = 0; j < tam; j++)
            {
                for ( int r = 0; r < tam; r++)
                {
                    matriz2[i][j] =  matriz2[i][j] +  matriz[i][r]*matriz1[r][j];
                }
            }
        }

        printM(matriz2);
    }

    public static void printM (int[][] M)
    {
        for ( int i = 0; i < M.length; i++)
        {
            for ( int j = 0; j < M.length; j++)
            {
                System.out.print( M[i][j] + " ");
            }

            System.out.println(" ");
        }

    }
}