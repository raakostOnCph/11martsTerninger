public class Bæger {
    public static void fjernTerninger(Terning[] ternings, int i) {

        for (Terning t : ternings
        ) {
            if (t.getResultat() == i) {
                t.setAktiv(false);
            }
        }


    }

    public static void rystBæger(Terning[] terninger) {

        for (Terning t : terninger
        ) {
            t.rul();
        }

    }

    public static void løftBæger(Terning[] ternings) {

        for (Terning t : ternings) {
            System.out.println(t.tegnTerning());
        }


    }

    public static Terning[] fyldBæger() {

//        Terning[] ternings = new Terning[10];
        Terning[] ternings = new Terning[Util.getInt("hvor mange terninger ønsker du at spille med ?")];


        for (int i = 0; i < ternings.length; i++) {
            ternings[i] = new Terning();
        }
        return ternings;
    }
}
