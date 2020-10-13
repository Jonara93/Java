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

        bs.attract(millenium);
        //bs.attrac(x1);

    }
}
