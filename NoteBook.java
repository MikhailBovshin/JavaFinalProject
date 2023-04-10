public class NoteBook {
    private int memory;
    private int hd;
    private String os;
    private String color;

    public NoteBook (int memory, int hd, String os, String color) {
        this.memory = memory;
        this.hd = hd;
        this.os = os;
        this.color = color;
    }

    // public void setMemory(int memory) {
    //     this.memory = memory;
    // }

    // public void setHd(int hd) {
    //     this.hd = hd;
    // }

    // public void setOs(String os) {
    //     this.os = os;
    // }

    // public void setColor(String color) {
    //     this.color = color;
    // }

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

}
