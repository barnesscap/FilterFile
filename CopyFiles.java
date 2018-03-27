package com.sch.igor;

import java.io.*;


public class CopyFiles {

    public static void copyFiles(File in, File out) throws IOException {

        if (in == null || out == null) {
            throw new IllegalArgumentException("Файл отсутствует");
        }
        try (InputStream inS = new FileInputStream(in);
             OutputStream outS = new FileOutputStream(out)) {
            byte[] buffer = new byte[32 * 1024];
            int byteRead = 0;

            while ((byteRead = inS.read(buffer)) > 0) {
                outS.write(buffer, 0, byteRead);
            }

        } catch (IOException e) {
            throw e;
        }
    }


}
