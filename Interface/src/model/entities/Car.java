package model.entities;

import java.time.LocalDateTime;

public class Car {
    private String name;
    private LocalDateTime Start;
    private LocalDateTime finish;

    private Double totalPrice;

    public Car(String name, LocalDateTime start, LocalDateTime finish) {
        this.name = name;
        Start = start;
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStart() {
        return Start;
    }

    public void setStart(LocalDateTime start) {
        Start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
