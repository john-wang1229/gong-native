package com.example.gong_native.ui.activity.module.classtable;

public interface Lesson {
    /**
     *
     * @return 课程的名称
     */
    String getLessonName();

    /**
     *
     * @return 授课的老师的名称
     */
    String getTeacherName();

    /**
     *
     * @return 上课时间
     */
    Schedule getTime();

    /**
     *
     * @return 上课地点
     */
    Place getPlace();
}
