public class Main {

    public static void main(String[] args) {

//        Terning[] ternings = fyldBæger();

//        System.out.println(getInt("skriv et tal"));

//        do {
//            rystBæger(ternings);
//            løftBæger(ternings);
//            visStatestik(ternings);
//            fjernTerninger(ternings, getInt("hvilke terninger vil du fjerne ?"));
//            løftBæger(ternings);
//        } while (getString("tryk j for at spille igen").equalsIgnoreCase("j"));


//
//        do{
//            rystBæger(ternings);
//            løftBæger(ternings);
//            visStatestik(ternings);
//            fjernTerninger(ternings, getInt("hvilke terninger vil du fjerne"));
//
//
//
//        } while (getString("tryk j for at forsætte").equalsIgnoreCase("j"));


        System.out.println("velkommen til mit terningenspil");

        Terning[] ternings = Bæger.fyldBæger();

        while (true) {

//            Bæger.rystBæger(ternings);
//            Bæger.løftBæger(ternings);
//            Statestik.visStatestik(ternings);
//            Bæger.fjernTerninger(ternings, Util.getInt("hvilke terninger vi du fjerne"));

            controller(visMeny(),ternings);
            if (Util.getString("tryk q for at stoppe").equalsIgnoreCase("q")) {
                break;
            }


        }


    }

    public static void controller(int valg, Terning[] ternings) {

        switch (valg) {

            case 1:
                Bæger.rystBæger(ternings);
                break;
            case 2:
                Bæger.løftBæger(ternings);
                break;
            case 3:
                Statestik.visStatestik(ternings);
                break;
            case 4:
                Bæger.fjernTerninger(ternings, Util.getInt("hvilke terninger skal fjernes ?"));
                break;
            case 5:
               Bæger.fjernTerninger(ternings,findMax(Statestik.visStatestik(ternings)));
            break;
               default:
                break;
        }


    }

    private static int findMax(int[] visStatestik) {

        int max = 0;
        int index = -1;


        for (int i = 0; i < visStatestik.length; i++) {

            if (max < visStatestik[i]) {
                max = visStatestik[i];
                index = i;
            }

        }
            return index;
    }


    private static int visMeny() {
        System.out.println("1 for at ryste" + "\n" +
                "2 for at løfte" + "\n" +
                "3 statistik hjælp" + "\n" +
                "4 for at fjerne terninger"+ "\n" +
                "5 for automatiske fjernelse");
        return Util.getInt("angiv valg ");
    }


}