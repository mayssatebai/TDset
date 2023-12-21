// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Enseignant e1=new Enseignant(1,"wajdi","tebi");
        Enseignant e2=new Enseignant(2,"naplima","hyhy");
        Enseignant e3=new Enseignant(2,"napoima","hyhy");
        Enseignant e4=new Enseignant(3,"fampzi","teei");
        Enseignant e5=new Enseignant(4,"choiki","tegyuhgbi");

 GestionEnseignant hashset= new EspritHashSet();
 hashset.ajouterEnseignant(e1);
 hashset.ajouterEnseignant(e2);
 hashset.ajouterEnseignant(e3);
 hashset.ajouterEnseignant(e4);
 hashset.ajouterEnseignant(e5);
        hashset.displayEnseignants();
        System.out.println(hashset.rechercherEnseignant(3));
        System.out.println(hashset.rechercherEnseignant(e2));


GestionEnseignant tree =new EspritTreeSet();
tree.ajouterEnseignant(e1);
        tree.ajouterEnseignant(e2);
        tree.ajouterEnseignant(e3);
        tree.ajouterEnseignant(e4);
        tree.ajouterEnseignant(e5);
        tree.displayEnseignants();
    }
}