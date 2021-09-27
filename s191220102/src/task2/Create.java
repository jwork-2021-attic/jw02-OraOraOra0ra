package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Create {

    private Monster[] monster;

    Create(Line line, int size){
        monster = new Monster[size];
        List<Integer> list = randomList(size);
        for(int i = 0; i < size; i++){
            int r = ( Color.color[i] >> 16) & 0xff;
            int g = ( Color.color[i] >> 8) & 0xff;
            int b = Color.color[i] & 0xff;
            monster[i] = new Monster(r,g,b,i+1);
            line.put(monster[i],list.get(i));
        }
    }

    public List randomList (int size){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
            list.add(new Integer(i));
        Collections.shuffle(list);
        return list;
    }

    public Monster[] getMonster(){
        return monster;
    }

}
