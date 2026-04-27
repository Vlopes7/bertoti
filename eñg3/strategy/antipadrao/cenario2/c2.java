class Compactador {

    public void comprimir(String tipo, String nomeArquivo) {
        if (tipo.equals("zip")) {
            System.out.println("ZIP: " + nomeArquivo);
        } else if (tipo.equals("rar")) {
            System.out.println("RAR: " + nomeArquivo);
        }
    }
}

public class c2 {
    public static void main(String[] args) {
        Compactador compactador = new Compactador();

        compactador.comprimir("zip", "arquivo.txt");
        compactador.comprimir("rar", "arquivo.txt");
    }
}