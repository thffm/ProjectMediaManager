package model.Services;

import model.entities.Car;
import model.entities.User;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarParking {

    private OnlinePaymentService onlinePaymentService;

    private List<User> listUser = new ArrayList<>();
    private OverAge overAge;

    public CarParking(OnlinePaymentService onlinePaymentService,OverAge overAge) {
        this.onlinePaymentService = onlinePaymentService;
        this.overAge = overAge;
    }
    public List<User> getUsers(){
        return listUser;
    }
    public void addUser(User us){
        listUser.add(us);
    }
    public void getTime(){

        for (User person:listUser){
            if (overAge.overAge(person.getAge())){
                long minutes = Duration.between(person.getCar().getStart(), person.getCar().getFinish()).toMinutes();
                int hour = (int) (Math.ceil(minutes)/60);
                System.out.println(hour);
                person.getCar().setTotalPrice(getTotalPrice(hour));
            }else {
                System.out.println("Sai daqui menor......."+"Pessoa:"+person.getName());
            }


        }

    }
    public Double getTotalPrice(Integer time){
        if (time < 6){
            return  onlinePaymentService.tax(200.0);
        }
        else if (time < 30){
            return  onlinePaymentService.tax(400.00);
        }
        return  null;
    }


}
