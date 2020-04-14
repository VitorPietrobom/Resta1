package Resta1;

public class Main {

    public static void main(String[] args) {
        Tabuleiro tabuleiro= new Tabuleiro();
        tabuleiro.print_tabuleiro();

        int vetor_pos[]={3,1,3,3};
        tabuleiro.altera_posicao(vetor_pos);
        tabuleiro.print_tabuleiro();

    }

}

//falta adicionar o caso em que a casa buscada não está no tabuleiro
