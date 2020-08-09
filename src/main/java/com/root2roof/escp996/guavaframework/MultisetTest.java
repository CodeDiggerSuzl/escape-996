package com.root2roof.escp996.guavaframework;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Chars;
import org.junit.Test;

/**
 * Guava Multiset.
 * <p>
 * 使用 Multiset 统计一首古诗中文字出现的频率
 * </p>
 *
 * @author Suz1
 * @date 2020/8/9 6:02 下午
 */
public class MultisetTest {
    private static final String POEM =
            "咏鹅" +
                    "鹅，鹅，鹅，曲项向天歌" +
                    "白毛浮绿水，红掌拨清波";


    @Test
    public void handle() {
        // create
        Multiset<Character> multiset = HashMultiset.create();

        char[] chars = POEM.toCharArray();
        multiset.addAll(Chars.asList(chars));
        System.out.println(multiset.size());
        System.out.println(multiset.count('鹅'));
        System.out.println(JSON.toJSONString(multiset, true));
    }
}
