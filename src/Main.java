class Npc {
    private String name;
    private String role;
    private int level;
    private String location;

    public Npc(String name, String role, int level, String location) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("NPC Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Level: " + level);
        System.out.println("Location: " + location);
    }
}

public class Main {
    public static void main(String[] args) {
        Npc npc1 = new Npc("Black", "blacksmith", 5, "forge");
        Npc npc2 = new Npc("hog", "shopkeeper", 7, "City");

        System.out.println("Informacje o NPC 1:");
        npc1.displayInfo();

        System.out.println("\nInformacje o NPC 2:");
        npc2.displayInfo();
    }
}