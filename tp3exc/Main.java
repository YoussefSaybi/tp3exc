public class Main {
    public static void main(String[] args) {
        Adresse adresslab = new Adresse();
        adresslab.codePostale=178;
        adresslab.ville="tunis";
        adresslab.gouvernorat="benArous";
        adresslab.afficherAdress();
        adresslab.codePostale=172;
        adresslab.afficherAdress();
        Adresse autreadresslab = new Adresse("IbnSina","tunis",588);
        autreadresslab.ville="SidBouzid";
        autreadresslab.afficherAdress();
        Chercheur chercheur = new Chercheur("Ahmed","data_Analist",12);
        Chercheur autrechercheur = new Chercheur();
        autrechercheur.numOrdinateur=2;
        autrechercheur.nomChercheur="youssef";
        autrechercheur.postChercheur="Developeur";
        autrechercheur.afficherChercheur();
        System.out.println("le nombre de chercheurs cree est: "+ autrechercheur.getChercheur());
        System.out.println("est il chercheur1 == chercheur2 ? "+autrechercheur.comparer(chercheur));
        chercheur.numOrdinateur=19;
        Chercheur chercheur3 = new Chercheur();
        chercheur3.numOrdinateur=14;
        chercheur3.postChercheur="data_scientist";
        chercheur3.nomChercheur="Ahmed";
        Bureau bureau1=new Bureau();
        Bureau bureau2=new Bureau();
        Laboratoire laboratoire1= new Laboratoire();

        laboratoire1.afficherLaboratoire();



    }
}