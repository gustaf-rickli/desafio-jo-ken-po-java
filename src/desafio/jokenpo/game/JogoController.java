package desafio.jokenpo.game;

import desafio.jokenpo.entities.GestoEnum;
import desafio.jokenpo.entities.Mao;

public class JogoController {

    public static ResultadoEnum jogar(Mao jogador1, Mao jogador2) {
        if (jogador1.ganha.contains(jogador2.getGesto())  ) {
            return ResultadoEnum.GANHA;
        }

        if (jogador1.perde.contains(jogador2.getGesto())  ) {
            return ResultadoEnum.PERDE;
        }

        return ResultadoEnum.EMPATA;
    }

    public static void main(String[] args) {

        Mao jogador1 = new Mao(GestoEnum.PAPEL);
        Mao jogador2 = new Mao(GestoEnum.TESOURA);

        ResultadoEnum resultado = jogar(jogador1, jogador2);

        System.out.println(
                "Jogador1 jogou: " + jogador1.getGesto().toString()
        );
        System.out.println(
                "Jogador2 jogou: " + jogador2.getGesto().toString()
        );

        System.out.println("jogador 1: " + resultado);
    }
}