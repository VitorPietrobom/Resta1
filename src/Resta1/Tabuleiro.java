package Resta1;

    public class Tabuleiro {
        //objeto é o nome da classe de peças do tabuleiro
        Pino[][] matriz=new Pino[7][7];// criar uma matriz de peças

        Tabuleiro(){
            for (int linha=0;linha<7;linha++){
                for(int coluna=0;coluna<7;coluna++){
                    if (((linha<2)&((coluna<2)||(coluna>4)))||((linha>4)&((coluna<2)||(coluna>4)))||((coluna==3)&(linha==3))) {//contenpla os espaços do tabuleiro em que não há casas para as peças e casa do meio nula
                        matriz[linha][coluna] = null;
                    }
                    else{
                        matriz[linha][coluna]=new Pino();
                    }
                }
            }
        }
        public Pino[][] getTabuleiro(){
            return matriz;
        }

        public void print_tabuleiro(){
            int contadora=8;
            for(int linha=0;linha<7;linha++){
                contadora--;
                System.out.print(contadora+" ");
                for (int coluna=0;coluna<7;coluna++){
                    if (matriz[linha][coluna]!=null) {
                        System.out.print(matriz[linha][coluna].nome+" ");//nome indica a letra P
                    }
                    else{
                        if (((linha<2)&((coluna<2)||(coluna>4)))||((linha>4)&((coluna<2)||(coluna>4)))){//locais que não há casa no tabuleiro
                            System.out.print("  ");
                        }
                        else System.out.print("- ");// casa vazia no tabuleiro
                    }
                    if (coluna==6) System.out.println();//quebra de linha no final
                }

            }
            System.out.println("  a b c d e f g");

        }



    }

