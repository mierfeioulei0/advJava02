package cn.von;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mierfeioulei0 on 2018/9/26.
 */
public class Student {
    String id;
    String name;
    ArrayList<Score> scoreList;
    Student(String id, String name, List<Score> scoreList){
        this.id=id;
        this.name = name;
        this.scoreList = new ArrayList<>();
        this.scoreList.addAll(scoreList);//
        //scoreList.forEach(s->this.scoreList.add(s));//
    }
}
