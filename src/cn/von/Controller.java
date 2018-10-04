package cn.von;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


/**
 * Created by mierfeioulei0 on 2018/10/4.
 */
public class Controller {
    public Label errLabel;

    public void test() {
        errLabel.setText("该功能暂未开放");

    }

    public void onButtonClick() {
        Stage fileStage = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Excel Files", "*.xls"));
        fileChooser.setTitle("选择Excel文件");
        File selectedFile = fileChooser.showOpenDialog(fileStage);
        String path = selectedFile.getPath();
        System.out.println(path);

    }


}


