package pagrindas;

public class kmi_tikrinimas {

    public String nustatytibusena(double kmi){
        String diagnoze = null;

        if (kmi > 18.5 && kmi < 24.9){
            return "Normalus svoris";
        }
        else if (kmi > 25.0 && kmi < 29.9){
            return "Antsvoris";
        }
        else if (kmi > 30.0 && kmi < 34.9){
            return "Io nutukimas";
        }
        else if (kmi > 35 && kmi < 39.9){
            return "IIo nutukimas";
        }
        else if (kmi > 40){
            return "IIIo (liguistas) nutukimas";
        }



        return diagnoze;
    }
}
//    KMI REIKŠMĖ	KMI REIKŠMĖ	                LIGŲ RIZIKA
//        18,5 - 24,9	Normalus svoris	            Nėra
//        25,0 - 29,9	Antsvoris	                Nedidelė, stengtis, kad nedidėtų
//        30,0 - 34,9	Io nutukimas	            Padidėjusi, būtina mažinti svorį
//        35 - 39,9	IIo nutukimas	                Didelė, būtina mažinti svorį
//        > 40	IIIo (liguistas) nutukimas	Labai didelė, būtina mažinti