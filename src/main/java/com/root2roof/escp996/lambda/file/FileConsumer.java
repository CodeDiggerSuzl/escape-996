package com.root2roof.escp996.lambda.file;

/**
 * @author Suz1
 * @date 2020/7/18 1:29 上午
 */
@FunctionalInterface
public interface FileConsumer {
    /**
     * 函数式接口抽象的方法
     *
     * @param fileContent 文件内容字符串
     */
    void handleFile(String fileContent);
}
