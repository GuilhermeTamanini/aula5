package Exercicios.exer1;

public class Granel extends Produto{
    public float kgPorProduto;
    public int qtd;
    private float valorTonelada = 2000;

    public Granel(int qtd, float kgPorProduto) {
        super(qtd);
        this.kgPorProduto = kgPorProduto;
    }
    public float getTotalT() {
        return (this.qtd * kgPorProduto) / 1000;
    }

    @Override
    public float getCalcPreco() {
        return getTotalT() * valorTonelada;
    }
}
