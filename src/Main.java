import demonstracao.Ciclismo;
import demonstracao.MountainBike;

public class Main {

    public static void main(String[] args) {
        Ciclismo ciclismo = new Ciclismo(22, 60, 444);
        MountainBike mountainBike = new MountainBike(223, 44, "Anti matéria");
        System.out.println("Descricao do ciclismo: " + ciclismo.getDescricao() + "\n");
        System.out.println("Descricao da mountainBike: " + mountainBike.getDescricao());
    }

}