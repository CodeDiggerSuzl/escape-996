package com.root2roof.escp996.lambda.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文件服务类
 *
 * @author Suz1
 * @date 2020/7/18 1:28 上午
 */
public class FileService {
    /**
     * 通过 url 获取文件,然后在调用函数式接口处理
     *
     * @param url          文件路径
     * @param fileConsumer 文件消费者
     */
    public void fileHandle(String url, FileConsumer fileConsumer) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(url)));
        // 行变量
        String line;
        // store all the file line
        StringBuilder sb = new StringBuilder();
        // 一直读取文件内容
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        // 处理文件(函数式接口
        fileConsumer.handleFile(sb.toString());
    }
}
