package com.tangdou.composite.filter;

import com.tangdou.composite.user.User;
import com.tangdou.composite.user.attribute.AttributeEnum;

/**
 * @author 崔航
 * @date 2021/2/2 20:42
 */
public class OccupationFilter extends AbstractFilter {

    /**
     * 获取属性
     *
     * @param user 用户信息
     * @return 属性
     */
    @Override
    AttributeEnum getAttribute(User user) {
        return user.getOccupation();
    }
}
