public class NoteBook {
    private String name;
    private int memory;
    private int hd;
    private String os;
    private String color;

    public NoteBook (String name, int memory, int hd, String os, String color) {
        this.name = name;
        this.memory = memory;
        this.hd = hd;
        this.os = os;
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public int getHd() {
        return hd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\n" + name + " | Memory: " + memory + "  HD: " + hd + "  OS: " + os + "  Color: " + color;
    }

}
