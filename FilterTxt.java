package com.sch.igor;

import java.io.File;
import java.io.FileFilter;

public class FilterTxt implements FileFilter {
    private String[] arr;

    public FilterTxt(String... arr) {
        super();
        this.arr = arr;
    }

    public FilterTxt() {

    }

    private boolean check(String ext) {
        for (String stringExt : arr) {
            if (stringExt.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }
}


