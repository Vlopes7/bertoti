package antipadrao;

public class AssinanteEmail {
    private String nome;

    public AssinanteEmail(String nome) {
        this.nome = nome;
    }

    public void enviarEmail(String noticia) {
        System.out.println("Enviando email para " + nome + ": " + noticia);
    }
}