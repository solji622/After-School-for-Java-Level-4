package example.colors;

public class ColorTest {
    public static void main(String[] args) {
        Color[] colors = Color.values();

        for (Color c : colors) {
            System.out.println("색상명: " + c.name() + ", 순번: " + c.ordinal());
        }

    }

}
