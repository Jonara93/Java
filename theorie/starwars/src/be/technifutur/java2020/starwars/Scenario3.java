package be.technifutur.java2020.starwars;

public class Scenario3 extends Scenario {

    public Scenario3(String name) {
        super(name);
    }

    @Override
    public void run() {

        BlackStar bs = new BlackStar();
        Millenium millenium = new Millenium();
        XWing x1 = new XWing();
        //AbstractVaisseau av1 = new AbstractVaisseau();
        AbstractVaisseau av1 = new Millenium();

        bs.attract(millenium);
        System.out.println();
        bs.attract(x1);
        System.out.println();
        bs.attract(av1);

    }
}
