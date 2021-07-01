package com.minclouds.app.callback;

/**
 * 通知APP的回调的消息内容
 */
public enum NoticeType {
    //收到设备注册申请的消息
    //Android设备开始下载时通知
    //企业签APP，下载开始时通知
    requested,
    //设备已注册成功，并获取到设备证书
    //Android，和企业签等不需要注册设备类型的APP，不会收到该类型通知
    registered,
    //设备成功下载了APP，包括安卓设备，如果下载过程中被中断，则不会收到该通知
    downloaded,
}