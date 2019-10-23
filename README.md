##### 点击间隔工具

1. 防止多次点击做重复的动作
2. 在不同的上下文中清空间隔时间

*例：*

    @Override
    public void onClick(View var1) {
    	if (ClickInterval.isFastClick(getClass().getSimpleName()))
                return;
        switch (var1.getId()) {
		...
    	}
    }
