package com.root2roof.escp996.lombok;

import lombok.val;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Suz1
 * @date 2020/8/16 7:37 下午
 */
public class ValTest {
    @Test
    public void valTest() {
        val s = "hah";
        val aInt = "23";
        val list = new ArrayList<String>();
        val aLong = 10L;
        list.add(s);

    }
}
