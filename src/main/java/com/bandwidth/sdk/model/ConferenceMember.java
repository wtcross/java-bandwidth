package com.bandwidth.sdk.model;

import com.bandwidth.sdk.BandwidthRestClient;
import org.json.simple.JSONObject;

import java.util.Date;

/**
 * Information about conference member.
 *
 * @author vpotapenko
 */
public class ConferenceMember extends BaseModelObject {

    public ConferenceMember(BandwidthRestClient client, String parentUri, JSONObject jsonObject) {
        super(client, parentUri, jsonObject);
    }

    @Override
    protected String getUri() {
        return null;
    }

    public String getCall() {
        return getPropertyAsString("call");
    }

    public String getState() {
        return getPropertyAsString("state");
    }

    public boolean isHold() {
        return getPropertyAsBoolean("hold");
    }

    public boolean isMute() {
        return getPropertyAsBoolean("mute");
    }

    public boolean isJoinTone() {
        return getPropertyAsBoolean("joinTone");
    }

    public boolean isLeavingTone() {
        return getPropertyAsBoolean("leavingTone");
    }

    public Date getAddedTime() {
        return getPropertyAsDate("addedTime");
    }

    @Override
    public String toString() {
        return "ConferenceMember{" +
                "id='" + getId() + '\'' +
                ", call='" + getCall() + '\'' +
                ", state='" + getState() + '\'' +
                ", hold=" + isHold() +
                ", mute=" + isMute() +
                ", joinTone=" + isJoinTone() +
                ", leavingTone=" + isLeavingTone() +
                ", addedTime=" + getAddedTime() +
                '}';
    }
}
