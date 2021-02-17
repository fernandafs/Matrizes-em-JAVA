import java.util.Scanner;

public class MatSomaColK
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);


        int tam = scan.nextInt();
        int nColuna = scan.nextInt();

        int [][] matriz = new int [tam][tam];

        for ( int i = 0; i < tam; i++)
        {
            for ( int j = 0; j < tam; j++)
            {
                matriz [i][j] = scan.nextInt();
            }
        }

        int soma = 0;
        int i = 0;

        while(i < tam)
        {
            soma = soma + matriz [i][nColuna];
            i++;
        }

        System.out.println(soma);
    }
}