package esercizipome;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private String Dipartimento;

    public Dipendente(String m, double s){
        this.matricola = m;
        this.stipendio = s;
        this.Dipartimento = "";
    }

    public String getMatricola(){
        return this.matricola;
    }

    public double getStipendio(){
        return this.stipendio;
    }

    public String getDipartimento(){
        return this.Dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        if(dipartimento.equals("PRODUZIONE") || dipartimento.equals("AMMINISTRAZIONE") || dipartimento.equals("VENDITE"))
        {
            this.Dipartimento = dipartimento;
        } else {
            System.out.println("Dipartimento non valido: " + dipartimento);
        }
    }



}
