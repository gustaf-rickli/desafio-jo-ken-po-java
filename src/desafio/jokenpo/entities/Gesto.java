package desafio.jokenpo.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Gesto {
    private GestoEnum gesto;

    public List<GestoEnum> ganha = new ArrayList<>();
    public List<GestoEnum> perde = new ArrayList<>();

    public GestoEnum getGesto() {
        return this.gesto;
    }

    public Gesto(GestoEnum gesto) {
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

    @Override
    public String toString() {
        return "Gesto{" +
                "gesto=" + gesto +
                '}';
    }
}
