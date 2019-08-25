package io.codefountain.java.recipes.lambda;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FilenameFilterDemo {

    public static void main(String[] args) {

        File mainDir = new File(".");

        FilenameFilter f = (dir, name) ->  {
            return name.endsWith(".java");
        };

        Arrays.asList(mainDir.list(f));
    }
}
