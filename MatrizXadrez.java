import java.util.Scanner;

public class MatrizXadrez
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int linhas = scan.nextInt();
        int colunas = scan.nextInt();

        int [][] matriz = new int [linhas][colunas];

        for ( int i = 0; i < linhas; i++)
        {
            for ( int j = 0; j < colunas; j++)
            {
                matriz[i][j] = (i+j)%2;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}