package org.example;

import org.example.models.FileInfo;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadThread extends Thread {

    private FileInfo file;
    private downloadManager manager;

    // Constructor
    public DownloadThread(FileInfo file, downloadManager manager) {
        this.file = file;
        this.manager = manager;
    }

    @Override
    public void run() {
        // Download logic will go here

        this.file.setStatus("Downloading");
        this.manager.updateUI(this.file);
        try {
            Files.copy(new URL(this.file.getUrl()).openStream(), Paths.get(this.file.getPath()));
            this.file.setStatus("Done");

        } catch (IOException e) {
            this.file.setStatus("Failed");
            System.out.println("Downloading error");
        e.printStackTrace();
        }
        this.manager.updateUI(this.file);
    }
}