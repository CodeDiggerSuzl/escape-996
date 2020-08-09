package com.root2roof.escp996.resourseclose;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Suz1
 * @date 2020/8/9 2:11 下午
 */
public class FileCopyTest {
    // create input and out put stream
    // copy file read file content and write to another file
    // close resource

    String originUrl = "src/test/java/com/root2roof/escp996/Escape996ApplicationTests.java";
    String targetUrl = "src/main/java/com/root2roof/escp996/resourseclose/a.txt";

    @Test
    public void copyFile() {
        // file in/out put stream
        FileInputStream originStream = null;
        FileOutputStream fileOutputStream = null;
        File file;
        try {
            originStream = new FileInputStream(originUrl);
            fileOutputStream = new FileOutputStream(targetUrl);

            int content;
            // iterator and read/out put byte
            while ((content = originStream.read()) != -1) {
                fileOutputStream.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (originStream != null) {
                try {
                    originStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void copyFileNewTest() {
        try (
                FileInputStream inputStream = new FileInputStream(originUrl);
                FileOutputStream outputStream = new FileOutputStream(targetUrl);
        ) {
            int content;
            // iterator and read/out put byte
            while ((content = inputStream.read()) != -1) {
                outputStream.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
