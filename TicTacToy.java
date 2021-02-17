import java.util.Scanner;

public class TicTacToy
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int x = 0; int y = 0; int z = 0; int d = 0;

        int vezes = scan.nextInt();

        char [][] matriz = new char [3][3];

        while(d < vezes)
        {
            d++;
            for ( int i = 0; i < 3; i++)
            {
                for ( int j = 0; j < 3; j++)
                {
                    matriz [i][j] = scan.next().charAt(0);
                }
            }

            // ------------------------ X ---------------------//

            // linha

            if (matriz [0][0] =='X' && matriz [0][1] =='X' && matriz [0][2] =='X')
            {
               System.out.println("o jogador X venceu");
            }

            else if (matriz[1][0] == 'X' && matriz[1][1] == 'X' && matriz[1][2] == 'X')
            {
                System.out.println("o jogador X venceu");
            }

            else if (matriz[2][0] == 'X' && matriz[2][1] == 'X' && matriz[2][2] == 'X')
            {
                System.out.println("o jogador X venceu");
            }

            //coluna

            else if (matriz [0][0] =='X' && matriz [1][0] =='X' && matriz [2][0] =='X')
            {
                System.out.println("o jogador X venceu");
            }

            else if (matriz[0][1] == 'X' && matriz[1][1] == 'X' && matriz[2][1] == 'X')
            {
                System.out.println("o jogador X venceu");
            }

            else if (matriz[0][2] == 'X' && matriz[1][2] == 'X' && matriz[2][2] == 'X')
            {
                System.out.println("o jogador X venceu");
            }

            // Diagonais

            else if (matriz[0][0] == 'X' && matriz[1][1] == 'X' && matriz[2][2] == 'X')
            {
                System.out.println("o jogador X venceu");
            }

            else if (matriz[0][2]=='X' && matriz[1][1] == 'X' && matriz[2][0]=='X')
            {
                System.out.println("o jogador X venceu");
            }

            // ------------------------------ O --------------------//

            //linha

            else if (matriz [0][0] =='O' && matriz [0][1] =='O' && matriz [0][2] =='O')
            {
                System.out.println("o jogador O venceu");
            }

            else if (matriz[1][0] == 'O' && matriz[1][1] == 'O' && matriz[1][2] == 'O')
            {
                System.out.println("o jogador O venceu");
            }

            else if (matriz[2][0] == 'O' && matriz[2][1] == 'O' && matriz[2][2] == 'O')
            {
                System.out.println("o jogador O venceu");
            }

            // coluna
            else if (matriz [0][0] =='O' && matriz [1][0] =='O' && matriz [2][0] =='O')
            {
                System.out.println("o jogador O venceu");
            }

            else if (matriz[0][1] == 'O' && matriz[1][1] == 'O' && matriz[2][1] == 'O')
            {
               System.out.println("o jogador O venceu");
            }

            else if (matriz[0][2] == 'O' && matriz[1][2] == 'O' && matriz[2][2] == 'O')
            {
                System.out.println("o jogador O venceu");
            }

            // Diagonais

            else if (matriz[0][0] == 'O' && matriz[1][1] == 'O' && matriz[2][2] == 'O')
            {
                System.out.println("o jogador O venceu");
            }

            else if (matriz[0][2] == 'O' && matriz[1][1] == 'O' && matriz[2][0] == 'O')
            {
                System.out.println("o jogador O venceu");
            }

            else
            {
                System.out.println("o jogo deu velha");
            }
        }
    }
}