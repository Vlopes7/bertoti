package padrao;

import java.util.Observer;

public class subject {
    void adicionar(Observer o);
    void remover(Observer o);
    void notificar();
}
