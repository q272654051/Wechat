package com.maindear.weixin.sdk.msg.in;

/**
 * 没有找到对应的消息类型
 */
public class InNotDefinedMsg extends InMsg {
    public InNotDefinedMsg(String toUserName, String fromUserName, Integer createTime, String msgType) {
        super(toUserName, fromUserName, createTime, msgType);
    }
}
