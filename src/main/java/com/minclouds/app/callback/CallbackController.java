package com.minclouds.app.callback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController {
    @Autowired
    CallbackService callbackService;

    /**
     * APP下载安装过程全流程通知消息回调接口例子
     * 当有消息回调的时候，说明有用户正在下载APP
     * 详细信息可以查看minclouds.com 网站说明
     * <p>
     * 回调地址路径：http://yourdomain/app/callback
     *
     * @param noticeData 通知消息的具体内容
     * @return 应始终立即返回 success
     * @see NoticeType 通知消息具体类型
     */
    @RequestMapping(value = "/app/callback", method = RequestMethod.POST)
    public String callback(@RequestBody NoticeData noticeData) {
        //不要抛出任何异常，接收到消息后立即返回"success"，处理逻辑放到其他线程去处理
        try {
            callbackService.callback(noticeData);
        } catch (Exception e) {
        }
        return "success";
    }
}
