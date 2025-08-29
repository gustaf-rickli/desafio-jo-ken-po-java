package desafio.jokenpo.entities;

import java.util.ArrayList;
import java.util.List;

public class Mao {

    private GestoEnum gesto;

    public List<GestoEnum> ganha = new ArrayList<>();
    public List<GestoEnum> perde = new ArrayList<>();

    public Mao(GestoEnum gesto) {
        this.gesto = gesto;

        gestoPossibilidades(gesto);
    }

    public GestoEnum getGesto() {
        return this.gesto;
    }

    private void gestoPossibilidades(GestoEnum gesto) {
        if (gesto.equals(GestoEnum.PEDRA)) {
            ganha.add(GestoEnum.TESOURA);
            perde.add(GestoEnum.PAPEL);
        }
        if (gesto.equals(GestoEnum.TESOURA)) {
            ganha.add(GestoEnum.PAPEL);
            perde.add(GestoEnum.PEDRA);
        }
        if (gesto.equals(GestoEnum.PAPEL)) {
            ganha.add(GestoEnum.PEDRA);
            perde.add(GestoEnum.TESOURA);
        }
    }
}
