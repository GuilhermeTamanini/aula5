package demonstracao;

public class Ciclismo extends Bicicleta {
    private int espessuraPneu;

    public Ciclismo(int marcha, int cadencia, int espessuraPneu) {
        super(marcha, cadencia);
        this.espessuraPneu = espessuraPneu;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\nEspessura do pneu: " + this.espessuraPneu;
    }
}
