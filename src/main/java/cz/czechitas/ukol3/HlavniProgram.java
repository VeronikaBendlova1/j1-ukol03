package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Pamet;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");


       Pamet mojepamet = new Pamet();
       mojepamet.setKapacita(10_000L);
        System.out.println(mojepamet);
        Disk mujdisk = new Disk();
        mujdisk.setVyuziteMisto(31_588L);
        mujdisk.setKapacita(60_225);
        System.out.println(mujdisk);
        Procesor mujprocesor = new Procesor();
        mujprocesor.setRychlost(200L);
        mujprocesor.setVyrobce("AMD");
        System.out.println(mujprocesor);
        Pocitac mujpocitac = new Pocitac();
        mujpocitac.setCpu(mujprocesor);
        mujpocitac.setPevnyDisk(mujdisk);
        mujpocitac.setRam(mojepamet);
        System.out.println(mujpocitac);

        mujpocitac.vypniSe();
        mujpocitac.zapniSe();
        mujpocitac.zapniSe();
        mujpocitac.vypniSe();
        mujpocitac.vypniSe();



    }

}
