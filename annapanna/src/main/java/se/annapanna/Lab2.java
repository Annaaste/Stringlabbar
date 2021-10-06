package se.annapanna;

public class Lab2 {
    public void d2() {

        String myString = "Detta är en sträng som du ska ändra";
        char star = '*';
        

        String replacedString = myString.replace(" ", "*");
        System.out.println(replacedString);
        int count = 0;

        for (int i = 0; i < replacedString.length(); i++) {
            if (replacedString.charAt(i) == star) {
                count++;
            }
        }
        System.out.println("Det finns " + count + "st ändringar i strängen!");

    }
}
