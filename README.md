#### Android点击间隔工具

1. 防止多次点击做重复的动作
2. 在不同的上下文中清空间隔时间

*例子：*

    @Override
    public void onClick(View var1) {
    	if (ClickInterval.isFastClick(getClass().getSimpleName()))
                return;
        switch (var1.getId()) {
		...
    	}
    }

*代码：*

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
