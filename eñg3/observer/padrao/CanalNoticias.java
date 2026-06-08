package padrao;
import java.util.ArrayList;
import java.util.List;

public class CanalNoticias implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String ultimaNoticia;

    public void setNovaNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        notificar();
    }

    @Override
    public void adicionar(Observer o) {
        observers.add(o);
    }

    @Override
    public void remover(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificar() {
        for (Observer o : observers) {
            o.atualizar(ultimaNoticia);
        }
    }
}
