package cn.how2j.springcloud.utils;

/**
 * @description:
 * @author: congquan
 * @time: 2020/4/22 16:17
 */

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

public class AccessViewService {

    public static void main(String[] args) {

        while(true) {
            ThreadUtil.sleep(1000);
            try {
                String html= HttpUtil.get("http://127.0.0.1:8018/products");
                System.out.println("html length:" + html.length());
            }
            catch(Exception e) {
                System.err.println(e.getMessage());
            }

        }

    }
}
