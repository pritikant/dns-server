package io.pritikant.service;

import io.pritikant.model.DNS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class DNSService {


    private DNS dns;


    public DNSService() {
            dns = new DNS();
    }

    public Map getDNSlist(){

        dns.setDnsMap("IP1","host1");
        dns.setDnsMap("IP2","host2");
        dns.setDnsMap("IP3","host3");

        return dns.getDnsMap();
    }


}
