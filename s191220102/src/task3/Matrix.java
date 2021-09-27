package task3;

public class Matrix {

    public Matrix(int row, int col) {
        this.positions = new Position[row * col];
    }

    private Position[] positions;

    public void put(Matrixable matrixable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setMatrixable(matrixable);
    }

    public Matrixable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].matrixable;
        }
    }

    class Position {

        private Matrixable matrixable;

        Position(Matrixable matrixable) {
            this.matrixable = matrixable;
        }

        public void setMatrixable(Matrixable matrixable) {
            this.matrixable = matrixable;
            matrixable.setPosition(this);
        }

    }

    @Override
    public String toString() {
        String lineString = "";
        for (Position p : positions) {
            lineString += p.matrixable.toString();
        }
        return lineString;
    }

    public Matrixable[] toArray() {
        Matrixable[] matrixables = new Matrixable[this.positions.length];

        for (int i = 0; i < matrixables.length; i++) {
            matrixables[i] = positions[i].matrixable;
        }

        return matrixables;

    }

}
