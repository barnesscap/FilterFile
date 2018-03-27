package com.sch.igor;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileFilter filter = new FilterTxt("txt"); // создаем фильтр
        ForTest.createCatalog(); // создаем каталоги
        ForTest.createFiles(); // создаем файлы

        File[] fileList = ForTest.getCatalog001().listFiles(filter); // сохраняем в массив файлы с каталога

        try {
            for (File file : fileList) {
                CopyFiles.copyFiles(file, new File(ForTest.getCatalog002() + "//" + file.getName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

