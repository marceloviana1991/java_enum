import models.DiasDaSemana;
import models.Evento;

public class Main {
    public static void main(String[] args) {
        DiasDaSemana[] diasDaSemanas = new DiasDaSemana[3] ;
        diasDaSemanas[0] = DiasDaSemana.SEGUNDA;
        diasDaSemanas[1] = DiasDaSemana.QUARTA;
        diasDaSemanas[2] = DiasDaSemana.SEXTA;
        Evento evento = new Evento(1, "Evento", diasDaSemanas);

        System.out.println(evento);
    }
}
