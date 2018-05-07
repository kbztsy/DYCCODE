package com.dtsp.demo.controller;

import com.dtsp.demo.ModelNew.AIDSNew;
import com.dtsp.demo.ModelOld.AIDSOld;
import com.dtsp.demo.ModelRef.AIDSRef;
import com.dtsp.demo.service.IAIDSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class AIDSController {
    private Logger logger = LoggerFactory.getLogger(AIDSController.class);
    @Autowired
    private IAIDSService aidsService;
    @Autowired
    private AIDSRef aidsRef;
    @RequestMapping("/aids")
    @ResponseBody
    List<AIDSNew> aidsNewList(){
        List<AIDSOld> aids = aidsService.findAIDS();
        List<AIDSNew> aidsNews = aidsRef.REF(aids);
        return aidsNews;
    }
}
