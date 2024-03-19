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

    public void setName(String name){
        ArsenalGYM.setName(name);
    }

    public void setValueMembership(double valueMembership){
        ArsenalGYM.setValueMembership(valueMembership);
    }

    public void setValueWorkedWour(double valueWorkedWour){
        ArsenalGYM.setValueWorkedWour(valueWorkedWour);
    }

    public void setRent(int rent){
        ArsenalGYM.setRent(rent);

    }

    public void setNumberEmployes(int numberEmployes){
        ArsenalGYM.setNumberEmployes(numberEmployes);
    }

    public void setNumberMembersPay(int numberMembersPay){
        ArsenalGYM.setNumeberMembersPay(numberMembersPay);
    }



}
