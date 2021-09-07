package com.seyo.utilities;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {
    public static String getFileContent(String filename){
        Path path = null;
        try {
            path = Paths.get(FileUtility.class.getClassLoader().getResource(filename).toURI());
            return new String(Files.readAllBytes(path));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
