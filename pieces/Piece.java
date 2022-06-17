package pieces;

public class Piece
{
    private String color = "";
    private int[] position = new int[1];

    public Piece(String color, int[] position)
    {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}