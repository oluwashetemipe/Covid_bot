import java.util.Scanner;

public class CovidBot {
    public static void main(String[] args) {

        int total = 0;

        System.out.println("Kindly answer the following questions with a YES or NO");
        System.out.println("Do you have cough?");
        Scanner response = new Scanner(System.in);
        String cough = response.next();
        if (cough.equalsIgnoreCase("yes")){
            total += 1;
        }
        System.out.println("Do you have a runny nose?");
        String runnyNose = response.next();
        if (runnyNose.equalsIgnoreCase("yes")){
            total += 1;
        }
        System.out.println("Are you having Diarrhea?");
        String diarrhea = response.next();
        if (diarrhea.equalsIgnoreCase("yes")){
            total += 1;
        }
        System.out.println("Do you have headache?");
        String headAche = response.next();
        if (headAche.equalsIgnoreCase("yes")){
            total += 1;
        }
        System.out.println("Are you experiencing any for of body ache or Myalgia?");
        String bodyAche = response.next();
        if (bodyAche.equalsIgnoreCase("yes")){
            total += 1;
        }
        System.out.println("Are you feeling feverish(above 37.8 C temperature reading)?");
        String fever = response.next();
        if (fever.equalsIgnoreCase("yes")){
            total += 1;
        }
        System.out.println("Are you having difficulty breathing?");
        String breathingDifficulty = response.next();
        if (breathingDifficulty.equalsIgnoreCase("yes")){
            total += 2;
        }
        System.out.println("Are you feeling tired?");
        String tired = response.next();
        if (tired.equalsIgnoreCase("yes")){
            total += 2;
        }
        System.out.println("Have you travelled in the last 14 days?");
        String travelled = response.next();
        if (travelled.equalsIgnoreCase("yes")){
            total += 3;
        }
        System.out.println("Have you had direct contact or taken care of a positive COVID-19 PATIENT?");
        String contact = response.next();
        if (contact.equalsIgnoreCase("yes")){
            total += 3;
        }
        System.out.println("Your test result is "+ total);

        if (total <= 2){
            System.out.println("May be stress related, Observe patient");
        }
        if (total >= 3 && total <= 5){
            System.out.println("Stay hydrated and proper personal hygiene");
        }
        if (total >= 5 && total <= 12){
            System.out.println("Seek a consultation with doctor");
        }
        else if (total > 12){
            System.out.println("CALL THE NCDC HOTLINE IMMEDIATELY 080097000010");
        }
    }
}
