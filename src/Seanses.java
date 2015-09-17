/**
 * Created by IIS on 10.09.2015.
 */
public class Seanses {
    private String film;
    private String TimeSession;
    private int Hall;
    private int id;

    public Seanses(int id, String film, String timeSession, int hall) {
        this.id = id;
        this.film = film;
        TimeSession = timeSession;
        this.Hall = hall;
    }
    public String toString(){
        return id+". " + film + " " + TimeSession + " в зале номер "+ Hall;
    }

    public String getName(){
        return film;
    }
    public int getId() {
        return id;
    }
}
