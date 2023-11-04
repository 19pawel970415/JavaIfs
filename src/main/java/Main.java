import javax.swing.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


//        Poniższy kod symuluje rzut kostką do gry
//        int result = (int) (Math.random() * 6 + 1);
//        wyświetl informację, czy wynik jest parzysty, czy nieparzysty

        int result = (int) (Math.random() * 6 + 1);
        System.out.println(result);
        String r = (result % 2 == 0) ? "It is an even number." : "It is an odd number.";
        System.out.println(r);

//        jeśli wyrzucono wartość 6 wypisz dodatkowo napis WYGRAŁEŚ

        String rWinner = (result == 6) ? "You won" : "";
        System.out.println(rWinner);

//        Korzystając z klasy oferującej operacje na dacie i czasie pobierz:
//
//        aktualną godzinę
//
//        nr dnia tygodnia
//
//        nr dnia w miesiącu
//
//        nr miesiąca

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getHour());
        System.out.println(now.getDayOfWeek().getValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonth().getValue());
        System.out.println();

//        na podstawie tych danych, dobierając optymalną instrukcje warunkową, wypisz:
//
//        informację o porze dnia (ustalając arbitralnie): rano, do południa, po południu, wieczór, noc
//
//        informację o dniu: pracujący, wolny
//
//        informację, czy jest już po wypłacie (przyjmując, że wypłata przychodzi do 10 każdego miesiąca)
//
//        informację o porze roku: wiosna, lato, jesień, zima

        if (now.getHour() < 6 && now.getHour() > 21) {
            System.out.println("night");
        } else if (now.getHour() < 9 && now.getHour() >= 6) {
            System.out.println("morning");
        } else if (now.getHour() < 12 && now.getHour() >= 9) {
            System.out.println("AM");
        } else if (now.getHour() == 12) {
            System.out.println("noon");
        } else if (now.getHour() < 18 && now.getHour() > 12) {
            System.out.println("PM");
        } else {
            System.out.println("evening");
        }

        System.out.println();

        String s = (now.getDayOfWeek().getValue() == 6 || now.getDayOfWeek().getValue() == 7) ? "It's weekend" : "No weekend yet.";
        System.out.println(s);

        String salary = (now.getDayOfMonth() >= 10) ? "Salary's there." : "No salary yet.";
        System.out.println(salary);

        switch (now.getMonth().getValue()) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            default:
                System.out.println("It's autumn");
        }
    }


}
