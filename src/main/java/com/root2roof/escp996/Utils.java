package com.root2roof.escp996;

import com.alibaba.fastjson.JSON;

/**
 * @author Suz1
 * @date 2020/8/9 6:54 下午
 */
public class Utils {
    /**
     * Print object in json view.
     *
     * @param o stuff to be printed.
     */
    public static void printJson(Object o) {
        System.out.println(JSON.toJSONString(o));
    }
}
