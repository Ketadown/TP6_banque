public class Main {
    static void main() {
        CompteBancaire c = new CompteBancaire("Aymen");
        //c.solde = -500;
        c.majdusolde(342);

        //Test du getter
        System.out.println("Le nom du propriétaire du compte est : "+c.getNom());
    }
}
