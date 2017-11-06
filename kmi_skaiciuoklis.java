package pagrindas;


public class kmi_skaiciuoklis{

    double skaiciuoti(double ugis, double svoris){
        double kmi = 0;
        double ugis_m = 0;

        ugis_m = ((ugis/100) * (ugis/100));

        kmi = kmi + svoris / ugis_m;

        return Math.round(kmi*100.0)/100.0;
    }


}
//KMI = Kūno masė (kg) / Ūgis (m*m).