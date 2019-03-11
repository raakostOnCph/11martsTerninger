public class Statestik {


    public static int [] visStatestik(Terning[] ternings) {

        int[] statestik = new int[ternings[0].getSideantal() + 1];

        for (Terning t : ternings
        ) {
            if (t.isAktiv()) {
                statestik[t.getResultat()]++;
            }
        }



        for (int i = 0; i < statestik.length; i++) {

            System.out.println(i + " : " + statestik[i]);

        }

        return statestik;

    }
}
