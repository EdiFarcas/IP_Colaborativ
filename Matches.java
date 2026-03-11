import java.time.LocalDateTime;

public class Matches {
    private int id;
    private int user1Id;
    private int user2Id;
    private LocalDateTime matchTimestamp;
    private String status;

    public Matches(int id, int user1Id, int user2Id, String status) {
        this.id = id;
        this.user1Id = user1Id;
        this.user2Id = user2Id;
        this.matchTimestamp = LocalDateTime.now();
        this.status = status;
    }

    public void acceptMatches() {
        if ("Pending".equalsIgnoreCase(this.status)) {
            this.status = "Accepted";
            this.matchTimestamp = LocalDateTime.now();
            System.out.println("Matches-ul dintre utilizatorul " + this.user1Id + " și utilizatorul " + this.user2Id + " a fost ACCEPTAT!");
        } else {
            System.out.println("Matches-ul nu a putut fi acceptat! Status curent: " + this.status);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(int user1Id) {
        this.user1Id = user1Id;
    }

    public int getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(int user2Id) {
        this.user2Id = user2Id;
    }

    public LocalDateTime getMatchTimestamp() {
        return matchTimestamp;
    }

    public void setMatchTimestamp(LocalDateTime matchTimestamp) {
        this.matchTimestamp = matchTimestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Matches{" +
                "id=" + id +
                ", user1Id=" + user1Id +
                ", user2Id=" + user2Id +
                ", matchTimestamp=" + matchTimestamp +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Matches myMatches = new Matches(1, 14, 89, "Pending");

        System.out.println("Starea inițială a match-ului:");
        System.out.println(myMatches.toString());

        myMatches.acceptMatches();

        System.out.println("Starea finală a match-ului:");
        System.out.println(myMatches.toString());
    }
}
