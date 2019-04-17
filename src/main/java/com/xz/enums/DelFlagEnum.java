package com.xz.enums;

/**
 * @author xuby
 * @version 2019/2/21
 */
public enum DelFlagEnum {
    /**
     * 正常
     */
    NORMAL(0, "正常"),
    /**
     * 删除
     */
    DELETE(1, "删除"),
    /**
     * 审核
     */
    AUDIT(2, "审核");
    private int value;
    private String desc;

    private DelFlagEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static DelFlagEnum getEnum(int value) {
        for (DelFlagEnum delFlagEnum : DelFlagEnum.values()) {
            if (delFlagEnum.getValue() == value) {
                return delFlagEnum;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }
}
