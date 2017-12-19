package com.rairmmd.mqttlibs;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * @author Rair
 * @date 2017/12/13
 * <p>
 * desc:
 */

public class UnSubscribeBuilder implements IBuilder {

    private String mTopic;

    /**
     * 设置主题
     *
     * @param mTopic 主题
     * @return UnSubscribeBuilder
     */
    public UnSubscribeBuilder setTopic(String mTopic) {
        this.mTopic = mTopic;
        return this;
    }

    @Override
    public void execute(IMqttActionListener listener) throws MqttException {
        MqttManager.getInstance().getConnectBuilder().getClient()
                .unsubscribe(mTopic, null, listener);
    }
}
