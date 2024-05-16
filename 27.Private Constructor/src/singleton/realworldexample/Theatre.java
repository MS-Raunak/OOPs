package singleton.realworldexample;

public class Theatre {
    private static Theatre t = null;
    int seats = 50;

    private Theatre(){}

    public void reserveSeat(int ticket){
        if (ticket > seats){
            System.out.println("Seats not available");
            System.out.println("Available seats: " + (ticket - seats));
            return;
        }
        System.out.println(ticket + " tickets booked");
        System.out.println("Available seats: " + (seats-ticket));
    }

    public static Theatre getInstance(){
        if (t==null)
            t=new Theatre();
        return t;
    }
}
