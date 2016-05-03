package com.sylphe.app.android;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;

import java.net.URI;

/**
 * Created by myks7 on 2016-03-15.
 */
public class UserState {
    private int id;
    private final CoapClient client;
    private int connectedRoomId;
    private int userProperties;

    public UserState(URI uri){
        client = new CoapClient(uri+"/LoginManager");
    }

    public void login(){
     //   client.put("",MsgType.REQUEST_ID);
        CoapResponse response = client.get();
        if (response!=null) {
            id = Integer.valueOf(response.getResponseText());
        }
    }

    public int getId(){
        return id;
    }

    public int getConnectedRoomId() {
        return connectedRoomId;
    }

    public void setConnectedRoomId(int connectedRoomId) {
        this.connectedRoomId = connectedRoomId;
    }

    public int getUserProperties() {
        return userProperties;
    }

    public void setUserProperties(int userProperties) {
        this.userProperties = userProperties;
    }
}
