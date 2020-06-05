package com.mgryziak;

import java.util.Scanner;

public class Util {
    public static boolean containsOnlyLetters(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static boolean containsOnlyNumbers(String dana) {
        if (dana == null)
        {
            return false;
        }


        try
        {
            int nr = Integer.parseInt(dana);
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }

        return true;
    }

    public static boolean containsOnlyNumbersWithDot(String kwota) {
        if (kwota == null)
        {
            return false;
        }
        try
        {
            double nr = Double.parseDouble(kwota);
        }
        //try{ double nr = Double.parseDouble(String.valueOf(kwota));}
        catch (NumberFormatException nfe)
        {
            System.out.println("Błąd konwersji. Wprowadź dane liczbowe. ");
            return false;
        }
        return true;
    }

    public static void pobierzDaneStudenta(Student student)
    {

        System.out.println("Proszę podać imię: ");
        Scanner sc = new Scanner(System.in);
        String studentName = "";

        while (sc.hasNextLine())
        {
            studentName = sc.nextLine();
            if (Util.containsOnlyLetters(studentName) == true)
            {
                break;
            }
            System.out.println("Błędne imię. Proszę wpisać ponownie: ");
        }
        student.setName(studentName);


        System.out.println("Proszę podać nazwisko: ");
        String student_lastName = "";

        while (sc.hasNextLine())
        {
            student_lastName = sc.nextLine();
            if (Util.containsOnlyLetters(student_lastName) == true)
            {
                break;
            }
            System.out.println("Błędne nazwisko. Proszę wpisać ponownie: ");
        }
        student.setLastName(student_lastName);


        System.out.println("Proszę podać numer albumu. Numer składa się z czterech cyfr: ");
        String studentAlbum = "";

        while (sc.hasNextLine())
        {
            studentAlbum = sc.nextLine();
            if (Util.containsOnlyNumbers(studentAlbum) == true && studentAlbum.length() == 4)
            {
                break;
            }
            if (Util.containsOnlyNumbers(studentAlbum) == false)
            {
                System.out.println("Numer albumu zawiera błędy. Proszę wpisać ponownie: ");
            }
            else System.out.println("Numer albumu powinien zawierać cztery cyfry");
        }
        student.setNr_albumu(studentAlbum);


        System.out.println("Czy pobiera Pan/i stypendium naukowe? Jeśli tak proszę wcisnąć - T. Jeśli nie proszę wcisnąć - N: ");
        String studentCash = "";
        studentCash = sc.nextLine();
        String scholarship = studentCash.toUpperCase();

        while (scholarship.equals("T") == false && scholarship.equals("N") == false)
        {
            System.out.println("Wpisano niedozwolony znak. Proszę wcisnąć 'T' jeśli pobiera Pan/i stypendium naukowe lub 'N' jeśli stypendium nie zostało przyznane");
            studentCash = sc.nextLine();
            scholarship = studentCash.toUpperCase();
        }

        if (scholarship.equals("T") == true)
        {
            System.out.println("Proszę podać kwotę: ");
            String kwota = "";

            while (sc.hasNextLine())
            {
                kwota = sc.nextLine();
                if (Util.containsOnlyNumbersWithDot(kwota) == true)
                {
                    break;
                }
                System.out.println("Podana kwota jest nieprawidłowa. Proszę wpwisać kwotę jeszcze raz: ");
            }
            double amount = Double.parseDouble(kwota);
            student.setAmount(amount);
        }


        System.out.println("Uprawia Pan/i jakąś dyscypline sportu? Jeśli tak, proszę wcisnąć 'T', jeśli nie, proszę wcisnąć 'N' ");
        String sport = "";
        sport = sc.nextLine();
        String sportDyscypline = sport.toUpperCase();

        while (sportDyscypline.equals("T") == false && sportDyscypline.equals("N") == false)
        {
            System.out.println("Wprowadzono niedozwolony znak. Proszę wpisać ponownie: ");
            sport = sc.nextLine();
            sportDyscypline = sport.toUpperCase();
        }

        if (sportDyscypline.equals("T") == true)
        {
            System.out.println("Proszę podać dyscyplinę: ");
            String dyscyplina = "";
            dyscyplina = sc.nextLine();
            student.setDyscypline(dyscyplina);
        }
    }

    public static void wypiszDaneStudenta(Student st)
    {
        //System.out.println("Dane studenta: ");
        System.out.println("Imię: " + st.getName());
        System.out.println("Nazwisko: " + st.getLastName());
        System.out.println("Numer albumu: " + st.getNr_albumu());
        System.out.println("Kwota stypendium: " + st.getAmount() + "zł");
        System.out.println("Dyscyplina sportowa: " + st.getDyscypline() + "\n");
    }
}