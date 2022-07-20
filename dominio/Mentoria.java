package JavaDIO.DesafioPOO.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    LocalDate data;


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20.0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + getTitulo() +
                " - Descriçõo: " + getDescricao() +
                " - Data: " + data +
                '}';
    }
}
