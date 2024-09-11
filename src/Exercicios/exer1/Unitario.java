package Exercicios.exer1;

public class Unitario extends Produto {
    private int qtd;
    private float valorUnitario;

    public Unitario(int qtd, float valorUnitario) {
        super(qtd);
        this.valorUnitario = valorUnitario;
    }

    @Override
    public float getCalcPreco() {
        return super.getCalcPreco() * this.valorUnitario;
    }
}
