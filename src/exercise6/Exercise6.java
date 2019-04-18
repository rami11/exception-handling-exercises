package exercise6;

public class Exercise6 {
    public static void main(String[] params) {
        int i;
        int j = -1;
        char c;
        String s1 = "etoile";
        String s2 = null;
        char[] tab = {'s', 'o', 'l', 'e', 'i', 'l'};
        try {
            System.out.print("Entrez un entier: ");
            i = Clavier.lireInt();
            for (j = 0; j < i; j++)
                tab[j] = tab[j + 1]; // o l e i l l
            if (i == 5)
                s1 = s2; // s1 = null
            try {
                tab[0] = s1.charAt(j); // o l e i l l
                j = 10 / j;
                if (tab[0] == 'l') {
                    throw new Exception2("Mars");
                } else if (j >= 4) {
                    throw new Exception1();
                } else {
                    System.out.println("Jupiter");
                }
            } catch (ArithmeticException e) {
                throw new Exception2("Myriade");
            } catch (Exception1 e) {
                System.out.println("Voie lactee");
            } catch (Exception2 e) {
                if (e.getMessage() != null) {
                    throw new Exception("mission sur " + e.getMessage());
                }
                throw new Exception2("Asteroide");
            } catch (NumberFormatException e) {
                System.out.println("Venus");
            }
        } catch (NumberFormatException e) {
            System.out.println("Saturne");
            try {
                tab[j - 1] = s1.charAt(6);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Lune");
                throw new StringIndexOutOfBoundsException("Astre");
            } catch (StringIndexOutOfBoundsException ex) {
                System.out.println("Terre");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("galaxie");
        } catch (NullPointerException e) {
            System.out.println("Univers");
        } catch (Exception2 e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
