import java.util.Scanner;

public class Pacman
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int ponto = 0, fantasma = 0, maximo = 0;

        int tam = scan.nextInt();

        char [][]  m = new char [tam][tam];
        String [] v = new String [tam];

        for(int i = 0; i < tam; i++)
        {
            v[i] = scan.next();
        }

        for(int i = 0; i < tam; i++)
        {
            for(int j = 0; j < tam; j++)
            {
                m[i][j] = v[i].charAt(j);
            }
        }

        for(int i = 0; i < tam; i++)
        {
            for(int j = 0; j < tam; j++)
            {
                if(m[i][j] == 'o')
                {
                    ponto++;
                }

                if(m[i][j] == 'A')
                {
                    if(fantasma == 0)
                    {
                        maximo = ponto;
                    }

                    else if(ponto > maximo)
                    {
                        maximo = ponto;
                    }

                  ponto = 0;
                  fantasma++;
                }

                else if(ponto > maximo)
                {
                    maximo = ponto;
                }
            }

            i ++;

            if(i >= tam)
            {
                break;
            }

            for(int j = tam-1; j > -1; j--)
            {

                if(m[i][j] == 'o')
                {
                    ponto++;
                }

                if(m[i][j] == 'A')
                {
                    if(fantasma == 0)
                    {
                        maximo = ponto;
                    }

                    else if(ponto > maximo)
                    {
                        maximo = ponto;
                    }

                    ponto = 0;
                    fantasma++;
                }

                else if(ponto > maximo)
                {
                    maximo = ponto;
                }
            }
        }
        System.out.println(maximo);
    }
}