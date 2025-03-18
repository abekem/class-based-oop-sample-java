package oop.sample.encapsulation;

import java.util.List;

public class LongMethod {
    public static void longMethod() {
        boolean 条件 = true;
        List<String> 何かのリスト = List.of("A", "B", "C");

        if (条件) {
            //
            // 数十行に及ぶ何らかの処理
            //
            for (String 文字列 : 何かのリスト) {
                //
                // 数十行に及ぶ何らかの処理
                //
            }
            //
            // 数十行に及ぶ何らかの処理
            //
            if (条件) {
                //
                // 数十行に及ぶ何らかの処理
                //
            } else {
                //
                // 数十行に及ぶ何らかの処理
                //
            }
            //
            // 数十行に及ぶ何らかの処理
            //
        }
    }
}
