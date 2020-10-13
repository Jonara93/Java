package be.technifutur.java2020.starwars;

public class VaisseauBlinde {

    // champs ----------------------------------

    private String name = "Sans nom";
    private int nbMissile;
    private boolean estEnvol = false;
    private boolean estAuSol = true;
    private static int NbEnVolVaisseau = 0; // démarre à 0, augmente de 1 quand un vaisseau s'envole, et diminue de 1
    // quand un vaisseau atterit

    // constructeur ---------------------------

    public VaisseauBlinde(final String name, final int nb) {
        super(); // sera toujours en premier. Appel le constructeur de la classe ancetre.
        this.setName(name);
        this.addMissile(nb);
    }

    // method ----------------------------------

    // tirer un missile
    public void tirer() {
        if (this.nbMissile <= 0) {
            System.out.println("Pouf");
        } else {
            System.out.println("Pan");
            this.nbMissile--;
        }
    }

    // ajouter des missiles

    public void addMissile(final int nb) {
        if (nb > 0) {
            if (nb + this.nbMissile > 20) {
                this.nbMissile = 20;
            } else {
                this.nbMissile += nb;
            }
        }
    }

    // décoler

    public void decoller() {
        if (this.estAuSol) {
            System.out.println("Je m'envole !!");
            this.setEstAuSol(false);
            this.setEstEnvol(true);
            NbEnVolVaisseau++;
        } else {
            System.out.println("Je suis déjà en vol !!");
        }
    }

    // atterir

    public void atterir() {
        if (this.estEnvol) {
            System.out.println("Je me pose au sol !!");
            this.setEstEnvol(false);
            this.setEstAuSol(true);
            NbEnVolVaisseau--;
        } else {
            System.out.println("Je suis déjà au sol !!");
        }
    }

    // setter(donner) getter(recevoir) ----------------------------


    //setter/getter nbMissile

    public int getNbMissile() {

        return this.nbMissile;
    }

    // setter and getter Name

    public void setName(final String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    // setter and getter estenvol

    public void setEstEnvol(final boolean bool) {
        this.estEnvol = bool;
    }

    public boolean getEstEnvole() {
        return this.estEnvol;
    }

    // setter and getter estausol

    public void setEstAuSol(final boolean bool) {
        this.estAuSol = bool;
    }

    public boolean getEstAuSol() {
        return this.estAuSol;
    }

    // getter and setter nbenvol

    public static void setNbEnVolVaisseau(int nb) {
        NbEnVolVaisseau += nb;
    }

    public static int getNbEnVolVaisseau() {
        return NbEnVolVaisseau;
    }

}