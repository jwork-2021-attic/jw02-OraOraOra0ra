package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Create {

    private Monster[][] monster;

    Create(Matrix matrix, int row, int col) {
        monster = new Monster[row][col];
        List<Integer> list = randomList(row * col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                int r = (Color.color[i * col + j] >> 16) & 0xff;
                int g = (Color.color[i * col + j] >> 8) & 0xff;
                int b = Color.color[i * col + j] & 0xff;
                monster[i][j] = new Monster(r, g, b, i*col+j + 1, col);
                matrix.put(monster[i][j], list.get(i*col+j));
            }
        }
    }

    public List randomList(int size) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
            list.add(new Integer(i));
        Collections.shuffle(list);
        return list;
    }

    public Monster[][] getMonster() {
        return monster;
    }

}
