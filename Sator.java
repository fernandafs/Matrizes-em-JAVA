import java.util.Scanner;

public class Sator
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        int cont;
        boolean sator = true;

        int tam = scan.nextInt();


        while(tam != 0)
        {

            String [][] m = new String [tam][tam];
            String [] v = new String [tam*tam];
            String [] v2 = new String [tam*tam];

            cont = 0;

            for(int i = 0; i < tam; i++)
            {
                for(int j = 0; j < tam; j++)
                {
                    m[i][j] = scan.next();
                    v[cont] = m[i][j];
                    cont++;
                }
            }

            cont = 0;

            for(int i = tam-1; i >= 0; i--)
            {
                for(int j = tam-1; j >= 0; j--)
                {
                    v2[cont] = m[i][j];
                    cont++;
                }
            }

            for(int i=0; i < tam*tam; i++)
            {
               sator &= v[i].equals(v2[i]);
            }

            System.out.printf("%s\n", sator ? "S" : "N");

            tam = scan.nextInt();
            sator = true;

        }
    }
}