点击间隔工具
*防止多次点击做重复的动作
*在不同的上下文中清空间隔时间
例如：
    @Override
    public void onClick(View var1) {
        if (ClickInterval.isFastClick(getClass().getSimpleName()))
            return;
         witch (var1.getId()) {
            case   ...
        }
      }
