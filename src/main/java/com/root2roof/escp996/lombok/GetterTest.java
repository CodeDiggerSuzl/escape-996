package com.root2roof.escp996.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.lang.NonNull;

/**
 * Getter 注解
 *
 * @author Suz1
 * @date 2020/8/16 3:51 下午
 */
public class GetterTest {
    @Getter(lazy = true)
    private final String filed = "test";

    @Getter(
            value = AccessLevel.PRIVATE,
            onMethod_ = {@NonNull}
    )
    private String filed2;

}
