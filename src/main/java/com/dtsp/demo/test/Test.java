package com.dtsp.demo.test;

import com.dtsp.demo.model.*;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Test {

    public void dom4jToXml() {
//        FileWriter out = null;
//        try {
//            out = new FileWriter( "src/foo.xml" );  //写入文件
//            createDocument().write( out );//生成xml

            String str=createDocument().asXML();//转为字符串
            System.out.println("字符串"+str);//输出xml字符串
        /**
         * json语句字符串
         */
//        String s="{\n" +
//                    "  \"DataExchange\": {\n" +
//                    "      \"eventHead\": {\n" +
//                    "      \"eventId\": \"310117003-20140505101010-026\",\n" +
//                    "      \"entityName\": \"IDR_NCD_CODRIS\",\n" +
//                    "      \"operateType\": \"Add\"\n" +
//                    "    },\n" +
//                    "    \"eventBody\": {\n" +
//                    "      \"BaseInfo\": {\n" +
//                    "        \"PatientName\": \"!\",\n" +
//                    "        \"BirthDate\": \"!\",\n" +
//                    "        \"GenderCode\": \"!\",\n" +
//                    "        \"GenderName\": \"!\",\n" +
//                    "        \"NationCode\": \"!\",\n" +
//                    "        \"NationName\": \"!\",\n" +
//                    "        \"EmployerOrgName\": \"！\",\n" +
//                    "        \"IDR_OccupationCode\": \"!\",\n" +
//                    "        \"NCD_OccupationCode\": \"!\",\n" +
//                    "        \"CODRIS_OccupationCode\": \"!\",\n" +
//                    "        \"OccupationName\": \"!\",\n" +
//                    "        \"OtherOccupationName\": \"!\",\n" +
//                    "        \"GuardianName\": \"!\",\n" +
//                    "        \"TeleCom\": \"!\",\n" +
//                    "        \"OrgCountyCode\": \"!\",\n" +
//                    "        \"OrgCountyName\": \"!\",\n" +
//                    "        \"OrgCode\": \"!\",\n" +
//                    "        \"OrgName\": \"!\",\n" +
//                    "        \"LivingAddressAttributionCode\": \"!\",\n" +
//                    "        \"LivingAddressAttributionName\": \"!\",\n" +
//                    "        \"LivingAddressCode\": \"!\",\n" +
//                    "        \"LivingAddressName\": \"!\",\n" +
//                    "        \"LivingAddressDetails\": \"!\",\n" +
//                    "        \"IDCardType\": \"1\",\n" +
//                    "        \"IDCardCode\": \"411221196112140212\",\n" +
//                    "        \"DiagnosisDate\": \"!\",\n" +
//                    "        \"DiseaseCode\": \"!\",\n" +
//                    "        \"DiseaseName\": \"!\",\n" +
//                    "        \"DiseaseCause\": \"!\",\n" +
//                    "        \"CardNotes\": \"!\",\n" +
//                    "        \"DeathDate\": \"!\",\n" +
//                    "        \"FillingDoctorName\": \"!\",\n" +
//                    "        \"CardFillingTime\": \"!\",\n" +
//                    "        \"DomicileAddressCode\": \"!\",\n" +
//                    "        \"DomicileAddressName\": \"!\",\n" +
//                    "        \"DomicileAdrressDetails\": \"!\",\n" +
//                    "        \"DomicileAddressAttributionCode\": \"!\",\n" +
//                    "        \"DomicileAddressAttributionName\": \"!\",\n" +
//                    "        \"Country\": \"中国大陆\",\n" +
//                    "        \"MaritalStatusCode\": \"!\",\n" +
//                    "        \"MaritalStatusName\": \"!\",\n" +
//                    "        \"EducationLevelCode\": \"!\",\n" +
//                    "        \"EducationLevelName\": \"!\",\n" +
//                    "        \"LifeTimeAddr\": \"浙江省宁波市海曙区西门街道\",\n" +
//                    "        \"LifeTimeZoneCode\": \"33020301\",\n" +
//                    "        \"LifeTimeVillageCode\": \"!\",\n" +
//                    "        \"LifeTimeAddrTypeCode\": \"1\",\n" +
//                    "        \"RegisterVillageCode\": \"!\",\n" +
//                    "        \"DeathPlaceCode\": \"!\",\n" +
//                    "        \"DiagnosisTypeCode\": \"!\",\n" +
//                    "        \"DiagnosisTypeName\": \"!\",\n" +
//                    "        \"Hospitalnum\": \"!\",\n" +
//                    "        \"CardID\": \"!\",\n" +
//                    "        \"CreatingTime\": \"!\"\n" +
//                    "      },\n" +
//                    "      \"IDRCard\": {\n" +
//                    "        \"CaseClassificationCode\": \"!\",\n" +
//                    "        \"CaseClassificationName\": \"!\",\n" +
//                    "        \"OtherDiseaseName\": \"!\",\n" +
//                    "        \"CloseContactsSymptomCode\": \"!\",\n" +
//                    "        \"CloseContactsSymptomName\": \"!\",\n" +
//                    "        \"Customer\": \"!\",\n" +
//                    "        \"DeletingReasonDetails\": \"!\",\n" +
//                    "        \"DeletingTypeCode\": \"!\",\n" +
//                    "        \"DeletingTypeName\": \"!\",\n" +
//                    "        \"AIDS\": {\n" +
//                    "          \"AIDSCardID\": \"!\",\n" +
//                    "          \"ContactHistoryCode\": \"!\",\n" +
//                    "          \"ContactHistoryName\": \"!\",\n" +
//                    "          \"InjectionTogetherNum\": \"!\",\n" +
//                    "          \"NonmaritalSexNum\": \"!\",\n" +
//                    "          \"HomosexualSexNum\": \"!\",\n" +
//                    "          \"OtherContactHistory\": \"!\",\n" +
//                    "          \"VenerealHistoryCode\": \"2\",\n" +
//                    "          \"VenerealHistoryName\": \"!\",\n" +
//                    "          \"PossibleInfectionRouteCode\": \"2\",\n" +
//                    "          \"PossibleInfectionRouteName\": \"!\",\n" +
//                    "          \"OtherInfectionRoute\": \"!\",\n" +
//                    "          \"SpecimenSourceCode\": \"!\",\n" +
//                    "          \"SpecimenSourceName\": \"!\",\n" +
//                    "          \"OtherSampleSource\": \"!\",\n" +
//                    "          \"LaborTestConclusionCode\": \"!\",\n" +
//                    "          \"LaborTestConclusionName\": \"!\",\n" +
//                    "          \"ConfirmedTestPositiveDate\": \"!\",\n" +
//                    "          \"ConfirmedTestPositiveOrgName\": \"!\",\n" +
//                    "          \"AIDSDiagnosisDate\": \"!\",\n" +
//                    "          \"ChlamydialTrachomatisCode\": \"!\",\n" +
//                    "          \"ChlamydialTrachomatisName\": \"!\"\n" +
//                    "        },\n" +
//                    "        \"HFMD\": {\n" +
//                    "          \"HFMDCardID\": \"!\",\n" +
//                    "          \"IntensivePatientCode\": \"!\",\n" +
//                    "          \"IntensivePatientName\": \"!\",\n" +
//                    "          \"LaborTestResultCode\": \"!\",\n" +
//                    "          \"LaborTestResultName\": \"!\"\n" +
//                    "        },\n" +
//                    "        \"AFP\": {\n" +
//                    "          \"AFPCardID\": \"!\",\n" +
//                    "          \"PatientResidenceTypeCode\": \"!\",\n" +
//                    "          \"PatientResidenceTypeCodeName\": \"!\",\n" +
//                    "          \"PalsyDate\": \"!\",\n" +
//                    "          \"TreatmentlandDate\": \"!\",\n" +
//                    "          \"TreatmentlandTypeCode\": \"!\",\n" +
//                    "          \"TreatmentlandTypeName\": \"!\",\n" +
//                    "          \"TreatmentlandZoneCode\": \"!\",\n" +
//                    "          \"TreatmentlandZoneName\": \"!\",\n" +
//                    "          \"TreatmentlandLivingAddressDetails\": \"!\",\n" +
//                    "          \"PalsySymptom\": \"!\"\n" +
//                    "        }\n" +
//                    "      },\n" +
//                    "      \"NCDCard\": {\n" +
//                    "        \"LastXycdzss\": \"!\",\n" +
//                    "        \"LastXycdzsz\": \"!\",\n" +
//                    "        \"LastKfxtcdz\": \"!\",\n" +
//                    "        \"LastChxtcdz\": \"!\",\n" +
//                    "        \"Bgv\": \"!\",\n" +
//                    "        \"OutcomeCode\": \"!\",\n" +
//                    "        \"Pathology\": \"!\",\n" +
//                    "        \"Patientnum\": \"!\",\n" +
//                    "        \"Pathologynum\": \"!\",\n" +
//                    "        \"FirstCase\": \"!\",\n" +
//                    "        \"Icdo3Morphology\": \"!\",\n" +
//                    "        \"Icdo3Degree\": \"!\",\n" +
//                    "        \"StagingUnknown\": \"!\",\n" +
//                    "        \"TumorstageT\": \"!\",\n" +
//                    "        \"TumorstageN\": \"!\",\n" +
//                    "        \"TumorstageM\": \"!\",\n" +
//                    "        \"TumorstageIv\": \"!\",\n" +
//                    "        \"Admissiontime\": \"!\",\n" +
//                    "        \"Dischargetime\": \"!\",\n" +
//                    "        \"TumorDiagnosis\": \"!\",\n" +
//                    "        \"HeartbrainDiagnosis\": \"!\",\n" +
//                    "        \"HighestDiagnosisUnit\": \"!\",\n" +
//                    "        \"Managerzonecode\": \"33020300\",\n" +
//                    "        \"Managerorgcode\": \"330203002\",\n" +
//                    "        \"DeathCause\": \"!\",\n" +
//                    "        \"SpecifiDeathCause\": \"!\",\n" +
//                    "        \"Delflag\": \"1\",\n" +
//                    "        \"UseridCreate\": \"!\"\n" +
//                    "      },\n" +
//                    "      \"CODRISCard\": {\n" +
//                    "        \"CauseA\": \"C00\",\n" +
//                    "        \"ICDCodeA\": \"C00\",\n" +
//                    "        \"IntervalTimeA\": \"!\",\n" +
//                    "        \"IntervalUnitCodeA\": \"!\",\n" +
//                    "        \"CauseB\": \"!\",\n" +
//                    "        \"ICDCodeB\": \"!\",\n" +
//                    "        \"IntervalTimeB\": \"!\",\n" +
//                    "        \"IntervalUnitCodeB\": \"!\",\n" +
//                    "        \"CauseC\": \"!\",\n" +
//                    "        \"ICDCodeC\": \"!\",\n" +
//                    "        \"IntervalTimeC\": \"!\",\n" +
//                    "        \"IntervalUnitCodeC\": \"!\",\n" +
//                    "        \"CauseD\": \"!\",\n" +
//                    "        \"ICDCodeD\": \"!\",\n" +
//                    "        \"IntervalTimeD\": \"!\",\n" +
//                    "        \"IntervalUnitCodeD\": \"!\",\n" +
//                    "        \"CauseOther\": \"!\",\n" +
//                    "        \"ICDCodeOther\": \"!\",\n" +
//                    "        \"BasicCause\": \"唇恶性肿瘤\",\n" +
//                    "        \"BasicICDCode\": \"C00\",\n" +
//                    "        \"DiagnosticUnitCode\": \"2\",\n" +
//                    "        \"DiagnosticBasisCode\": \"2\",\n" +
//                    "        \"DoctorName\": \"daf\",\n" +
//                    "        \"PoliceName\": \"jingguan\",\n" +
//                    "        \"FillCardDate\": \"2013-06-24T00:00:00\",\n" +
//                    "        \"Symptoms\": \"!\",\n" +
//                    "        \"InvestigatedName\": \"!\",\n" +
//                    "        \"Relationship\": \"!\",\n" +
//                    "        \"InvestigatedTel\": \"!\",\n" +
//                    "        \"InferCause\": \"!\",\n" +
//                    "        \"Investigator\": \"!\",\n" +
//                    "        \"InvestigateDate\": \"!\",\n" +
//                    "        \"CardFillingTime\": \"2013-06-24T10:01:17\",\n" +
//                    "        \"EntryPeopleName\": \"海曙区直报测试\",\n" +
//                    "        \"ValidTime\": \"!\",\n" +
//                    "        \"CorrectionState\": \"0\",\n" +
//                    "        \"AuditPeopleName\": \"海曙区测试\",\n" +
//                    "        \"FirstValidTime\": \"!\",\n" +
//                    "        \"HospitalNo\": \"7100\",\n" +
//                    "        \"AuditState\": \"3\",\n" +
//                    "        \"WomanTypeCode\": \"!\"\n" +
//                    "      }\n" +
//                    "    }\n" +
//                    "  }\n" +
//                    "}";

//        JSONObject jsonObject = JSONObject.fromObject(s);//转为json格式
//        XMLSerializer xmls=new XMLSerializer();
//        xmls.setRootName("root");//设置root名称
//        xmls.setTypeHintsEnabled(false);//不显示类型
//        String str=xmls.write(jsonObject);
//        System.out.println(str);//输出xml格式字符串
//
//        byte[] data = new byte[0];
//        try {
//            data = str.getBytes("utf-8");//转为data数组格式
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        for(int i=0;i<data.length;i++){
//            System.out.println(data[i]);
//        }

//        } catch (IOException e) {
//            e.printStackTrace();
//         } finally{
//            if (out!=null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//    }
    }

    /**
     * 利用DOM4J写出XML文档
     */
    public static Document createDocument() {

        EventHead eh=new EventHead();
        BaseInfo bi=new BaseInfo();
        IDRCard idrc=new IDRCard();
        AIDS aids=new AIDS();
        HFMD hfmd=new HFMD();
        AFP afp=new AFP();
        NCDCard ncdc=new NCDCard();
        CODRISCard codrisc =new CODRISCard();

        Document document = DocumentHelper.createDocument();

        Element root = document.addElement( "DataExchange" );

        Element eventHead = root.addElement("eventHead");
        eventHead.addElement( "eventId" ).setText(eh.getEventId());
        eventHead.addElement( "entityName" ).setText(eh.getEntityName());
        eventHead.addElement( "operateType" ).setText(eh.getOperateType());

        Element eventBody = root.addElement("eventBody");

        Element baseInfo = eventBody.addElement("BaseInfo");
        baseInfo.addElement("PatientName").setText(bi.getPatientName());
        baseInfo.addElement("BirthDate").setText(bi.getBirthDate().toString());
        baseInfo.addElement("GenderCode").setText(bi.getGenderCode().toString());
        baseInfo.addElement("GenderName").setText(bi.getGenderName());
        baseInfo.addElement("NationCode").setText(bi.getNationCode().toString());
        baseInfo.addElement("NationName").setText(bi.getNationName());
        baseInfo.addElement("EmployerOrgName").setText(bi.getEmployerOrgName());
        baseInfo.addElement("IDR_OccupationCode").setText(bi.getiDR_OccupationCode().toString());
        baseInfo.addElement("NCD_OccupationCode").setText(bi.getnCD_OccupationCode().toString());
        baseInfo.addElement("CODRIS_OccupationCode").setText(bi.getcODRIS_OccupationCode().toString());
        baseInfo.addElement("OccupationName").setText(bi.getOccupationName());
        baseInfo.addElement("OtherOccupationName").setText(bi.getOtherOccupationName());
        baseInfo.addElement("GuardianName").setText(bi.getGuardianName());
        baseInfo.addElement("TeleCom").setText(bi.getTeleCom());
        baseInfo.addElement("OrgCountyCode").setText(bi.getOrgCountyCode());
        baseInfo.addElement("OrgCountyName").setText(bi.getOrgCountyName());
        baseInfo.addElement("OrgCode").setText(bi.getOrgCode().toString());
        baseInfo.addElement("OrgName").setText(bi.getOrgName());
        baseInfo.addElement("LivingAddressAttributionCode").setText(bi.getLivingAddressAttributionCode().toString());
        baseInfo.addElement("LivingAddressAttributionName").setText(bi.getLivingAddressAttributionName());
        baseInfo.addElement("LivingAddressCode").setText(bi.getLivingAddressCode().toString());
        baseInfo.addElement("LivingAddressName").setText(bi.getLivingAddressName());
        baseInfo.addElement("LivingAddressDetails").setText(bi.getLivingAddressDetails());
        baseInfo.addElement("IDCardType").setText(bi.getiDCardType().toString());
        baseInfo.addElement("IDCardCode").setText(bi.getiDCardCode());
        baseInfo.addElement("DiagnosisDate").setText(bi.getDiagnosisDate().toString());
        baseInfo.addElement("DiseaseCode").setText(bi.getDiseaseCode());
        baseInfo.addElement("DiseaseName").setText(bi.getDiseaseName());
        baseInfo.addElement("DiseaseCause").setText(bi.getDiseaseCause());
        baseInfo.addElement("CardNotes").setText(bi.getCardNotes());
        baseInfo.addElement("DeathDate").setText(bi.getDeathDate().toString());
        baseInfo.addElement("FillingDoctorName").setText(bi.getFillingDoctorName());
        baseInfo.addElement("CardFillingTime").setText(bi.getCardFillingTime().toString());
        baseInfo.addElement("DomicileAddressCode").setText(bi.getDomicileAddressCode().toString());
        baseInfo.addElement("DomicileAddressName").setText(bi.getDomicileAddressName());
        baseInfo.addElement("DomicileAdrressDetails").setText(bi.getDomicileAdrressDetails());
        baseInfo.addElement("DomicileAddressAttributionCode").setText(bi.getDomicileAddressAttributionCode().toString());
        baseInfo.addElement("DomicileAddressAttributionName").setText(bi.getDomicileAddressAttributionName());
        baseInfo.addElement("Country").setText(bi.getCountry());
        baseInfo.addElement("MaritalStatusCode").setText(bi.getMaritalStatusCode().toString());
        baseInfo.addElement("MaritalStatusName").setText(bi.getMaritalStatusName());
        baseInfo.addElement("EducationLevelCode").setText(bi.getEducationLevelCode().toString());
        baseInfo.addElement("EducationLevelName").setText(bi.getEducationLevelName());
        baseInfo.addElement("LifeTimeAddr").setText(bi.getLifeTimeAddr());
        baseInfo.addElement("LifeTimeZoneCode").setText(bi.getLifeTimeZoneCode().toString());
        baseInfo.addElement("LifeTimeVillageCode").setText(bi.getLifeTimeVillageCode().toString());
        baseInfo.addElement("LifeTimeAddrTypeCode").setText(bi.getLifeTimeAddrTypeCode().toString());
        baseInfo.addElement("RegisterVillageCode").setText(bi.getRegisterVillageCode().toString());
        baseInfo.addElement("DeathPlaceCode").setText(bi.getDeathPlaceCode().toString());
        baseInfo.addElement("DiagnosisTypeCode").setText(bi.getDiagnosisTypeCode().toString());
        baseInfo.addElement("DiagnosisTypeName").setText(bi.getDiagnosisTypeName());
        baseInfo.addElement("Hospitalnum").setText(bi.getHospitalnum());
        baseInfo.addElement("CardID").setText(bi.getCardID());
        baseInfo.addElement("CreatingTime").setText(bi.getCreatingTime().toString());

        Element iDRCard = eventBody.addElement("IDRCard");
        iDRCard.addElement("CaseClassificationCode").setText(idrc.getCaseClassificationCode().toString());
        iDRCard.addElement("CaseClassificationName").setText(idrc.getCaseClassificationName());
        iDRCard.addElement("OtherDiseaseName").setText(idrc.getOtherDiseaseName());
        iDRCard.addElement("OnsetDate").setText(idrc.getOnsetDate().toString());
        iDRCard.addElement("CloseContactsSymptomCode").setText(idrc.getCloseContactsSymptomCode());
        iDRCard.addElement("CloseContactsSymptomName").setText(idrc.getCloseContactsSymptomName());
        iDRCard.addElement("Customer").setText(idrc.getCustomer());
        iDRCard.addElement("DeletingReasonDetails").setText(idrc.getDeletingReasonDetails());
        iDRCard.addElement("DeletingTypeCode").setText(idrc.getDeletingTypeCode());
        iDRCard.addElement("DeletingTypeName").setText(idrc.getDeletingTypeName());

        Element aIDS = iDRCard.addElement("AIDS");
        aIDS.addElement("AIDSCardID").setText(aids.getaIDSCardID());
        aIDS.addElement("ContactHistoryCode").setText(aids.getContactHistoryCode());
        aIDS.addElement("ContactHistoryName").setText(aids.getContactHistoryName());
        aIDS.addElement("InjectionTogetherNum").setText(aids.getInjectionTogetherNum().toString());
        aIDS.addElement("NonmaritalSexNum").setText(aids.getNonmaritalSexNum().toString());
        aIDS.addElement("HomosexualSexNum").setText(aids.getHomosexualSexNum().toString());
        aIDS.addElement("OtherContactHistory").setText(aids.getOtherContactHistory());
        aIDS.addElement("VenerealHistoryCode").setText(aids.getVenerealHistoryCode().toString());
        aIDS.addElement("VenerealHistoryName").setText(aids.getVenerealHistoryName());
        aIDS.addElement("PossibleInfectionRouteCode").setText(aids.getPossibleInfectionRouteCode().toString());
        aIDS.addElement("PossibleInfectionRouteName").setText(aids.getPossibleInfectionRouteName());
        aIDS.addElement("OtherInfectionRoute").setText(aids.getOtherInfectionRoute());
        aIDS.addElement("SpecimenSourceCode").setText(aids.getSpecimenSourceCode().toString());
        aIDS.addElement("SpecimenSourceName").setText(aids.getSpecimenSourceName());
        aIDS.addElement("OtherSampleSource").setText(aids.getOtherSampleSource());
        aIDS.addElement("LaborTestConclusionCode").setText(aids.getLaborTestConclusionCode());
        aIDS.addElement("LaborTestConclusionName").setText(aids.getLaborTestConclusionName());
        aIDS.addElement("ConfirmedTestPositiveDate").setText(aids.getConfirmedTestPositiveDate().toString());
        aIDS.addElement("ConfirmedTestPositiveOrgName").setText(aids.getConfirmedTestPositiveOrgName());
        aIDS.addElement("AIDSDiagnosisDate").setText(aids.getaIDSDiagnosisDate().toString());
        aIDS.addElement("ChlamydialTrachomatisCode").setText(aids.getChlamydialTrachomatisCode().toString());
        aIDS.addElement("ChlamydialTrachomatisName").setText(aids.getChlamydialTrachomatisName());

        Element hFMD = iDRCard.addElement("HFMD");
        hFMD.addElement("HFMDCardID").setText(hfmd.gethFMDCardID());
        hFMD.addElement("IntensivePatientCode").setText(hfmd.getIntensivePatientCode().toString());
        hFMD.addElement("IntensivePatientName").setText(hfmd.getIntensivePatientName());
        hFMD.addElement("LaborTestResultCode").setText(hfmd.getLaborTestResultCode().toString());
        hFMD.addElement("LaborTestResultName").setText(hfmd.getLaborTestResultName());

        Element aFP = iDRCard   .addElement("AFP");
        aFP.addElement("AFPCardID").setText(afp.getaFPCardID());
        aFP.addElement("PatientResidenceTypeCode").setText(afp.getPatientResidenceTypeCode().toString());
        aFP.addElement("PatientResidenceTypeName").setText(afp.getPatientResidenceTypeName());
        aFP.addElement("PalsyDate").setText(afp.getPalsyDate().toString());
        aFP.addElement("TreatmentlandDate").setText(afp.getTreatmentlandDate().toString());
        aFP.addElement("TreatmentlandTypeCode").setText(afp.getTreatmentlandTypeCode().toString());
        aFP.addElement("TreatmentlandTypeName").setText(afp.getTreatmentlandTypeName());
        aFP.addElement("TreatmentlandZoneCode").setText(afp.getTreatmentlandZoneCode().toString());
        aFP.addElement("TreatmentlandZoneName").setText(afp.getTreatmentlandZoneName());
        aFP.addElement("TreatmentlandLivingAddressDetails").setText(afp.gettLAD());
        aFP.addElement("PalsySymptom ").setText(afp.getPalsySymptom());

        Element nCDCard = eventBody.addElement("NCDCard");
        nCDCard.addElement("LastXycdzss ").setText(ncdc.getLastXycdzss().toString());
        nCDCard.addElement("LastXycdzsz ").setText(ncdc.getLastXycdzsz().toString());
        nCDCard.addElement("LastKfxtcdz ").setText(ncdc.getLastKfxtcdz().toString());
        nCDCard.addElement("LastChxtcdz ").setText(ncdc.getLastChxtcdz().toString());
        nCDCard.addElement("Bgv").setText(ncdc.getBgv().toString());
        nCDCard.addElement("OutcomeCode ").setText(ncdc.getOutcomeCode().toString());
        nCDCard.addElement("Pathology ").setText(ncdc.getPathology());
        nCDCard.addElement("Patientnum ").setText(ncdc.getPatientnum());
        nCDCard.addElement("Pathologynum ").setText(ncdc.getPathologynum());
        nCDCard.addElement("FirstCase ").setText(ncdc.getFirstCase().toString());
        nCDCard.addElement("Icdo3Morphology ").setText(ncdc.getIcdo3Morphology().toString());
        nCDCard.addElement("Icdo3Degree ").setText(ncdc.getIcdo3Degree().toString());
        nCDCard.addElement("StagingUnknown ").setText(ncdc.getStagingUnknown().toString());
        nCDCard.addElement("TumorstageT ").setText(ncdc.getTumorstageT().toString());
        nCDCard.addElement("TumorstageN ").setText(ncdc.getTumorstageN().toString());
        nCDCard.addElement("TumorstageM ").setText(ncdc.getTumorstageM().toString());
        nCDCard.addElement("TumorstageIv ").setText(ncdc.getTumorstageIv().toString());
        nCDCard.addElement("Admissiontime ").setText(ncdc.getAdmissiontime().toString());
        nCDCard.addElement("Dischargetime ").setText(ncdc.getDischargetime().toString());
        nCDCard.addElement("TumorDiagnosis ").setText(ncdc.getTumorDiagnosis().toString());
        nCDCard.addElement("HeartbrainDiagnosis ").setText(ncdc.getHeartbrainDiagnosis());
        nCDCard.addElement("HighestDiagnosisUnit ").setText(ncdc.getHighestDiagnosisUnit().toString());
        nCDCard.addElement("Managerzonecode ").setText(ncdc.getManagerzonecode());
        nCDCard.addElement("Managerorgcode ").setText(ncdc.getManagerorgcode());
        nCDCard.addElement("DeathCause ").setText(ncdc.getDeathCause().toString());
        nCDCard.addElement("SpecifiDeathCause ").setText(ncdc.getSpecifiDeathCause());
        nCDCard.addElement("Delflag ").setText(ncdc.getDelflag().toString());
        nCDCard.addElement("UseridCreate ").setText(ncdc.getUseridCreate());

        Element cODRISCard = eventBody.addElement("CODRISCard");
        cODRISCard.addElement("CauseA").setText(codrisc.getCauseA());
        cODRISCard.addElement("ICDCodeA").setText(codrisc.getiCDCodeA());
        cODRISCard.addElement("IntervalTimeA").setText(codrisc.getIntervalTimeA().toString());
        cODRISCard.addElement("IntervalUnitCodeA").setText(codrisc.getIntervalUnitCodeA().toString());
        cODRISCard.addElement("CauseB").setText(codrisc.getCauseB());
        cODRISCard.addElement("ICDCodeB").setText(codrisc.getiCDCodeB());
        cODRISCard.addElement("IntervalTimeB").setText(codrisc.getIntervalTimeB().toString());
        cODRISCard.addElement("IntervalUnitCodeB").setText(codrisc.getIntervalUnitCodeB().toString());
        cODRISCard.addElement("CauseC").setText(codrisc.getCauseC());
        cODRISCard.addElement("ICDCodeC").setText(codrisc.getiCDCodeC());
        cODRISCard.addElement("IntervalTimeC").setText(codrisc.getIntervalTimeC().toString());
        cODRISCard.addElement("IntervalUnitCodeC").setText(codrisc.getIntervalUnitCodeC().toString());
        cODRISCard.addElement("CauseD").setText(codrisc.getCauseD());
        cODRISCard.addElement("ICDCodeD").setText(codrisc.getiCDCodeD());
        cODRISCard.addElement("IntervalTimeD").setText(codrisc.getIntervalTimeD().toString());
        cODRISCard.addElement("IntervalUnitCodeD").setText(codrisc.getIntervalUnitCodeD().toString());
        cODRISCard.addElement("CauseOther").setText(codrisc.getCauseOther());
        cODRISCard.addElement("ICDCodeOther").setText(codrisc.getiCDCodeOther());
        cODRISCard.addElement("BasicCause").setText(codrisc.getBasicCause());
        cODRISCard.addElement("BasicICDCode").setText(codrisc.getBasicICDCode());
        cODRISCard.addElement("DiagnosticUnitCode ").setText(codrisc.getDiagnosticUnitCode().toString());
        cODRISCard.addElement("DiagnosticBasisCode ").setText(codrisc.getDiagnosticBasisCode().toString());
        cODRISCard.addElement("DoctorName ").setText(codrisc.getDoctorName());
        cODRISCard.addElement("PoliceName ").setText(codrisc.getPoliceName());
        cODRISCard.addElement("FillCardDate ").setText(codrisc.getFillCardDate().toString());
        cODRISCard.addElement("Symptoms ").setText(codrisc.getSymptoms());
        cODRISCard.addElement("InvestigatedName ").setText(codrisc.getInvestigatedName());
        cODRISCard.addElement("Relationship ").setText(codrisc.getRelationship());
        cODRISCard.addElement("InvestigatedTel ").setText(codrisc.getInvestigatedTel());
        cODRISCard.addElement("InferCause ").setText(codrisc.getInferCause());
        cODRISCard.addElement("Investigator ").setText(codrisc.getInvestigator());
        cODRISCard.addElement("InvestigateDate ").setText(codrisc.getInvestigateDate().toString());
        cODRISCard.addElement("CardFillingTime ").setText(codrisc.getCardFillingTime().toString());
        cODRISCard.addElement("EntryPeopleName ").setText(codrisc.getEntryPeopleName());
        cODRISCard.addElement("ValidTime ").setText(codrisc.getValidTime().toString());
        cODRISCard.addElement("CorrectionState ").setText(codrisc.getCorrectionState().toString());
        cODRISCard.addElement("AuditPeopleName ").setText(codrisc.getAuditPeopleName());
        cODRISCard.addElement("FirstValidTime ").setText(codrisc.getFirstValidTime().toString());
        cODRISCard.addElement("HospitalNo ").setText(codrisc.getHospitalNo().toString());
        cODRISCard.addElement("AuditState ").setText(codrisc.getAuditState().toString());
        cODRISCard.addElement("WomanTypeCode ").setText(codrisc.getWomanTypeCode().toString());

        return document;
    }
}