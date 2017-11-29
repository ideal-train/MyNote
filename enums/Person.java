package com.shenni.focusing.enums;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by JFL on 2017/11/28.
 * Email：WarwG1@163.com
 * function：
 */
public class Person {

    public static final int VANILLA = 0;
    public static final int CHOCOLATE = 1;
    public static final int STRAWBERRY = 2;

    @IntDef({VANILLA, CHOCOLATE, STRAWBERRY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flavour {
    }


    public static String getFlavour(@Flavour int flavour) {
        @Flavour
        int type = flavour;
        switch (type) {
            case CHOCOLATE:
                return "女";
            case STRAWBERRY:
                return "男";
            case VANILLA:
                return "位置";
            default:
                return "超限";
        }
    }
}
