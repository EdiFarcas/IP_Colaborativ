import java.util.List;

public class User {
    
    private int id;
    private String email;
    private String location;
    private boolean isOnline;
    private String externalAuthProvider;

    public User(int id, String email, String location, boolean isOnline, String externalAuthProvider) {
        this.id = id;
        this.email = email;
        this.location = location;
        this.isOnline = isOnline;
        this.externalAuthProvider = externalAuthProvider;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getExternalAuthProvider() {
        return externalAuthProvider;
    }

    public void setExternalAuthProvider(String externalAuthProvider) {
        this.externalAuthProvider = externalAuthProvider;
    }

    public void createOrUpdateProfile(String bio, List<String> interests) {
        // Logica pentru a crea datele in tabelul user_profiles
    }

    public void linkExternalAccount(String provider, String accessToken) {
        // Logica pentru salvarea integrarii: Facebook / Instagram / Google / Plyment provider
        this.externalAuthProvider = provider;
    }

    public void requestMatchRecommendations(double distanceRadius, String ageRange) {
        // Logica pentru a cere la AI o lista de posibile potriviri
    }

    public void sendMatchRequest(int targetUserId) {
        // Logica pentru a initia o cerere de conectare catre alt utilizator
    }

    public void respondToMatchRequest(int requestId, String action) {
        // Logica pentru a accepta sau respinge o cererea de la alt utilizator
    }

    public void sendMessage(int chatId, String content) {
        // Logica pentru a insera un mesaj nou in tabelul messages
    }

    public void readNotifications() {
        // Logica pentru a marca notificarile ca citite
    }
}