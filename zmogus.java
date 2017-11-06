package pagrindas;

public class zmogus extends kuno_duomenys {

    public String vardas;
    public String pavarde;
    public double kmi;

    public String sayHello() {
        return "Sveikas";
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setKmi(double kmi) {
        this.kmi = kmi;
    }

    public double getKmi() {
        return kmi;
    }
}
