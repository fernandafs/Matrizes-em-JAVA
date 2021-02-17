import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class OrdenaMatLin
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        Random random = new Random();

        int [] vetor = new int [2];

        for ( int i = 0; i < 2; i++)
        {
            vetor[i] = scan.nextInt();
        }

        int [][] matriz = new int [vetor[0]][vetor[1]];

        for ( int i = 0; i < vetor[0]; i++)
        {
            for ( int j = 0; j < vetor[1]; j++)
            {
                matriz [i] [j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println (" ");
        }

        for (int i = 0; i < vetor[0]; i++)
        {
            Arrays.sort(matriz[i]);
            System.out.println(Arrays.toString(matriz[i]) + " ");
        }
        System.out.println (" ");
    }
}

