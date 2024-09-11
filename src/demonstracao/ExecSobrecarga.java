package demonstracao;

public class ExecSobrecarga {
    public static void main(String[] args) {
        Sobrecarga sb = new Sobrecarga();

        System.out.println(sb.calcular(1, 2));
        System.out.println(sb.calcular(1.2f, 2.3f));
        System.out.println(sb.calcular("hh", "ddd"));
    }
}
