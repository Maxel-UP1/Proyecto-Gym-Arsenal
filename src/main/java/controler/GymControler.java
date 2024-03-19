package controler;

import model.Gym;

public class GymControler {

    private Gym ArsenalGYM;

    public GymControler(){
        Gym ArsenalGYM = new Gym("Arsenal GYM" , 80000 , 15000, 540000);
        this.ArsenalGYM = ArsenalGYM;
    }

    public Gym getArsenalGYM() {
        return ArsenalGYM;
    }

    public void setNumbersEmployes(int numbersEmployes){
        ArsenalGYM.setNumberEmployes(numbersEmployes);
    }



}
