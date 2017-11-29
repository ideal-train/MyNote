package com.shenni.focusing.enums;

/**
 * Created by lijiafu
 */
public enum SexType {
//    sex:性别(1=>男,0=>女)
    SEX_USER_B((byte) 1, "男"),
    SEX_USER_G((byte) 0, "女"),
    SEX_USER_X((byte) 2, "未知");


    public byte code;
    public String text;


    public byte getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    SexType(byte code, String text) {
        this.code = code;
        this.text = text;
    }

    public static String getText(byte code) {
        SexType em = getByCode(code);
        if (em != null)
            return em.text;
        return "";
    }

    public static SexType getByCode(int code) {
        for (SexType type : SexType.values()) {
            if (code == type.code)
                return type;
        }
        return null;
    }
}
