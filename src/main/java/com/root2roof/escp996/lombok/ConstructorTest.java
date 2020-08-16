package com.root2roof.escp996.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Suz1
 * @date 2020/8/16 7:49 下午
 */
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ConstructorTest {
    @NonNull
    private String  name;
    private Integer age;
}
