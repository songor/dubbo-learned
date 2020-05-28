package com.imooc.dubbo.provider.quickstart;

import com.imooc.dubbo.QuickStartService;

public class QuickStartServiceImpl implements QuickStartService {

    @Override
    public String quickStart(String message) {
        return "Quick Start " + message;
    }

}
