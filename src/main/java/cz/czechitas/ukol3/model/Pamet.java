package cz.czechitas.ukol3.model;

public class Pamet {



    private long kapacita;



    public Long getKapacita() {
        return kapacita;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "kapacita=" + kapacita +
                '}';
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public void Pamet(long kapacita) {
        this.kapacita = 10_1000L;
    }
}
