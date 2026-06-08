package antipadrao;

public class AssinanteSMS {
    private String numero;

    public AssinanteSMS(String numero) {
        this.numero = numero;
    }

    public void enviarSMS(String noticia) {
        System.out.println("Enviando SMS para " + numero + ": " + noticia);
    }
}