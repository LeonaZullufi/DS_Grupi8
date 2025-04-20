import java.util.HashMap;
import java.util.Map;

public class PigpenCipher {

    // Krijohet një hartë që lidh shkronjat me simbolin përkatës të Pigpen Cipher
    private static final Map<Character, String> characterMap = new HashMap<>();

    static {
        // Rrjeta e parë (tic-tac-toe) për shkronjat A-I
        characterMap.put('a', "─┘");
        characterMap.put('b', "└─┘");
        characterMap.put('c', "└─");
        characterMap.put('d', "⊐");
        characterMap.put('e', "▢");
        characterMap.put('f', "⊏");
        characterMap.put('g', "─┐");
        characterMap.put('h', "┌─┐");
        characterMap.put('i', "┌─");

        // Rrjeta e dytë me pikë për shkronjat J-R
        characterMap.put('j', "─•┘");
        characterMap.put('k', "└•┘");
        characterMap.put('l', "└•─");
        characterMap.put('m', "•⊐");
        characterMap.put('n', "⊡");
        characterMap.put('o', "⊏•");
        characterMap.put('p', "─•┐");
        characterMap.put('q', "┌•┐");
        characterMap.put('r', "┌•─");

        // Rrjeta e tretë në formë X për shkronjat S-V
        characterMap.put('s', "\\/");
        characterMap.put('t', ">");
        characterMap.put('u', "<");
        characterMap.put('v', "/\\");

        // Rrjeta e katërt me pika për shkronjat W-Z
        characterMap.put('w', "\\•/");
        characterMap.put('x', "•>");
        characterMap.put('y', "<•");
        characterMap.put('z', "/•\\");
    }

    //Enkriptimi
    public static String enkriptimi(String mesazhi) {
        StringBuilder mesazhiEnkriptuar = new StringBuilder();

        mesazhi = mesazhi.toLowerCase();

        for (char c : mesazhi.toCharArray()) {
            if (characterMap.containsKey(c)) {
                mesazhiEnkriptuar.append(characterMap.get(c)).append(" ");
            } else {
                mesazhiEnkriptuar.append(c);
            }
        }
        return mesazhiEnkriptuar.toString();
    }


    public static void main(String[] args) {
        String mesazhi = "HeLLO WORLD";
        String mesazhiEnkriptuar = enkriptimi(mesazhi);

        System.out.println("Mesazhi origjinal: " + mesazhi);
        System.out.println("Mesazhi i enkriptuar: " + mesazhiEnkriptuar);
    }

}




 // DEKRIPTIMI

 public static String dekriptimi(String mesazhiEnkriptuar) {
     StringBuilder mesazhiDekriptuar = new StringBuilder();

     // Krijohet një hartë e anasjelltë për dekriptim
     Map<String, Character> reverseMap = new HashMap<>();
     for (Map.Entry<Character, String> entry : characterMap.entrySet()) {
         reverseMap.put(entry.getValue(), entry.getKey());
     }

     // Ndajmë mesazhin e enkriptuar sipas hapësirave
     String[] simbolet = mesazhiEnkriptuar.split(" ");

     for (String simbol : simbolet) {
         if (reverseMap.containsKey(simbol)) {
             mesazhiDekriptuar.append(reverseMap.get(simbol));
         } else {
             mesazhiDekriptuar.append(simbol); // për hapësira ose simbole tjerë
         }
     }

     return mesazhiDekriptuar.toString();
 }

