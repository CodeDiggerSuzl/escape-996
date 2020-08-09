package com.root2roof.escp996.guavaframework;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Suz1
 * @date 2020/8/9 2:59 下午
 */
public class OptionTest {
    @Test
    public void optionTest() {
        Optional<Object> o = Optional.empty();
        Optional<Integer> integer = Optional.of(1);
        Optional<Object> optional = Optional.ofNullable(null);
        boolean present = optional.isPresent();
        optional.ifPresent(System.out::println);
        Object we = optional.orElse("we");
        optional.orElseGet(() -> { return "else"; });
        optional.orElseThrow(() -> { throw new RuntimeException("引用缺失"); });
    }


    @Test
    public void streamOptionalTest() {
        //        List<String> of = List.of("1", "2");
        //        Optional.of(of).map(List::stream)
        //                .orElseGet(Stream::empty)
        //                .forEach(System.out::println);
    }
}
