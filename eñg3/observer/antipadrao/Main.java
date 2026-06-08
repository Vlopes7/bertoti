package antipadrao;

public class Main {
    public static void main(String[] args) {
        
        CanalNoticias canal = new CanalNoticias();
        
        AssinanteEmail assinante1 = new AssinanteEmail("João");
        AssinanteSMS assinante2 = new AssinanteSMS("11999999999");
        
        canal.setAssinanteEmail(assinante1);
        canal.setAssinanteSMS(assinante2);
        
        canal.publicarNoticia("O sistema backend foi atualizado com sucesso!");
    }
}

// Anti-padrão: Alto acoplamento, pois a classe CanalNoticias precisará ser alterada toda vez que um novo tipo de assinante for criado