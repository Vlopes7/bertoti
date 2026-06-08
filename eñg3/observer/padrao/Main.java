package padrao;

public class Main {
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();
        
        Assinante assinante1 = new Assinante("João");
        Assinante assinante2 = new Assinante("Maria");
        
        canal.adicionar(assinante1);
        canal.adicionar(assinante2);
        
        canal.setNovaNoticia("O sistema backend foi atualizado com sucesso!");
    }
}

// Padrão Observer: Baixo acoplamento, pois a classe CanalNoticias não precisa ser alterada quando novos tipos de assinantes são criados
