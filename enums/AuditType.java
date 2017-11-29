package com.shenni.focusing.enums;

/**
 * 微认证
 */
public enum AuditType {
//    微认证（0:未认证,1:已认证,2:认证失败）
    SEX_USER_B((byte) 0, "未认证"),
    SEX_USER_G((byte) 1, "已认证"),
    SEX_USER_X((byte) 2, "认证失败");


    public byte code;
    public String text;


    public byte getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    AuditType(byte code, String text) {
        this.code = code;
        this.text = text;
    }

    public static String getText(byte code) {
        AuditType em = getByCode(code);
        if (em != null)
            return em.text;
        return "";
    }

    public static AuditType getByCode(int code) {
        for (AuditType type : AuditType.values()) {
            if (code == type.code)
                return type;
        }
        return null;
    }
}
