package model.entities;

import model.Services.OverAge;

import java.time.format.DateTimeFormatter;

public class User implements  Comparable<User> {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private String name ;
    private Car car;
    private Integer age;


    public User(String name, Car car,int age) {
        this.name = name;
        this.car = car;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Integer getAge(){
        return age;
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+getName()+"\n");
        sb.append("Car: "+getCar().getName()+"\n");
        sb.append("Duration: "+fmt.format(getCar().getStart())+" -- "+fmt.format(getCar().getFinish())+" ");
        sb.append("Total Price: "+getCar().getTotalPrice()+" U$ \n");
        return sb.toString();
    }

    @Override
    public int compareTo(User otherUser) {
        return getCar().getTotalPrice().compareTo(otherUser.getCar().getTotalPrice());
    }


}
