import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant{

    TreeSet<Enseignant> tree=new TreeSet<>();

    public void ajouterEnseignant(Enseignant e) {
        tree.add(e);
    }

    public boolean rechercherEnseignant(Enseignant e) {
        return tree.contains(e);
    }

    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : tree) {
            if (e.getId()==id) {
                return true;
            }
        }
        return false;
    }
    public void supprimerEnseignant (Enseignant e){
        tree.remove(e);
    }
    public void displayEnseignants(){
        for(Enseignant e :tree){
            System.out.println(e);
        }
    }
}
