package demonstracao;

import java.util.StringTokenizer;

public class Sobrecarga {

    public float calcular(float a, float b) {
        return a +  b;
    }

    public float calcular(int a, int b) {
        return a * b;
    }

    public String calcular(String a, String b) {
        return a + b;
    }
}
