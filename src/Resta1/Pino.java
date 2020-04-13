package Resta1;

public class Pino {
    static int colunas_tabuleiro[]={0,1,2,3,4,5,6};//utilizados para realizar a transformação de coordenada
    static char colunas[]={'a','b','c','d','e','f','g'};
    static int linhas_tabuleiro[]={0,1,2,3,4,5,6};
    static char linhas[]={'7','6','5','4','3','2','1'};
    char nome;

    Pino(){
        this.nome='p';
    }

    public int[] transformar_coordenadas(String jogada){//função que transforma as coordenadas dadas em coordenadas referentes a matriz tabuleiro
        int vetor_pos[]= new int[4];
          for (int i=0;i<7;i++){
              if (jogada.charAt(1)==linhas[i]) vetor_pos[0]=linhas_tabuleiro[i];//linha da posição inicial
              if (jogada.charAt(0)==colunas[i]) vetor_pos[1]=colunas_tabuleiro[i];//coluna da posição inicial
              if (jogada.charAt(4)==linhas[i]) vetor_pos[2]=linhas_tabuleiro[i];//linha do posição final
              if (jogada.charAt(3)==linhas[i]) vetor_pos[3]=colunas_tabuleiro[i];//coluna da posição final
          }
          return vetor_pos;//o vetor contém linha_inicial,coluna_inicial,linha_final,coluna_final(coordenadas na matriz)
    }

    public void alterar_tabuleiro(String jogada, Tabuleiro tabuleiro){
        int vetor_pos[]=new int[4];
        vetor_pos=transformar_coordenadas(jogada);

    }

}
