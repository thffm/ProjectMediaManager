package model.Services;

import java.time.LocalDateTime;

public class UsTax implements OnlinePaymentService{
    @Override
    public Double tax(Double amount) {
        double tax = amount*0.05;
        return amount+tax;
    }
}
