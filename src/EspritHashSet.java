import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant {


    HashSet<Enseignant> hashset = new HashSet<>();

    public void ajouterEnseignant(Enseignant e) {
        hashset.add(e);
    }

    public boolean rechercherEnseignant(Enseignant e) {
        return hashset.contains(e);
    }

    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : hashset) {
            if (e.getId()==id) {
                return true;
            }
        }
        return false;
    }
    public void supprimerEnseignant (Enseignant e){
        hashset.remove(e);
    }
    public void displayEnseignants(){
        for(Enseignant e :hashset){
            System.out.println(e);
        }
    }


}
