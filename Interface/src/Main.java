import model.Services.CarParking;
import model.Services.CheckAge;
import model.Services.UsTax;
import model.entities.Car;
import model.entities.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Car car = new Car("Honda", LocalDateTime.parse("19/12/2023 05:25",fmt),LocalDateTime.parse("20/12/2023 10:33",fmt));
        Car cvic = new Car("Cvic", LocalDateTime.parse("19/12/2023 05:25",fmt),LocalDateTime.parse("19/12/2023 10:33",fmt));
        User user = new User("Thiago",car,18);
        User lida = new User("Lidia",cvic,29);
        User dssa = new User("dssa",cvic,17);

        CarParking service = new CarParking(new UsTax(), new CheckAge());
        service.addUser(user);
        service.addUser(lida);
        service.addUser(dssa);
        service.getTime();

        System.out.println(user);
        System.out.println(lida);
        System.out.println("Before Sort!!");
        System.out.println("-------------------");
        System.out.println(service.getUsers());
        System.out.println("-------------------");
        Collections.sort(service.getUsers());
        System.out.println("After Sort!!");
        System.out.println(service.getUsers());

    }
}