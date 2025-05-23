public class ScytaleTransposition {

    public String encrypt(String mesazhi, int celesi) {
        int gjatesia = mesazhi.length();
        int kolonat = (int) Math.ceil((double) gjatesia / celesi);

        StringBuilder mesazhiEnkriptuar = new StringBuilder();

        for (int kolona = 0; kolona < kolonat; kolona++) {
            for (int rreshti = 0; rreshti < celesi; rreshti++) {
                int pozita = rreshti * kolonat + kolona;
                if (pozita < gjatesia) {
                    mesazhiEnkriptuar.append(mesazhi.charAt(pozita));
                }
            }
        }

        return mesazhiEnkriptuar.toString();
    }

    // Dekriptimi
    public String decrypt(String mesazhiEnkriptuar, int celesi) {
        int gjatesia = mesazhiEnkriptuar.length();
        int kolonat = (int) Math.ceil((double) gjatesia / celesi);

        char[][] matrica = new char[celesi][kolonat];
        int indeks = 0;

        for (int kolona = 0; kolona < kolonat; kolona++) {
            for (int rreshti = 0; rreshti < celesi; rreshti++) {
                int pozita = rreshti * kolonat + kolona;
                if (pozita < gjatesia && indeks < gjatesia) {
                    matrica[rreshti][kolona] = mesazhiEnkriptuar.charAt(indeks++);
                }
            }
        }
        StringBuilder mesazhiDekriptuar = new StringBuilder();
        for (int rreshti = 0; rreshti < celesi; rreshti++) {
            for (int kolona = 0; kolona < kolonat; kolona++) {
                if (matrica[rreshti][kolona]!=0) {
                    mesazhiDekriptuar.append(matrica[rreshti][kolona]);
                }
            }
        }
        return mesazhiDekriptuar.toString();
    }

    public static void main(String[] args) {
        ScytaleTransposition scytale=new ScytaleTransposition();

        String mesazhi = "HELLOSCYTALECIPHER";
        int celesi = 4;

        String enkriptuar = scytale.encrypt(mesazhi, celesi);
        System.out.println("Mesazhi i enkriptuar: " + enkriptuar);

        String dekriptuar = scytale.decrypt(enkriptuar, celesi);
        System.out.println("Mesazhi i dekriptuar: " + dekriptuar);
    }
}


