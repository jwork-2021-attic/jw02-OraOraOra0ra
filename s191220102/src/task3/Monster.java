package task3;

import task3.Matrix.Position;

public class Monster implements Matrixable {

    private final int r;
    private final int g;
    private final int b;
    private final int no;
    private final int col;

    static int num = 0;

    private Position position;

    Monster(int r, int g, int b, int no, int col) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.no = no;
        this.col = col;
    }

    public int rank() {
        return this.no;
    }

    @Override
    public String toString() {
        num++;
        if (num < col) {
            if (this.rank() < 10)
                return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m   " + this.rank() + "   \033[0m";
            else if (this.rank() < 100)
                return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m  " + this.rank() + "   \033[0m";
            else
                return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m  " + this.rank() + "  \033[0m";
        }
        else{
            num=0;
            if (this.rank() < 10)
                return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m   " + this.rank() + "   \033[0m\n";
            else if (this.rank() < 100)
                return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m  " + this.rank() + "   \033[0m\n";
            else
                return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m  " + this.rank() + "  \033[0m\n";
        }
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
        this.position.setMatrixable(another);
        p.setMatrixable(this);
    }
}