package singleton.realworldexample;


public class BookMyShow {
    public static void main(String[] args) {
        TicketBookingApp t1 =  new TicketBookingApp();
        t1.bookTicket();

        TicketBookingApp t2 =  new TicketBookingApp();
        t2.bookTicket();
    }
}
