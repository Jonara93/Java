package be.technifutur.java2020.starwars;

public class BlackStar {

    public void attract(AbstractVaisseau v) {
        System.out.println("Vaisseau attirer");
        v.afficheCamp();
        v.decoller();
    }

    public void attract(Millenium v) {
        System.out.println("Vaisseau attirer");
        v.afficheCamp();
        System.out.println("Faucon Millenium : Au secour Obiwan !");
        v.decoller();
    }

    public void attract(XWing v) {
        System.out.println("Vaisseau attirer");
        v.afficheCamp();
        System.out.println("A vos ordres Dark Vador !");
        v.decoller();
    }


}//end BS
