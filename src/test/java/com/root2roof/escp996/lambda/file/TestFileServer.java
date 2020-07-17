package com.root2roof.escp996.lambda.file;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @author Suz1
 * @date 2020/7/18 1:41 上午
 */
@Slf4j
public class TestFileServer {
    @Test /* Test function interface of file handle */
    public void testHandleFile() throws IOException {
        FileService fileService = new FileService();
        fileService.fileHandle("", log::info);
    }


}
