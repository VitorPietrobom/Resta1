package Resta1;

public class Main {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.print_tabuleiro();
        CSVReader csv = new CSVReader();
        csv.setDataSource("C:/Users/vitor/IdeaProjects/Resta2/src/Resta1/Data.csv");
        String commands[] = csv.requestCommands();

        int tamanho = commands.length;
        for (int i = 0 ; i < tamanho ; i++ ){
            int atual[] = tabuleiro.transformar_coordenadas(commands[i]);


        }



    }
}
