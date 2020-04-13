package Resta1;

public class Main {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.print_tabuleiro();
        CSVReader csv = new CSVReader();
        csv.setDataSource("C:/Users/vitor/IdeaProjects/Resta2/src/Resta1/Data.csv");
        String commands[] = csv.requestCommands();

        int tamanho = commands.length;
        System.out.println(tamanho);
        for (int i = 0 ; i < tamanho ; i++ ){
            System.out.println("   Source: " + commands[i].charAt(0)+ commands[i].charAt(1));
            System.out.println("   Target: " + commands[i].charAt(3)+ commands[i].charAt(4));
            int atual[] = tabuleiro.transformar_coordenadas(commands[i]);
            tabuleiro.altera_posicao(atual);
            tabuleiro.print_tabuleiro();
            System.out.println();
            System.out.println();

        }



    }
}
