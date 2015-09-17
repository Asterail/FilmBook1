/**
 * Created by IIS on 10.09.2015.
 */
public class Hall {
    int rows;
    int seats;

    public Hall(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
    }

    public String toString() {
        return rows + " " + seats;
    }
}