import java.util.Scanner;

public class FreqMaiorMenor
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int maior = -999999; int menor = 999999; double qtd = 0; double qtd1 = 0; double freqMaior = 0; double freqMenor = 0;

        int l = scan.nextInt(); int c = scan.nextInt();
        int [][] matriz = new int[l][c];
        int tam = l*c;

        for(int i = 0; i < l ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matriz[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < l ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                }
                else if (matriz[i][j] < menor)
                {
                    menor = matriz[i][j];
                }
            }
        }

        for(int i = 0; i < l ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (matriz[i][j] == maior)
                {
                    qtd++;
                }

                if (matriz[i][j] == menor)
                {
                    qtd1++;
                }
            }
        }

        freqMaior = (100*qtd)/tam;
        freqMenor = (100*qtd1)/tam;

        System.out.print(menor +" "); System.out.printf("%.2f%%\n",freqMenor);
        System.out.print(maior + " "); System.out.printf("%.2f%%\n",freqMaior);
    }
}