package org.example;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;    // ← CORRECT
import javafx.scene.control.TextField;
import org.example.config.appConfig;
import org.example.models.FileInfo;

import java.io.File;

public class downloadManager {

    @FXML
    private TextField urlTextField;
    public int index=0;


    @FXML
    void downloadButtonClicked(ActionEvent event) {
        String url=urlTextField.getText().trim();
     String fileName=url.substring(url.lastIndexOf(str."/")+1);
     String status ="starting";
     String action="open";
     String path= appConfig.DOWNLOAD_PATH+File.separator+fileName;
        FileInfo file=new FileInfo((index+1),fileName,url,status,action, path);



    }
    public void updateUI(FileInfo metaFile){

        System.out.println( );

    }
}
