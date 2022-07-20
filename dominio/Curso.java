package JavaDIO.DesafioPOO.dominio;

public class Curso extends Conteudo{


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private int cargaHoraria;

    @Override
    public String toString() {
        return "\nTítulo: " + getTitulo() +
                " - Descricao: " + getDescricao() + '\'' +
                " - Carga Horária: " + cargaHoraria;
    }
}
