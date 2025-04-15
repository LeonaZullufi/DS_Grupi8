public  String encrypt(String mesazhi, int celesi) {
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



public void main() {
    String mesazhi = "HELLOSCYTALECIPHER";
    int celesi = 4;

    String enkriptuar = encrypt(mesazhi, celesi);
    System.out.println("Mesazhi i enkriptuar: " + enkriptuar);
}
