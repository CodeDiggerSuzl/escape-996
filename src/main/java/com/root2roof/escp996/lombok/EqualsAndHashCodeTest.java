package com.root2roof.escp996.lombok;

import lombok.EqualsAndHashCode;


/**
 * @author Suz1
 * @date 2020/8/16 4:14 下午
 */
@EqualsAndHashCode(exclude = {"name"})
public class EqualsAndHashCodeTest {
    private String  name;
    private Integer age;
}
