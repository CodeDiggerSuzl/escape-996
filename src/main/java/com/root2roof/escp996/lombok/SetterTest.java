package com.root2roof.escp996.lombok;

import lombok.AccessLevel;
import lombok.Setter;
import org.springframework.lang.NonNull;

/**
 * @author Suz1
 * @date 2020/8/16 4:05 下午
 */

public class SetterTest {
    @Setter(value = AccessLevel.PRIVATE,
            onMethod_ = {@NonNull}
    )
    private String filed1;
    private String filed2;
}
