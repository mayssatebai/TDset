public class Enseignant implements Comparable<Enseignant>{
    private int id ;
    private String nom;
    private String prenom;


    public Enseignant(){

    }
    public Enseignant(int id , String nom, String prenom){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        Enseignant e =(Enseignant) obj;
        if(e.id==this.id&&e.nom.equals(this.nom)) return true; return false;
    }

    public String toString(){
        return "id : " +id+ " nom : " +nom+ " prenom: " +prenom;
    }
    public int compareTo(Enseignant Enseignant2 ){
        // Implémentez la logique de comparaison ici (par exemple, comparez les IDs)
        return Integer.compare(this.id, Enseignant2 .id);
    }
}
