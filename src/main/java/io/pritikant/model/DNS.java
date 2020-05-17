package io.pritikant.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DNS {

    private Map<String,String> dnsMap;

    public DNS() {
        this.dnsMap = new HashMap<String,String>();
    }

    public Map<String, String> getDnsMap() {
        return dnsMap;
    }

    public void setDnsMap(String ip, String host) {
        this.dnsMap.put(ip,host);
    }
}
