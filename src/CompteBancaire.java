public class CompteBancaire {
    private float solde;
    private String nom;
    public CompteBancaire(String nom){
        solde=0;
        this.nom=nom;

    }

    public void majdusolde(float nv_solde){

        if(nv_solde>=0) {
            solde = nv_solde;
            System.out.println("Le solde du compte a bien été mis à jour.");
        }

        else{
            System.out.println("Impossible de mettre à jour le solde en négatif.");
        }

    }

    public String getNom(){
        return nom;
    }


}
