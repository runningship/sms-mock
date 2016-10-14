package com.jumore.sms.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jumore.dove.service.sms.SmsServiceRemote;

@Service(value = "smsServiceRemoteImpl")
public class SmsServiceRemoteImpl implements SmsServiceRemote{

    protected static final Logger logger = LoggerFactory.getLogger(SmsServiceRemoteImpl.class);

    /**
     * 用3通道
     */
    public boolean sendSMS(String functionNo, String mobile, String content, String siteId, String userIP) {
        return true;
    }

    /**
     * 3,4通道互用
     */
    public boolean sendSMSVerfiCode(String functionNo, String mobile, String perfectContent, String siteId, String userIP) {
        return true;
    }

    /**
     * 3,4通道互用,需要先建立短信模板,运营商审核
     */
    public boolean sendSMSVerfiCode(String functionNo, String mobile, String verificationCode, String statSnTplCode, String siteId, String userIP) {
        return true;
    }

}
