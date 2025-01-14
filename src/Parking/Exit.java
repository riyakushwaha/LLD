package Parking;

import Parking.payment.Cash;
import Parking.payment.CreditCard;
import Parking.payment.Payment;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Exit {
    // Data members
    private int id;

    Payment payment;

    public Exit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Member function
    public void validateTicket(ParkingTicket ticket) {
        // Perform validation logic for the parking ticket
        // Calculate parking charges, if necessary
        int amount = getAmount(ticket.getTimestamp());
        int num = (int) Math.ceil(Math.random()*2);
//        do{
//            System.out.println("Amount to be paid: "+amount);
//            System.out.println("Select payment options:\n 1. Cash \n 2. Credit Card");
//            Scanner scanner = new Scanner(System.in);
//            num = scanner.nextInt();
//        }while(num < 1 && num > 2);



        if(num == 1){
            payment = new Payment(new Cash());
        }else{
            payment = new Payment(new CreditCard());
        }
        // Handle the exit process

        payment.initiateTransaction(amount);

    }

    private int getAmount(LocalDateTime enterTime) {

        int randomHrs = (int) (Math.random()*24);
        LocalDateTime exitTime = enterTime.plusHours(randomHrs);

        int diff = (int)ChronoUnit.HOURS.between(enterTime, exitTime);

        return (diff-1)*10 + 20;

    }

}
