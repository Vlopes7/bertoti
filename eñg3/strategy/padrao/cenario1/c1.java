interface EstrategiaFrete {
    double calcular(double peso);
}

class FreteNormal implements EstrategiaFrete {
    public double calcular(double peso) {
        return peso * 5;
    }
}

class FreteExpresso implements EstrategiaFrete {
    public double calcular(double peso) {
        return peso * 10 + 20;
    }
}

class CalculadoraFrete {
    private EstrategiaFrete estrategia;

    public void definirEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double peso) {
        return estrategia.calcular(peso);
    }
}

public class c1 {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        calculadora.definirEstrategia(new FreteNormal());
        System.out.println(calculadora.calcular(2));

        calculadora.definirEstrategia(new FreteExpresso());
        System.out.println(calculadora.calcular(2));
    }
}