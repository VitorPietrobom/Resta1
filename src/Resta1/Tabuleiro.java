package Resta1;

public class Tabuleiro {
    public class Tabuleiro {
        Objeto tabuleiro[][];//objeto é o nome da classe de peças do tabuleiro
        tabuleiro=new Objeto[7][7];// criar uma matriz de peças

        public void print_tabuleiro(){
            int contadora=0;
            for(int linha=0;linha<7;linha++){
                contadora++;
                System.out.print(contadora+" ");
                for (int coluna=0;coluna<7;coluna++){
                    if (tabuleiro[linha][coluna]!=null) {
                        System.out.print(tabuleiro[linha][coluna].nome+" ");//nome indica a letra P
                    }
                    else{
                        if (((linha<2)&((coluna<2)(coluna>4)))((linha>4)&((coluna<2)(coluna>4)))){//locais que não há casa no tabuleiro
                            System.out.print("  ");
                        }
                    else System.out.print("- ");// casa vazia no tabuleiro
                    }
                    if (coluna==6) System.out.println();//quebra de linha no final
                }

            }
            System.out.println("  a b c d e f g");

        }

        public void cria_tabuleiro(){
            for (int linha=0;linha<7;linha++){
                for(int coluna=0;coluna<7;coluna++){
                    if (((linha<2)&((coluna<2)(coluna>4)))((linha>4)&((coluna<2)(coluna>4)))||((coluna==3)&(linha==3))) {//contenpla os espaços do tabuleiro em que não há casas para as peças e casa do meio nula
                        tabuleiro[linha][coluna] = null;
                    }
                else {
                        tabuleiro[linha][coluna].linha=linha;//setar a posição de cada peça no tabuleiro
                        tabuleiro[linha][coluna].coluna=coluna;
                    }
                }
            }
        }


    }
}
