import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean vazhdo = true;

        while (vazhdo) {
            int algoritmi = 0;

            // Zgjedh algoritmin
            System.out.println("\nZgjedh algoritmin ([1]-Scytale Transposition, [2]-Pigpen Cipher):");
            try {
                algoritmi = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Gabim në input. Provo përsëri.");
                continue;
            }

            if (algoritmi != 1 && algoritmi != 2) {
                System.out.println("Zgjedhja juaj është e pavlefshme! Provoni përsëri!");
                continue;
            }

            // Zgjedh veprimin
            System.out.println("\nZgjedh veprimin ([1]-Enkriptim, [2]-Dekriptim):");
            int veprimi;
            try {
                veprimi = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Gabim në input. Provo përsëri.");
                continue;
            }

            if (veprimi != 1 && veprimi != 2) {
                System.out.println("Zgjedhja juaj është e pavlefshme! Provoni përsëri!");
                continue;
            }

            // Algoritmi dhe veprimi
            switch (algoritmi) {
                case 1:
                    ScytaleTransposition scytale = new ScytaleTransposition();
                    System.out.print("Shkruaj mesazhin: ");
                    String mesazhi1 = input.nextLine();

                    System.out.print("Shkruaj çelësin (numri i rreshtave): ");
                    int celesi = Integer.parseInt(input.nextLine());

                    if (veprimi == 1) {
                        String enkriptuar = scytale.encrypt(mesazhi1, celesi);
                        System.out.println("Mesazhi i koduar: " + enkriptuar);
                    } else {
                        String dekriptuar = scytale.decrypt(mesazhi1, celesi);
                        System.out.println("Mesazhi i dekoduar: " + dekriptuar);
                    }
                    break;

                case 2:
                    System.out.print("Shkruaj mesazhin: ");
                    String mesazhi2 = input.nextLine();

                    if (veprimi == 1) {
                        String enkriptuar = PigpenCipher.enkriptimi(mesazhi2);
                        System.out.println("Mesazhi i koduar: " + enkriptuar);
                    } else {
                        String dekriptuar = PigpenCipher.dekriptimi(mesazhi2);
                        System.out.println("Mesazhi i dekoduar: " + dekriptuar);
                    }
                    break;
            }

            // Pyetja për vazhdim
            System.out.println("\nDëshiron të vazhdosh programin: [P] - Po, [J] - Jo");
            String option = input.nextLine();

            if (option.equalsIgnoreCase("P")) {
                vazhdo = true;
            } else if (option.equalsIgnoreCase("J")) {
                vazhdo = false;
            } else {
                System.out.println("Zgjedhja juaj është e pavlefshme! Programi u përfundua.");
                vazhdo = false;
            }
        }

        System.out.println("Programi u përfundua.");
        input.close();
    }
}
