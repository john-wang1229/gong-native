package com.example.gong_native.ui.activity.module.checkgrades;

public interface CheckGrades {
    /**
     * 查成绩
     * @param id 对应的id，形式如“考试id-用户token”
     * @return 返回成绩详情
     */
    Grades checkGrades(String id);
}
