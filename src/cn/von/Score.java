package cn.von;

import lombok.Data;

/**
 * 分数类
 *
 * @author mierfeioulei0
 * @version 1.0
 * @since 2018/10/05
 */
@Data
public class Score {
    private String courseName;
    private double courseScore;

    Score() {

    }

    Score(String courseName, double courseScore) {
        this.courseName = courseName;
        this.courseScore = courseScore;
    }

}
