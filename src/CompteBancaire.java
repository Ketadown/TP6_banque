public class CompteBancaire {
    private float solde;
    public CompteBancaire(){
        solde=0;
    }

    public void majdusolde(float nv_solde){

        if(nv_solde>=solde) {
            solde = nv_solde;
            System.out.println("Le solde du compte a bien été mis à jour.");
        }

        else{
            System.out.println("Impossible de mettre à jour le solde en négatif.");
        }

    }

}
