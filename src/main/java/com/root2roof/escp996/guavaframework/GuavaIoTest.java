package com.root2roof.escp996.guavaframework;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * 使用 Source 和 Sink 对文件进行操作
 *
 * @author Suz1
 * @date 2020/8/9 7:09 下午
 */
public class GuavaIoTest {
    public void cpyFile() throws IOException {
        // 1. create Source and Sink
        CharSource charSource = Files.asCharSource(new File(""), Charsets.UTF_8);
        CharSink charSink = Files.asCharSink(new File(""), Charsets.UTF_8);
        /// ImmutableList<String> strings = charSource.readLines();
        // 2. copy file
        charSource.copyTo(charSink);
    }
}
