package com.tangdou.mediator;

import com.tangdou.common.utils.AssertUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 钉钉 中介者
 * 使用钉钉后 不需要每个员工自己保存同事的联系方式
 * @author 崔航
 * @date 2021/2/8 10:54
 */
public class DingTalk {

    private static final Map<String, Colleague> ADDRESS_BOOK = new HashMap<>();

    static {
        ADDRESS_BOOK.put("王总", Colleague.builder().name("王总").phoneNumber("17610915769").build());
        ADDRESS_BOOK.put("刘秘书", Colleague.builder().name("刘秘书").phoneNumber("17612313123").build());
    }

    /**
     * 入职
     * @param colleague 同事
     */
    static void entry(Colleague colleague) {
        ADDRESS_BOOK.put(colleague.getName(), colleague);
        System.out.println("欢迎新同事" + colleague.getName() + "入职");
    }

    /**
     * 联系某人
     * @param name 姓名
     * @return 联系人信息
     */
    static Colleague call(String name) {
        Colleague colleague = ADDRESS_BOOK.get(name);
        AssertUtils.notNull(colleague, name + "不在公司通讯录内");
        System.out.println("正在为您联系" + name);
        return colleague;
    }
}
