package esercizipome;

public class Main1 {
    public static void main(String[] args) {


        Dipendente mario = new Dipendente("Q3JD89S", 2100.23);
        Dipendente luigi = new Dipendente("KF93DSE", 2200.53);
        Dipendente laura = new Dipendente("9FKS7ES", 3025.46);
        mario.setDipartimento("PRODUZIONE");
        luigi.setDipartimento("VENDITE");
        laura.setDipartimento("AMMINISTRAZIONE");
//        System.out.println(mario.getMatricola() + " " + mario.getStipendio() + " SOLDI") ;
//        System.out.println(luigi.getMatricola() + " " + luigi.getStipendio() + " SOLDI") ;
//        System.out.println(laura.getMatricola() + " " + laura.getStipendio() + " SOLDI") ;
        Dipendente[] dipendenti = {mario,luigi,laura};
        for (int i= 0; i<dipendenti.length; i++){
            System.out.println("Il numero matricola è: " + dipendenti[i].getMatricola());
        }


    }



}
