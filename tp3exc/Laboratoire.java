public class Laboratoire {
    public String nomLabo;
    public String Specialite;
    public int nombreBureaux;
    public  Adresse adresslaboratoire;
    public Bureau[] Bureau = new Bureau[2];
    public Laboratoire(String nomLabo,String Specialite,int nombreBureaux,Bureau[] Bureaux ){
        this.nomLabo=nomLabo;
        this.Specialite=Specialite;
        this.nombreBureaux=nombreBureaux;
        this.Bureau=Bureau;
    }
    public Laboratoire(){
        this.nomLabo="";
        this.Specialite="";
        this.nombreBureaux=0;
        this.Bureau=Bureau;
    }
    public void afficherLaboratoire(){
        System.out.println("le nom de labo est: "+nomLabo);
        System.out.println("la Specialitee est: "+Specialite);
        System.out.println("le nombre de bureaux est: "+nombreBureaux);
        for(int i=0;i<Bureau.length;i++){
            System.out.println(Bureau[i]);
        }
    }
}
