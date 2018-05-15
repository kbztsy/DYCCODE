package com.dtsp.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/all")
public class AllController {
    @Autowired
    private CirrhosisController cirrhosisController;
    @Autowired
    private DisbetesController disbetesController;
    @Autowired
    private HeartBrainController heartBrainController;
    @Autowired
    private HurtController hurtController;
    @Autowired
    private InfectiousController infectiousController;
    @Autowired
    private InternalController internalController;
    @Autowired
    private MentalController mentalController;
    @Autowired
    private NauseaController nauseaController;

    @RequestMapping(value = "/all")
    @ResponseBody
    public JSONObject all() {
        JSONObject jsonObject = new JSONObject();
        JSONArray array = new JSONArray();
        JSONObject cirrhosis = cirrhosisController.insert();
        array.add(cirrhosis);
        JSONObject disbetes = disbetesController.insert();
        array.add(disbetes);
        JSONObject heartBrain = heartBrainController.insert();
        array.add(heartBrain);
        JSONObject hurt = hurtController.insert();
        array.add(hurt);
        JSONObject infectious = infectiousController.insert();
        array.add(infectious);
        JSONObject internal = internalController.insert();
        array.add(internal);
        JSONObject mental = mentalController.insert();
        array.add(mental);
        JSONObject nausea = nauseaController.insert();
        array.add(nausea);
        jsonObject.put("AllState", array);
        return jsonObject;
    }
}
