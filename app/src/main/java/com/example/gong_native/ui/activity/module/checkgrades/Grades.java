package com.example.gong_native.ui.activity.module.checkgrades;

public interface Grades {
    /**
     * 获取成绩来源，一般是考试或者考核
     * @return 成绩来源
     */
    String getName();

    /**
     * 获取成绩
     * @return 成绩，可能是数字（带小数），也有可能是等级，因此使用字符串表示
     */
    String getScore();

    /**
     * 获取其他有关信息
     * @return 返回其他附加信息
     */
    Detail getDetail();
}
