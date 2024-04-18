public class Perso {

    private String nom;
    private int pointsDeVie;
    private int puissance;
    private boolean vivant;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public boolean getEtat() {
        return vivant;
    }

    public void setEtat() {
        this.vivant = !vivant;
    }

    public Perso(String nom, int pointsDeVie, int puissance) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.puissance = puissance;
        this.vivant = true;
    }

    public void attaque(Perso autre){
        if (!this.vivant){
            System.out.println(this.nom + " ne peut pas attaquer car il est mort");
        }
        autre.setPointsDeVie(autre.getPointsDeVie()-this.puissance);
        System.out.println(this.nom+" attaque "+autre.getNom()+ "et lui fait perdre des points");
        System.out.println("les points de"+autre.getNom()+" :"+autre.getPointsDeVie());

    }

    public boolean est_Mort() {
        if (this.pointsDeVie <= 0) {
            System.out.println(this.nom + " est maintenant vaincu ");
            return this.vivant = false;
        }
        return this.vivant;
    }


}

