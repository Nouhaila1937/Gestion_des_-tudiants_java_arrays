package dossier;

public class Etudiant {
    private String nom, prenom;
    private int age;
    private int inscription; // Attribut non statique pour chaque étudiant
    private static int compteurInscription = 0; // Compteur statique pour l'incrémentation des inscriptions

    // Constructeur
    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        compteurInscription++; // Incrémentation à chaque création d'étudiant
        this.inscription = compteurInscription; // Attribuer un numéro d'inscription unique
    }

    // Getters et Setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInscription() {
        return inscription;
    }

    // On ne fournit pas de setter pour 'inscription' car il ne doit pas être modifié après attribution
}
