package com.minclouds.app.callback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class CallbackService {

    @Autowired
    private AsyncTaskExecutor asyncTaskExecutor;

    public void callback(NoticeData noticeData) {
        asyncTaskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(noticeData.toString());
            }
        });
    }
}
