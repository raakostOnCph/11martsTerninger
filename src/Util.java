import java.util.Scanner;

public class Util {
    public static String getString(String s) {

        System.out.println(s + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getIntSguDaEnTossetMådeAtGøreDetPå(String s) {

        int res = 0;

        boolean ok = true;

        while (ok) {

            ok = false;

            try {
                res = Integer.valueOf(getString(s));
            } catch (NumberFormatException e) {
                ok = true;
            }
        }
        return res;
    }

    public static int getInt(String s){


        while (true) try {
            return Integer.parseInt(getString(s));

        } catch (NumberFormatException e) {
            System.out.println("huske det skal være et tal");
        }



    }
}
