package se.annapanna;

public class Lab1 {
    public void d1() {

       int antalInMatadeNamn = 0;

        while (true) {
            System.out.println("Skriv in ditt namn: ");
            String namn = System.console().readLine();
            
            if (namn.equals("EXIT")) 
                break;

                int length = namn.length();
                System.out.println("Namnet " + namn + " har " + length + " tecken");
                antalInMatadeNamn++;
        }
        System.out.println("Hejdå du matade in ditt namn totalt " + antalInMatadeNamn + " gånger");
    }
}
