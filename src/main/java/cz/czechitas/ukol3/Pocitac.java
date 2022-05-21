package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Pamet;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public void vytvorSouborOVelikosti(long velikost)
    {
        if(jeZapnuty)
        {
           if (pevnyDisk.getKapacita() < pevnyDisk.getVyuziteMisto() + velikost)
               System.err.println("Na disk se už nic víc nevejde, je plný");
               else
           {
               pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()+ velikost);
               System.out.println("Soubor byl přidán na disk");

           }

        }
        else
        {
            System.out.println("Počítač je vypnutý a nepracuje");
        }

    }
    public void vymazSouboryOVelikost(long velikost)
    {
        if (jeZapnuty())
            if (pevnyDisk.getVyuziteMisto() - velikost < 0)
            {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Soubor byl vymazán z disku, místo uvolněno");
            }
        else
            {
                pevnyDisk.getVyuziteMisto();
                System.out.println("Využité místo na disku nemůže jít do minusu!");
            }
        else
        {
            System.out.println("Jsem vyplý a nepracuju ");
        }


    }


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            jeZapnuty = false;
            System.err.println("Pocitac se neda zapnout: nejsou veskere nutne soucasti");
        } else if (jeZapnuty) {
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
