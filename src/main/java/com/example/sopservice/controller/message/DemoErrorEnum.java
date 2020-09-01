package com.example.sopservice.controller.message;

import com.gitee.sop.servercommon.message.ServiceErrorMeta;

public enum DemoErrorEnum {

    NO_NAME("100");

    private ServiceErrorMeta errorMeta;

    DemoErrorEnum(String subCode) {
        this.errorMeta = new ServiceErrorMeta("isp.demo_error_", subCode);
    }

    public ServiceErrorMeta getErrorMeta() {
        return errorMeta;
    }


}
