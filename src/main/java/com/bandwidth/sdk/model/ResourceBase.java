package com.bandwidth.sdk.model;

import com.bandwidth.sdk.BandwidthClient;
import com.bandwidth.sdk.RestResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sbarstow on 10/3/14.
 */
public abstract class ResourceBase extends ModelBase {

	protected String id;

	protected final BandwidthClient client;
	protected final Map<String, Object> properties = new HashMap<String, Object>();
	
	protected ResourceBase(JSONObject jsonObject) {
		this.client = BandwidthClient.getInstance();
		setUp(jsonObject);
	}

	protected ResourceBase(BandwidthClient client, JSONObject jsonObject) {
		this.client = client;
		setUp(jsonObject);
	}
	
	protected abstract void setUp(JSONObject jsonObject);

	protected static JSONObject toJSONObject(RestResponse response)
			throws ParseException {
		return (JSONObject) new JSONParser().parse(response.getResponseText());
	}

	protected static JSONArray toJSONArray(RestResponse response)
			throws ParseException {
		return (JSONArray) new JSONParser().parse(response.getResponseText());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BandwidthClient getClient() {
		return client;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}	

}
