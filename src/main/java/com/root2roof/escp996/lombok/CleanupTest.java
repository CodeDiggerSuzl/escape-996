package com.root2roof.escp996.lombok;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Suz1
 * @date 2020/8/16 9:22 下午
 */
public class CleanupTest {
    public void cpyFile(String in, String out) throws Exception {
        @Cleanup FileInputStream fileInputStream = new FileInputStream(in);
        @Cleanup FileOutputStream fileOutputStream = new FileOutputStream(out);
        int r;
        while ((r = fileInputStream.read()) != -1) {
            fileOutputStream.write(r);
        }
    }
}
