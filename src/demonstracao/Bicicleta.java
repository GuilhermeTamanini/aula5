package demonstracao;

public class Bicicleta {
    private int marcha;
    private int cadencia;

    public Bicicleta(int marcha, int cadencia) {
        this.marcha = marcha;
        this.cadencia = cadencia;
    }

    public String getDescricao() {
        return "\nMarcha: " + this.marcha + "\nCadencia: " + this.cadencia;
    }
}
