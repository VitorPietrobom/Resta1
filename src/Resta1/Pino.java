package Resta1;

public class Pino {

    char nome;

    Pino(){
        this.nome='p';
    }

    public void alterar_tabuleiro(String jogada, Tabuleiro tabuleiro){
        int vetor_pos[]=new int[4];
        vetor_pos=tabuleiro.transformar_coordenadas(jogada);

    }

}
