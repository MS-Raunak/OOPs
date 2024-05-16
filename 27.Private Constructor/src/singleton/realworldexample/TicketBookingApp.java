package singleton.realworldexample;

import java.util.Scanner;

public class TicketBookingApp {

    void bookTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ticket: ");
        int ticket = sc.nextInt();

        Theatre t1 = Theatre.getInstance();
        t1.reserveSeat(ticket);
    }
}
