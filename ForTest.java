package com.sch.igor;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/*Тестовый класс, который создает каталоги и файлы с рандомным названием
и расширением.
* */
public class ForTest {
    private static String out = "D:\\HomeWorkOOP\\IO0_001\\out";
    private static String in = "D:\\HomeWorkOOP\\IO0_001\\in";
    private static File catalog001;
    private static File catalog002;

    public ForTest() {
    }


    public static String getOut() {
        return out;
    }

    public static void setOut(String out) {
        ForTest.out = out;
    }

    public static String getIn() {
        return in;
    }

    public static void setIn(String in) {
        ForTest.in = in;
    }

    public static File getCatalog001() {
        return catalog001;
    }

    public static void setCatalog001(File catalog001) {
        ForTest.catalog001 = catalog001;
    }

    public static File getCatalog002() {
        return catalog002;
    }

    public static void setCatalog002(File catalog002) {
        ForTest.catalog002 = catalog002;
    }

    //создаем каталоги
    public static void createCatalog() {

        catalog001 = new File(out);
        catalog001.mkdirs();
        catalog002 = new File(in);
        catalog002.mkdirs();
    }

    /*создаем файлы (делать проверку на то, есть ли в каталоге файл с именем нового файла лень,
    поэтому просто поставлю большой рандом для определения названия файла) */
    public static void createFiles() throws IOException {
        Random random = new Random();
        for (int k = 0; k < 20; k++) {
            File file = new File(out + "\\" + random.nextInt(1000) + "." + randomType(random.nextInt(10)));
            file.createNewFile();
        }
    }

    //метод для случайного определения формата файла
    private static String randomType(double x) {
        if (x > 2 && x <= 4) {
            return "doc";
        }
        if (x > 4 && x <= 6) {
            return "pdf";
        }
        if (x > 6 && x <= 8) {
            return "jpeg";
        }
        if (x > 8) {
            return "png";
        }
        return "txt";
    }
}
