package com.root2roof.escp996.lombok;

import lombok.NonNull;
import org.junit.Test;

/**
 * @author Suz1
 * @date 2020/8/16 7:41 下午
 */
public class NotNullTest {
    private void notNullMethod(@NonNull String s) {
        System.out.println(s);
    }

    @Test
    public void nullTest() {
        this.notNullMethod(null);
    }
}
