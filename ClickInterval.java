package com.item.video.utils;

/**
 * 点击间隔
 */
public class ClickInterval {
    // 两次点击按钮之间的点击间隔不能少于1000毫秒
    private static final int MIN_CLICK_DELAY_TIME = 1000;
    private static long lastClickTime;
    private static String contextName;

    public static boolean isFastClick(String context) {
        long curClickTime = System.currentTimeMillis();
        if (!context.equals(contextName)) { //不同context不共用计时
            contextName = context;
            lastClickTime = curClickTime;
            return false;
        }

        if ((curClickTime - lastClickTime) >= MIN_CLICK_DELAY_TIME) {
            lastClickTime = curClickTime;
            return false;
        }
        return true;
    }
}
