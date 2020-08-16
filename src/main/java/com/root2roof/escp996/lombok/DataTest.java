package com.root2roof.escp996.lombok;

import lombok.Data;

/**
 * 大而全的注解,包含 @Getter @Setter EqualsAndHashCode @ToString
 *
 * @author Suz1
 * @date 2020/8/16 7:32 下午
 */
@Data
public class DataTest {
    private String  name;
    private Integer age;
}
