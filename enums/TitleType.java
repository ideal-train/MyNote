package com.shenni.focusing.enums;

/**
 * 分享Enum
 */
public enum TitleType {

    /**
     * 资讯
     */
    getinfo((byte) 1, "资讯", "info"),
    /**
     * 百科改为史记
     */
    getbaike((byte) 2, "史记", "baike"),
    /**
     * 悬赏
     */
    gethiree((byte) 3, "悬赏", "hire"),
    /**
     * 圈子
     */
    getqun((byte) 4, "圈子", "qun"),
    /**
     * 排行：match
     */
    paihang((byte) 5, "排行", "match"),

    /**
     * 影视：filmbooks
     */
    filmbooks((byte) 6, "影视", "filmbooks"),

    /**
     * 私密：privacy
     */
    privacy((byte) 7, "私密", "privacy"),;


    public byte code;
    public String title;
    public String text;

    public String getKey() {
        return text;
    }

    TitleType(String code) {
        this.text = text;
    }


    TitleType(byte code, String title, String text) {
        this.code = code;
        this.title = title;
        this.text = text;
    }

    public static String getKey(byte code) {
        TitleType em = getByCode(code);
        if (em != null)
            return em.text;
        return "info";
    }

    public static String getTitle(byte code) {
        TitleType em = getByCode(code);
        if (em != null)
            return em.title;
        return "其他";
    }

    private static TitleType getByCode(int code) {
        for (TitleType type : TitleType.values()) {
            if (code == type.code)
                return type;
        }
        return null;
    }

//    ---------------------------

    public static String getTitle(String code) {
        TitleType em = getByCode(code);
        if (em != null)
            return em.text;
        return "info";
    }

    private static TitleType getByCode(String code) {
        for (TitleType type : TitleType.values()) {
            if (code == type.title)
                return type;
        }
        return null;
    }

}
