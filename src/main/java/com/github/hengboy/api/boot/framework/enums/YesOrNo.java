package com.github.hengboy.api.boot.framework.enums;

import lombok.Getter;

/**
 * Yes Or No 枚举定义
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-03-12 11:22
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengboy
 */
@Getter
public enum YesOrNo {
    YES("Y"),
    NO("N");
    private String value;

    YesOrNo(String value) {
        this.value = value;
    }
}