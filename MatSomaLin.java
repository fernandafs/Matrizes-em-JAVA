import java.util.Scanner;

public class MatSomaLin
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);


        int tam = scan.nextInt();

        int [][] matriz = new int [tam][tam];

        for ( int i = 0; i < tam; i++)
        {
            for ( int j = 0; j < tam; j++)
            {
                matriz [i][j] = scan.nextInt();
            }
        }

        int somaLinha = 0;

        for ( int i = 0; i < tam; i++)
        {
            for ( int j = 0; j < tam; j++)
            {
                somaLinha = somaLinha + matriz [i][j];
            }
            System.out.println(somaLinha);
            somaLinha = 0;
        }
    }
}