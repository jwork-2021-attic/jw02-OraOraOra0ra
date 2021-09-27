package task3;

public class Snake {

    private static Snake theSnake;

    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }
        return theSnake;
    }

    private Snake() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String matrixUp(Matrix matrix) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Matrixable[] matrixables = matrix.toArray();
        int[] ranks = new int[matrixables.length];

        for (int i = 0; i < matrixables.length; i++) {
            ranks[i] = matrixables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step, matrix);
            System.out.println(matrix.toString());
            log += matrix.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private Create create;

    public void setCreate(Create create){
        this.create = create;
    }

    private void execute(String step, Matrix matrix) {
        String[] couple = step.split("<->");
        create.getMonster()[(Integer.parseInt(couple[0])-1) / create.getMonster()[0].length][(Integer.parseInt(couple[0])-1) % create.getMonster()[0].length]
                .swapPosition(create.getMonster()[(Integer.parseInt(couple[1])-1) / create.getMonster()[0].length][(Integer.parseInt(couple[1])-1) % create.getMonster()[0].length]);
    }

}
