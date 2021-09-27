package task2;

import task2.Line.Position;

public class Monster implements Linable {

    private final int r;
    private final int g;
    private final int b;
    private final int no;

    private Position position;

    Monster(int r, int g, int b, int no) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.no = no;
    }

    public int rank() {
        return this.no;
    }

    @Override
    public String toString() {
        if (this.rank() < 10)
            return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m   " + this.rank() + "   \033[0m";
        else if (this.rank() < 100)
            return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m  " + this.rank() + "   \033[0m";
        else
            return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m  " + this.rank() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public int getValue() {
        return this.rank();
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }
}