package demonstracao;

public class MountainBike extends Bicicleta {
    private String suspensao;


    public MountainBike(int marcha, int cadencia, String suspensao) {
        super(marcha, cadencia);
        this.suspensao = suspensao;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\nSuspensao: " + this.suspensao;
    }
}
