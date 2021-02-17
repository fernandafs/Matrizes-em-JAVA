import java.util.Scanner;

public class RepeteVetor
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int num = scan.nextInt();
        int vezes = scan.nextInt();
        int tam = scan.nextInt();

        int [] vetor = new int [tam];

        for (int i=0;i<tam;i++)
        {
            vetor[i] = scan.nextInt();
        }

        if(num == 0)
        {

            for (int j = 0; j < vezes; j++)
            {
                for ( int i = 0; i < tam; i++)
                {
                    if (i < tam -1)
                    {
                        System.out.print(vetor[i] + " ");
                    }

                    else
                    {
                    System.out.println(vetor[i]);
                    }
                }
            }
        }

        else if (num == 1)
        {
            int k = 0;
            for (int i = 0; i < tam; i++)
            {
                for (int j = 0; j < vezes; j++)
                {
                    if (k == vezes - 1)
                    {
                        System.out.println(vetor[i]);
                    }

                    else
                    {
                        System.out.print(vetor[i] + " ");
                    }

                    k++;
                }
                k = 0;
            }
        }
    }
}


