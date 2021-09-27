package task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        int row = 16;
        int col = 16;

        Matrix matrix = new Matrix(row,col);

        Snake theSnake = Snake.getTheSnake();

        Create create = new Create(matrix,row,col);

        theSnake.setCreate(create);

        Sorter sorter = new SelectSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.matrixUp(matrix);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("s191220102/task03_result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
