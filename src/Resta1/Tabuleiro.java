package Resta1;

    public class Tabuleiro {
        //objeto é o nome da classe de peças do tabuleiro
        Pino[][] matriz=new Pino[7][7];// criar uma matriz de peças

        static char colunas_tabuleiro[]={0,1,2,3,4,5,6};//utilizados para realizar a transformação de coordenada
        static char colunas[]={'a','b','c','d','e','f','g'};
        static char linhas_tabuleiro[]={0,1,2,3,4,5,6};
        static char linhas[]={'7','6','5','4','3','2','1'};

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

        public int[] transformar_coordenadas(String jogada){//função que transforma as coordenadas dadas em coordenadas referentes a matriz tabuleiro
            int vetor_pos[]= new int[4];
            for (int i=0;i<7;i++){
                if (jogada.charAt(1)==linhas[i]) vetor_pos[0]=linhas_tabuleiro[i];//linha da posição inicial
                if (jogada.charAt(0)==colunas[i]) vetor_pos[1]=colunas_tabuleiro[i];//coluna da posição inicial
                if (jogada.charAt(4)==linhas[i]) vetor_pos[2]=linhas_tabuleiro[i];//linha do posição final
                if (jogada.charAt(3)==colunas[i]) vetor_pos[3]=colunas_tabuleiro[i];//coluna da posição final
            }
            return vetor_pos;//o vetor contém linha_inicial,coluna_inicial,linha_final,coluna_final(coordenadas na matriz)
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

        public void altera_posicao(int[] vetor_pos){
            int linha_inicial=vetor_pos[0];
            int coluna_inicial=vetor_pos[1];
            int linha_final=vetor_pos[2];
            int coluna_final=vetor_pos[3];

            if (matriz[linha_inicial][coluna_inicial]==null){
                System.out.println("posição acessada é vazia");
            }
            else {
                if (matriz[linha_final][coluna_final]!=null) {
                    System.out.println("posição final do pino a ser movimentado estáocupada ");
                }
                else{

                    int diferenca_linhas=linha_final-linha_inicial;
                    int diferenca_colunas=coluna_final-coluna_inicial;
                    if (diferenca_colunas<0) diferenca_colunas=diferenca_colunas*(-1);
                    if(diferenca_linhas<0) diferenca_linhas=diferenca_linhas*(-1);


                    if (((diferenca_colunas==2)&(diferenca_linhas==0))||((diferenca_linhas==2)&(diferenca_colunas==0))){
                        matriz[linha_final][coluna_final] = matriz[linha_inicial][coluna_inicial];
                        matriz[linha_inicial][coluna_inicial] = null;

                        int linha_dead = 0;
                        int coluna_dead = 0;



                        if (linha_inicial == linha_final) {
                            linha_dead = linha_inicial;
                            coluna_dead = (coluna_final + coluna_inicial) / 2;
                        } else if (coluna_final == coluna_inicial) {
                            coluna_dead = coluna_inicial;
                            linha_dead = (linha_final + linha_inicial) / 2;
                        }

                        matriz[linha_dead][coluna_dead].die(matriz, linha_dead, coluna_dead);
                    }

                    else{
                        System.out.println("o pino não pode se movimentar dessa maneira");


                    }


                    }
            }


        }




    }

