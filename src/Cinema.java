import java.util.ArrayList;

/**
 * Created by IIS on 10.09.2015.
 */
public class Cinema {
    private Hall[] halls;
    private Seanses [] session;
    public ArrayList<Seanses> reserved = new ArrayList<Seanses>();

    public Cinema(Hall[] halls, Seanses[] session) {
        this.halls = halls;
        this.session = session;
    }

    void print() {
        for (Seanses sean : session) {
            System.out.println(sean);
        }
    }

    public static void main(String[] args) {
        Hall[] halls = {new Hall(10, 20)};
        Seanses[] session = {new Seanses(1, "something","21:00",1)};
        Cinema My = new Cinema(halls,session);
        My.print();

    }
    public ArrayList<Seanses> find (String str) {
        ArrayList<Seanses> found = new ArrayList<Seanses>();
        for (Seanses seanses : session) {
            if (seanses.getName().contains(str)) {
                found.add (seanses);
            }
        }
        return found;
    }
    public boolean reserve (Seanses session, int row, int seat){
        return false;
    }

    public Seanses findbyID (int num) {
        for  (Seanses seanses : session) {
            if (seanses.getId()==(num)) {
                return seanses;
            }
        }
        return null;
    }
}
