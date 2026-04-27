class CalculadoraFrete {

    public double calcular(String tipo, double peso) {
        switch (tipo) {
            case "normal":
                return peso * 5;
            case "expresso":
                return peso * 10 + 20;
            default:
                throw new IllegalArgumentException("Tipo inválido");
        }
    }
}

public class c1 {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        System.out.println(calculadora.calcular("normal", 2));
        System.out.println(calculadora.calcular("expresso", 2));
    }
}