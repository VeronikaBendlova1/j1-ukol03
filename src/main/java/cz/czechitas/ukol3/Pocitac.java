package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Pamet;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;



    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            jeZapnuty = false;
            System.err.println("Pocitac se neda zapnout: nejsou veskere nutne soucasti");
        } else if (jeZapnuty == true) {
            System.err.println("Pozor! Pocitac je jiz zapnuty");
        } else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul");
        }
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul");
        }

    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public String toString(){
        return "Počítač : CPU: " + cpu + ", ram:  " + ram + ", pevný disk:  " + pevnyDisk;
    }


}
