interface EstrategiaCompressao {
    void comprimir(String nomeArquivo);
}

class CompressaoZip implements EstrategiaCompressao {
    public void comprimir(String nomeArquivo) {
        System.out.println("ZIP: " + nomeArquivo);
    }
}

class CompressaoRar implements EstrategiaCompressao {
    public void comprimir(String nomeArquivo) {
        System.out.println("RAR: " + nomeArquivo);
    }
}

class Compactador {
    private EstrategiaCompressao estrategia;

    public Compactador(EstrategiaCompressao estrategia) {
        this.estrategia = estrategia;
    }

    public void definirEstrategia(EstrategiaCompressao estrategia) {
        this.estrategia = estrategia;
    }

    public void comprimir(String nomeArquivo) {
        estrategia.comprimir(nomeArquivo);
    }
}

public class c2 {
    public static void main(String[] args) {
        Compactador compactador = new Compactador(new CompressaoZip());
        compactador.comprimir("arquivo.txt");

        compactador.definirEstrategia(new CompressaoRar());
        compactador.comprimir("arquivo.txt");
    }
}