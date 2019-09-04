package oops.inheritance;

public class ChildOne extends ParentClass{


    public ChildOne(int cash, int gold) {
        super(cash, gold);
    }

    public int getParentsCash(){
       return getCash();
    }

    public int getGoldForChild(){
        return getGold();
    }

}
