package com.root2roof.escp996.lombok;

import lombok.ToString;

/**
 * ToString Annotation
 *
 * @author Suz1
 * @date 2020/8/16 4:09 下午
 */
@ToString(includeFieldNames = false,
        of = {"filed1"}
)
public class ToStringTest {
    private String filed1;
    private String filed2;
}
