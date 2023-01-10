package com.example.gong_native.ui.activity.module.classtable;

import java.sql.Time;

public interface Schedule {
    /**
     * 检查计划是否过期
     * @param time 目标时间
     * @return 返回布尔值，是否在计划之内
     */
    boolean checkTime(Time time);

    /**
     * 计算时间差
     * @param time 目标时间
     * @return 距离下一次发生的返回毫秒值，
     */
    long diffTime(Time time);

}
