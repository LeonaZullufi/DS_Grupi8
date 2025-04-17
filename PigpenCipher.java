import java.util.HashMap;
import java.util.Map;

public class PigpenCipher {


    private static final Map<Character, String> characterMap = new HashMap<>();

    static {
        characterMap.put('a', "─┘");
        characterMap.put('b', "└─┘");
        characterMap.put('c', "└─");
        characterMap.put('d', "⊐");
        characterMap.put('e', "▢");
        characterMap.put('f', "⊏");
        characterMap.put('g', "─┐");
        characterMap.put('h', "┌─┐");
        characterMap.put('i', "┌─");

        characterMap.put('j', "─•┘");
        characterMap.put('k', "└•┘");
        characterMap.put('l', "└•─");
        characterMap.put('m', "•⊐");
        characterMap.put('n', "⊡");
        characterMap.put('o', "⊏•");
        characterMap.put('p', "─•┐");
        characterMap.put('q', "┌•┐");
        characterMap.put('r', "┌•─");

        characterMap.put('s', "\\/");
        characterMap.put('t', ">");
        characterMap.put('u', "<");
        characterMap.put('v', "/\\");

        characterMap.put('w', "\\•/");
        characterMap.put('x', "•>");
        characterMap.put('y', "<•");
        characterMap.put('z', "/•\\");
    }

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
