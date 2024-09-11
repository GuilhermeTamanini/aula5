package Exercicios.exer1;

public class ExecProds {
    public static void main(String[] args) {
        Granel granel = new Granel(22, 500);
        Unitario unitario = new Unitario(44, 53);

        System.out.println("Calc dos produtos de granel: " + granel.getCalcPreco());
        System.out.println("Calc dos produtos unitarios: " + unitario.getCalcPreco());
    }
}

