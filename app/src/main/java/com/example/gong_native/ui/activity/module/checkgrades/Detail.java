package com.example.gong_native.ui.activity.module.checkgrades;

public interface Detail <INFO>{
    /**
     * 获取详细信息
     * @param key 信息的id
     * @return 返回详细信息
     */
    INFO getInfo(String key);

    /**
     * 设置/添加详细信息
     * @param key 信息的id
     * @param t 信息的值
     * @return 返回id所对应的信息（调用之后，可依据此来判断是否操作成功）
     */
    INFO setInfo(String key,INFO t);
}
