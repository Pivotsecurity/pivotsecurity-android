
package pivotsecurity.rest;

import pivotsecurity.rest.ApiBase;
import org.json.JSONObject;

public class Customer extends ApiBase {

    public Customer(){}

    public Customer (String public_key, String private_key){
        super.setKey(public_key);
    }

    public JSONObject create(String uid, String email, String channel){
        if (null == uid) uid = "";
        if (null == email) email = "";
        String params = "{\"uid\":\"" + uid + "\",\"email\":\""+ email + "\",\"channel\":\""+ channel+ "\"}";
        return (JSONObject)super.getResult("customer/create", params);
    }

    public JSONObject getAuthCode(String uid, String email){
        if (null == uid) uid = "";
        if (null == email) email = "";
        String params = "{\"uid\":\"" + uid + "\",\"email\":\""+ email + "\"}";
        return (JSONObject)super.getResult("customer/auth", params);
    }

    public JSONObject verify(String uid, String email, String code){
        if (null == uid) uid = "";
        if (null == email) email = "";
        String params = "{\"uid\":\"" + uid + "\",\"email\":\""+ email + "\",\"code\":\""+ code+ "\"}";
        return (JSONObject)super.getResult("customer/verify", params);
    }

}
