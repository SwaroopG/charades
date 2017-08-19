package com.poorjar.charades.services;

import com.poorjar.charades.CharadesAPIApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sgaddameedhi on 8/27/2016.
 */
@Service
public class FileProcessor {
    @Async
    public void processUploadFiles() throws InterruptedException {
        File directory = new File(CharadesAPIApplication.UPLOAD_DIR);
        String [] directoryContents = directory.list();

        List<String> fileLocations = new ArrayList<>();

        for(String fileName: directoryContents) {
            System.out.println(fileName);
            File temp = new File(String.valueOf(directory),fileName);
            fileLocations.add(String.valueOf(temp));
        }
    }

    private FileQueueFlag queueFileForProcessing()
    {
        return null;
    }
}