package pagrindas;
import org.joda.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class pagrindinis {
    public static void main(String[] args) {
        String pateiktis = null;
        int pateiktis_int = 0;
        int n = 1;
        double pateiktis_double = 0.0;
        double kmi_sk = 0;
        Scanner reader = new Scanner(System.in);

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        List<zmogus> zmogaus_info = new ArrayList<zmogus>();

//        Objektai
        kmi_skaiciuoklis kmi = new kmi_skaiciuoklis();
        kmi_tikrinimas suzinoti_busena = new kmi_tikrinimas();
        zmogus asmuo = new zmogus();

        System.out.print("Kiek zmoniu atliks kmi skaiciavima?: ");
        pateiktis_int = reader.nextInt();

        while(n <= pateiktis_int) {
            try {
                asmuo = new zmogus();
                System.out.print("Suveskite " + n + "-ojo žmogaus duomenis \n");
                System.out.print("Iveskite savo varda: ");
                pateiktis = reader.next();
                asmuo.setVardas(pateiktis);
                System.out.print("Iveskite savo pavarde: ");
                pateiktis = reader.next();
                asmuo.setPavarde(pateiktis);
                System.out.print("Iveskite savo ugi (cm): ");
                pateiktis_double = reader.nextDouble();
                asmuo.setUgis(pateiktis_double);
                System.out.print("Iveskite savo svori (kg): ");
                pateiktis_double = reader.nextDouble();
                asmuo.setSvoris(pateiktis_double);

                kmi_sk = kmi.skaiciuoti(asmuo.getUgis(), asmuo.getSvoris());
                asmuo.setKmi(kmi_sk);
//                System.out.print("Jūsų kmi: " + kmi_sk + "\n");
//
//                System.out.print("Jūsų diagnozė: " + suzinoti_busena.nustatytibusena(kmi_sk));

                n += 1;

                zmogaus_info.add(asmuo);
            } catch (Exception e) {
                System.out.print("Iveskite teisinga informacija");
            }
        }

        System.out.print("\n KMI Dalyviai: \n");

        for(int i=0;i< zmogaus_info.size();i++){
            System.out.print(zmogaus_info.get(i).getVardas() + " " + zmogaus_info.get(i).getPavarde() + " KMI: "
            + zmogaus_info.get(i).getKmi() + " Būsena: " + suzinoti_busena.nustatytibusena(zmogaus_info.get(i).getKmi()) + "\n");
        }

    }

}
