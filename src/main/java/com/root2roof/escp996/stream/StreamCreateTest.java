package com.root2roof.escp996.stream;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 4 种创建流的方式
 *
 * @author Suz1
 * @date 2020/8/9 1:09 下午
 */
public class StreamCreateTest {
    @Test
    public void streamFromValue() throws IOException {
        // create from value
        Stream<Integer> stream = Stream.of(1, 2, 34, 9, 52, 7);
        // from array
        int[] arr = {1, 2, 34, 5, 56,};
        IntStream arrStream = Arrays.stream(arr);
        // from file java.nio
        Stream<String> lineStream = Files.lines(Paths.get("/Users/suzl/dev/java/escape-996/src/main/java/com/root2roof/escp996/stream/StreamHandlerTest.java"));
        lineStream.forEach(System.out::println);
        // use function
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(100L);
        iterate.forEach(System.out::println);
        Stream<Double> generate = Stream.generate(Math::random).limit(100L);
        generate.forEach(System.out::println);
    }
}
