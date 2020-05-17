package io.pritikant.controller;

import io.pritikant.service.DNSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DNScontroller {

    @Autowired
    private DNSService dnsService;

    @GetMapping("/")
    public Map getDNSlist(){
        return dnsService.getDNSlist();
    }
}
