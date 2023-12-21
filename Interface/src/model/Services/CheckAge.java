package model.Services;

public class CheckAge implements  OverAge{
    @Override
    public boolean overAge(int age) {
        if (age >= 18){
            return true;
        }else return false;
    }
}
