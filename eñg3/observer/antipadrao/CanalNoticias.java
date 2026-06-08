package antipadrao;

public class CanalNoticias {
    private AssinanteEmail assinanteEmail;
    private AssinanteSMS assinanteSMS;

    public void setAssinanteEmail(AssinanteEmail assinanteEmail) {
        this.assinanteEmail = assinanteEmail;
    }

    public void setAssinanteSMS(AssinanteSMS assinanteSMS) {
        this.assinanteSMS = assinanteSMS;
    }

    public void publicarNoticia(String noticia) {
        if (assinanteEmail != null) {
            assinanteEmail.enviarEmail(noticia);
        }
        if (assinanteSMS != null) {
            assinanteSMS.enviarSMS(noticia);
        }
    }
}