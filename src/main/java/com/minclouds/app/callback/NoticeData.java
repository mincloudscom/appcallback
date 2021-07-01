package com.minclouds.app.callback;

import java.io.Serializable;

public class NoticeData implements Serializable {
    private static final long serialVersionUID = 1L;
    //在上传的mincloud.com上传的app中，进入管理界面可查看APP的uuid
    private String appUuid;
    //APP的名称，APP在上传时，从包里面解析出的APP名字
    private String name;
    //相同的APP名字可以用标签作为区分，如果未设置，则返回null
    private String tag;
    //注册设备的UDID，安卓设备下载不包含该值
    private String udid;
    //注册过程的中的通知，苹果手机下载，可能有会通知所有支持的消息，安卓设备下载成功后通知一次
    private NoticeType notice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAppUuid() {
        return appUuid;
    }

    public void setAppUuid(String appUuid) {
        this.appUuid = appUuid;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public NoticeType getNotice() {
        return notice;
    }

    public void setNotice(NoticeType notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "NoticeData{" +
                "appUuid='" + appUuid + '\'' +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", udid='" + udid + '\'' +
                ", notice=" + notice +
                '}';
    }
}
