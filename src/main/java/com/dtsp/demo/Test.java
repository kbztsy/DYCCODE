package com.vastsum.demo;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test {

    public static void main(String[] args) {
//        FileWriter out = null;
//        try {
//            out = new FileWriter( "src/foo.xml" );  //写入文件
//            createDocument().write( out );//生成xml
//
//            String str=createDocument().asXML();//转为字符串
//            System.out.println("字符串"+str);//输出xml字符串
        /**
         * json语句字符串
         */
        String s="{\n" +
                    "  \"DataExchange\": {\n" +
                    "      \"eventHead\": {\n" +
                    "      \"eventId\": \"310117003-20140505101010-026\",\n" +
                    "      \"entityName\": \"IDR_NCD_CODRIS\",\n" +
                    "      \"operateType\": \"Add\"\n" +
                    "    },\n" +
                    "    \"eventBody\": {\n" +
                    "      \"BaseInfo\": {\n" +
                    "        \"PatientName\": \"!\",\n" +
                    "        \"BirthDate\": \"!\",\n" +
                    "        \"GenderCode\": \"!\",\n" +
                    "        \"GenderName\": \"!\",\n" +
                    "        \"NationCode\": \"!\",\n" +
                    "        \"NationName\": \"!\",\n" +
                    "        \"EmployerOrgName\": \"！\",\n" +
                    "        \"IDR_OccupationCode\": \"!\",\n" +
                    "        \"NCD_OccupationCode\": \"!\",\n" +
                    "        \"CODRIS_OccupationCode\": \"!\",\n" +
                    "        \"OccupationName\": \"!\",\n" +
                    "        \"OtherOccupationName\": \"!\",\n" +
                    "        \"GuardianName\": \"!\",\n" +
                    "        \"TeleCom\": \"!\",\n" +
                    "        \"OrgCountyCode\": \"!\",\n" +
                    "        \"OrgCountyName\": \"!\",\n" +
                    "        \"OrgCode\": \"!\",\n" +
                    "        \"OrgName\": \"!\",\n" +
                    "        \"LivingAddressAttributionCode\": \"!\",\n" +
                    "        \"LivingAddressAttributionName\": \"!\",\n" +
                    "        \"LivingAddressCode\": \"!\",\n" +
                    "        \"LivingAddressName\": \"!\",\n" +
                    "        \"LivingAddressDetails\": \"!\",\n" +
                    "        \"IDCardType\": \"1\",\n" +
                    "        \"IDCardCode\": \"411221196112140212\",\n" +
                    "        \"DiagnosisDate\": \"!\",\n" +
                    "        \"DiseaseCode\": \"!\",\n" +
                    "        \"DiseaseName\": \"!\",\n" +
                    "        \"DiseaseCause\": \"!\",\n" +
                    "        \"CardNotes\": \"!\",\n" +
                    "        \"DeathDate\": \"!\",\n" +
                    "        \"FillingDoctorName\": \"!\",\n" +
                    "        \"CardFillingTime\": \"!\",\n" +
                    "        \"DomicileAddressCode\": \"!\",\n" +
                    "        \"DomicileAddressName\": \"!\",\n" +
                    "        \"DomicileAdrressDetails\": \"!\",\n" +
                    "        \"DomicileAddressAttributionCode\": \"!\",\n" +
                    "        \"DomicileAddressAttributionName\": \"!\",\n" +
                    "        \"Country\": \"中国大陆\",\n" +
                    "        \"MaritalStatusCode\": \"!\",\n" +
                    "        \"MaritalStatusName\": \"!\",\n" +
                    "        \"EducationLevelCode\": \"!\",\n" +
                    "        \"EducationLevelName\": \"!\",\n" +
                    "        \"LifeTimeAddr\": \"浙江省宁波市海曙区西门街道\",\n" +
                    "        \"LifeTimeZoneCode\": \"33020301\",\n" +
                    "        \"LifeTimeVillageCode\": \"!\",\n" +
                    "        \"LifeTimeAddrTypeCode\": \"1\",\n" +
                    "        \"RegisterVillageCode\": \"!\",\n" +
                    "        \"DeathPlaceCode\": \"!\",\n" +
                    "        \"DiagnosisTypeCode\": \"!\",\n" +
                    "        \"DiagnosisTypeName\": \"!\",\n" +
                    "        \"Hospitalnum\": \"!\",\n" +
                    "        \"CardID\": \"!\",\n" +
                    "        \"CreatingTime\": \"!\"\n" +
                    "      },\n" +
                    "      \"IDRCard\": {\n" +
                    "        \"CaseClassificationCode\": \"!\",\n" +
                    "        \"CaseClassificationName\": \"!\",\n" +
                    "        \"OtherDiseaseName\": \"!\",\n" +
                    "        \"CloseContactsSymptomCode\": \"!\",\n" +
                    "        \"CloseContactsSymptomName\": \"!\",\n" +
                    "        \"Customer\": \"!\",\n" +
                    "        \"DeletingReasonDetails\": \"!\",\n" +
                    "        \"DeletingTypeCode\": \"!\",\n" +
                    "        \"DeletingTypeName\": \"!\",\n" +
                    "        \"AIDS\": {\n" +
                    "          \"AIDSCardID\": \"!\",\n" +
                    "          \"ContactHistoryCode\": \"!\",\n" +
                    "          \"ContactHistoryName\": \"!\",\n" +
                    "          \"InjectionTogetherNum\": \"!\",\n" +
                    "          \"NonmaritalSexNum\": \"!\",\n" +
                    "          \"HomosexualSexNum\": \"!\",\n" +
                    "          \"OtherContactHistory\": \"!\",\n" +
                    "          \"VenerealHistoryCode\": \"2\",\n" +
                    "          \"VenerealHistoryName\": \"!\",\n" +
                    "          \"PossibleInfectionRouteCode\": \"2\",\n" +
                    "          \"PossibleInfectionRouteName\": \"!\",\n" +
                    "          \"OtherInfectionRoute\": \"!\",\n" +
                    "          \"SpecimenSourceCode\": \"!\",\n" +
                    "          \"SpecimenSourceName\": \"!\",\n" +
                    "          \"OtherSampleSource\": \"!\",\n" +
                    "          \"LaborTestConclusionCode\": \"!\",\n" +
                    "          \"LaborTestConclusionName\": \"!\",\n" +
                    "          \"ConfirmedTestPositiveDate\": \"!\",\n" +
                    "          \"ConfirmedTestPositiveOrgName\": \"!\",\n" +
                    "          \"AIDSDiagnosisDate\": \"!\",\n" +
                    "          \"ChlamydialTrachomatisCode\": \"!\",\n" +
                    "          \"ChlamydialTrachomatisName\": \"!\"\n" +
                    "        },\n" +
                    "        \"HFMD\": {\n" +
                    "          \"HFMDCardID\": \"!\",\n" +
                    "          \"IntensivePatientCode\": \"!\",\n" +
                    "          \"IntensivePatientName\": \"!\",\n" +
                    "          \"LaborTestResultCode\": \"!\",\n" +
                    "          \"LaborTestResultName\": \"!\"\n" +
                    "        },\n" +
                    "        \"AFP\": {\n" +
                    "          \"AFPCardID\": \"!\",\n" +
                    "          \"PatientResidenceTypeCode\": \"!\",\n" +
                    "          \"PatientResidenceTypeCodeName\": \"!\",\n" +
                    "          \"PalsyDate\": \"!\",\n" +
                    "          \"TreatmentlandDate\": \"!\",\n" +
                    "          \"TreatmentlandTypeCode\": \"!\",\n" +
                    "          \"TreatmentlandTypeName\": \"!\",\n" +
                    "          \"TreatmentlandZoneCode\": \"!\",\n" +
                    "          \"TreatmentlandZoneName\": \"!\",\n" +
                    "          \"TreatmentlandLivingAddressDetails\": \"!\",\n" +
                    "          \"PalsySymptom\": \"!\"\n" +
                    "        }\n" +
                    "      },\n" +
                    "      \"NCDCard\": {\n" +
                    "        \"LastXycdzss\": \"!\",\n" +
                    "        \"LastXycdzsz\": \"!\",\n" +
                    "        \"LastKfxtcdz\": \"!\",\n" +
                    "        \"LastChxtcdz\": \"!\",\n" +
                    "        \"Bgv\": \"!\",\n" +
                    "        \"OutcomeCode\": \"!\",\n" +
                    "        \"Pathology\": \"!\",\n" +
                    "        \"Patientnum\": \"!\",\n" +
                    "        \"Pathologynum\": \"!\",\n" +
                    "        \"FirstCase\": \"!\",\n" +
                    "        \"Icdo3Morphology\": \"!\",\n" +
                    "        \"Icdo3Degree\": \"!\",\n" +
                    "        \"StagingUnknown\": \"!\",\n" +
                    "        \"TumorstageT\": \"!\",\n" +
                    "        \"TumorstageN\": \"!\",\n" +
                    "        \"TumorstageM\": \"!\",\n" +
                    "        \"TumorstageIv\": \"!\",\n" +
                    "        \"Admissiontime\": \"!\",\n" +
                    "        \"Dischargetime\": \"!\",\n" +
                    "        \"TumorDiagnosis\": \"!\",\n" +
                    "        \"HeartbrainDiagnosis\": \"!\",\n" +
                    "        \"HighestDiagnosisUnit\": \"!\",\n" +
                    "        \"Managerzonecode\": \"33020300\",\n" +
                    "        \"Managerorgcode\": \"330203002\",\n" +
                    "        \"DeathCause\": \"!\",\n" +
                    "        \"SpecifiDeathCause\": \"!\",\n" +
                    "        \"Delflag\": \"1\",\n" +
                    "        \"UseridCreate\": \"!\"\n" +
                    "      },\n" +
                    "      \"CODRISCard\": {\n" +
                    "        \"CauseA\": \"C00\",\n" +
                    "        \"ICDCodeA\": \"C00\",\n" +
                    "        \"IntervalTimeA\": \"!\",\n" +
                    "        \"IntervalUnitCodeA\": \"!\",\n" +
                    "        \"CauseB\": \"!\",\n" +
                    "        \"ICDCodeB\": \"!\",\n" +
                    "        \"IntervalTimeB\": \"!\",\n" +
                    "        \"IntervalUnitCodeB\": \"!\",\n" +
                    "        \"CauseC\": \"!\",\n" +
                    "        \"ICDCodeC\": \"!\",\n" +
                    "        \"IntervalTimeC\": \"!\",\n" +
                    "        \"IntervalUnitCodeC\": \"!\",\n" +
                    "        \"CauseD\": \"!\",\n" +
                    "        \"ICDCodeD\": \"!\",\n" +
                    "        \"IntervalTimeD\": \"!\",\n" +
                    "        \"IntervalUnitCodeD\": \"!\",\n" +
                    "        \"CauseOther\": \"!\",\n" +
                    "        \"ICDCodeOther\": \"!\",\n" +
                    "        \"BasicCause\": \"唇恶性肿瘤\",\n" +
                    "        \"BasicICDCode\": \"C00\",\n" +
                    "        \"DiagnosticUnitCode\": \"2\",\n" +
                    "        \"DiagnosticBasisCode\": \"2\",\n" +
                    "        \"DoctorName\": \"daf\",\n" +
                    "        \"PoliceName\": \"jingguan\",\n" +
                    "        \"FillCardDate\": \"2013-06-24T00:00:00\",\n" +
                    "        \"Symptoms\": \"!\",\n" +
                    "        \"InvestigatedName\": \"!\",\n" +
                    "        \"Relationship\": \"!\",\n" +
                    "        \"InvestigatedTel\": \"!\",\n" +
                    "        \"InferCause\": \"!\",\n" +
                    "        \"Investigator\": \"!\",\n" +
                    "        \"InvestigateDate\": \"!\",\n" +
                    "        \"CardFillingTime\": \"2013-06-24T10:01:17\",\n" +
                    "        \"EntryPeopleName\": \"海曙区直报测试\",\n" +
                    "        \"ValidTime\": \"!\",\n" +
                    "        \"CorrectionState\": \"0\",\n" +
                    "        \"AuditPeopleName\": \"海曙区测试\",\n" +
                    "        \"FirstValidTime\": \"!\",\n" +
                    "        \"HospitalNo\": \"7100\",\n" +
                    "        \"AuditState\": \"3\",\n" +
                    "        \"WomanTypeCode\": \"!\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";

        JSONObject jsonObject = JSONObject.fromObject(s);//转为json格式
        XMLSerializer xmls=new XMLSerializer();
        xmls.setRootName("root");//设置root名称
        xmls.setTypeHintsEnabled(false);//不显示类型
        String str=xmls.write(jsonObject);
        System.out.println(str);//输出xml格式字符串

        byte[] data = new byte[0];
        try {
            data = str.getBytes("utf-8");//转为data数组格式
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }

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
    }
    }

//利用DOM4J写出XML文档
//    public static Document createDocument() {
//
//        Document document = DocumentHelper.createDocument();
//
//        Element root = document.addElement( "DataExchange" );
//
//        Element eventHead = root.addElement("eventHead");
//        eventHead.addElement( "eventId" ).setText("310117003-20140505101010-026");
//        eventHead.addElement( "entityName" ).setText("IDR_NCD_CODRIS");
//        eventHead.addElement( "operateType" ).setText("Add");
//
//        Element eventBody = root.addElement("eventBody");
//
//        Element baseInfo = eventBody.addElement("BaseInfo");
//        baseInfo.addElement("PatientName").setText("!");
//        baseInfo.addElement("BirthDate").setText("!");
//        baseInfo.addElement("GenderCode").setText("!");
//        baseInfo.addElement("GenderName").setText("!");
//        baseInfo.addElement("NationCode").setText("!");
//        baseInfo.addElement("NationName").setText("!");
//        baseInfo.addElement("EmployerOrgName").setText("！");
//        baseInfo.addElement("IDR_OccupationCode").setText("!");
//        baseInfo.addElement("NCD_OccupationCode").setText("!");
//        baseInfo.addElement("CODRIS_OccupationCode").setText("!");
//        baseInfo.addElement("OccupationName").setText("!");
//        baseInfo.addElement("OtherOccupationName").setText("!");
//        baseInfo.addElement("GuardianName").setText("!");
//        baseInfo.addElement("TeleCom").setText("!");
//        baseInfo.addElement("OrgCountyCode").setText("!");
//        baseInfo.addElement("OrgCountyName").setText("!");
//        baseInfo.addElement("OrgCode").setText("!");
//        baseInfo.addElement("OrgName").setText("!");
//        baseInfo.addElement("LivingAddressAttributionCode").setText("!");
//        baseInfo.addElement("LivingAddressAttributionName").setText("!");
//        baseInfo.addElement("LivingAddressCode").setText("!");
//        baseInfo.addElement("LivingAddressName").setText("!");
//        baseInfo.addElement("LivingAddressDetails").setText("!");
//        baseInfo.addElement("IDCardType").setText("1");
//        baseInfo.addElement("IDCardCode").setText("411221196112140212");
//        baseInfo.addElement("DiagnosisDate").setText("!");
//        baseInfo.addElement("DiseaseCode").setText("!");
//        baseInfo.addElement("DiseaseName").setText("!");
//        baseInfo.addElement("DiseaseCause").setText("!");
//        baseInfo.addElement("CardNotes").setText("!");
//        baseInfo.addElement("DeathDate").setText("!");
//        baseInfo.addElement("FillingDoctorName").setText("!");
//        baseInfo.addElement("CardFillingTime").setText("!");
//        baseInfo.addElement("DomicileAddressCode").setText("!");
//        baseInfo.addElement("DomicileAddressName").setText("!");
//        baseInfo.addElement("DomicileAdrressDetails").setText("!");
//        baseInfo.addElement("DomicileAddressAttributionCode").setText("!");
//        baseInfo.addElement("DomicileAddressAttributionName").setText("!");
//        baseInfo.addElement("Country").setText("中国大陆");
//        baseInfo.addElement("MaritalStatusCode").setText("!");
//        baseInfo.addElement("MaritalStatusName").setText("!");
//        baseInfo.addElement("EducationLevelCode").setText("!");
//        baseInfo.addElement("EducationLevelName").setText("!");
//        baseInfo.addElement("LifeTimeAddr").setText("浙江省宁波市海曙区西门街道");
//        baseInfo.addElement("LifeTimeZoneCode").setText("33020301");
//        baseInfo.addElement("LifeTimeVillageCode").setText("!");
//        baseInfo.addElement("LifeTimeAddrTypeCode").setText("1");
//        baseInfo.addElement("RegisterVillageCode").setText("!");
//        baseInfo.addElement("DeathPlaceCode").setText("!");
//        baseInfo.addElement("DiagnosisTypeCode").setText("!");
//        baseInfo.addElement("DiagnosisTypeName").setText("!");
//        baseInfo.addElement("Hospitalnum").setText("!");
//        baseInfo.addElement("CardID").setText("!");
//        baseInfo.addElement("CreatingTime").setText("!");
//
//        Element iDRCard = eventBody.addElement("IDRCard");
//        iDRCard.addElement("CaseClassificationCode").setText("!");
//        iDRCard.addElement("CaseClassificationName").setText("!");
//        iDRCard.addElement("OtherDiseaseName").setText("!");
//        iDRCard.addElement("OnsetDate").setText("");
//        iDRCard.addElement("CloseContactsSymptomCode").setText("!");
//        iDRCard.addElement("CloseContactsSymptomName").setText("!");
//        iDRCard.addElement("Customer").setText("!");
//        iDRCard.addElement("DeletingReasonDetails").setText("!");
//        iDRCard.addElement("DeletingTypeCode").setText("!");
//        iDRCard.addElement("DeletingTypeName").setText("!");
//
//        Element aIDS = iDRCard.addElement("AIDS");
//        aIDS.addElement("AIDSCardID").setText("!");
//        aIDS.addElement("ContactHistoryCode").setText("!");
//        aIDS.addElement("ContactHistoryName").setText("!");
//        aIDS.addElement("InjectionTogetherNum").setText("!");
//        aIDS.addElement("NonmaritalSexNum").setText("!");
//        aIDS.addElement("HomosexualSexNum").setText("!");
//        aIDS.addElement("OtherContactHistory").setText("!");
//        aIDS.addElement("VenerealHistoryCode").setText("2");
//        aIDS.addElement("VenerealHistoryName").setText("!");
//        aIDS.addElement("PossibleInfectionRouteCode").setText("2");
//        aIDS.addElement("PossibleInfectionRouteName").setText("!");
//        aIDS.addElement("OtherInfectionRoute").setText("!");
//        aIDS.addElement("SpecimenSourceCode").setText("!");
//        aIDS.addElement("SpecimenSourceName").setText("!");
//        aIDS.addElement("OtherSampleSource").setText("!");
//        aIDS.addElement("LaborTestConclusionCode").setText("!");
//        aIDS.addElement("LaborTestConclusionName").setText("!");
//        aIDS.addElement("ConfirmedTestPositiveDate").setText("!");
//        aIDS.addElement("ConfirmedTestPositiveOrgName").setText("!");
//        aIDS.addElement("AIDSDiagnosisDate").setText("!");
//        aIDS.addElement("ChlamydialTrachomatisCode").setText("!");
//        aIDS.addElement("ChlamydialTrachomatisName").setText("!");
//
//        Element hFMD = iDRCard.addElement("HFMD");
//        hFMD.addElement("HFMDCardID").setText("!");
//        hFMD.addElement("IntensivePatientCode").setText("!");
//        hFMD.addElement("IntensivePatientName").setText("!");
//        hFMD.addElement("LaborTestResultCode").setText("!");
//        hFMD.addElement("LaborTestResultName").setText("!");
//
//        Element aFP = iDRCard   .addElement("AFP");
//        aFP.addElement("AFPCardID").setText("!");
//        aFP.addElement("PatientResidenceTypeCode").setText("!");
//        aFP.addElement("PatientResidenceTypeCodeName").setText("!");
//        aFP.addElement("PalsyDate").setText("!");
//        aFP.addElement("TreatmentlandDate").setText("!");
//        aFP.addElement("TreatmentlandTypeCode").setText("!");
//        aFP.addElement("TreatmentlandTypeName").setText("!");
//        aFP.addElement("TreatmentlandZoneCode").setText("!");
//        aFP.addElement("TreatmentlandZoneName").setText("!");
//        aFP.addElement("TreatmentlandLivingAddressDetails").setText("!");
//        aFP.addElement("PalsySymptom ").setText("!");
//
//        Element nCDCard = eventBody.addElement("NCDCard");
//        nCDCard.addElement("LastXycdzss ").setText("!");
//        nCDCard.addElement("LastXycdzsz ").setText("!");
//        nCDCard.addElement("LastKfxtcdz ").setText("!");
//        nCDCard.addElement("LastChxtcdz ").setText("!");
//        nCDCard.addElement("Bgv").setText("!");
//        nCDCard.addElement("OutcomeCode ").setText("!");
//        nCDCard.addElement("Pathology ").setText("!");
//        nCDCard.addElement("Patientnum ").setText("!");
//        nCDCard.addElement("Pathologynum ").setText("!");
//        nCDCard.addElement("FirstCase ").setText("!");
//        nCDCard.addElement("Icdo3Morphology ").setText("!");
//        nCDCard.addElement("Icdo3Degree ").setText("!");
//        nCDCard.addElement("StagingUnknown ").setText("!");
//        nCDCard.addElement("TumorstageT ").setText("!");
//        nCDCard.addElement("TumorstageN ").setText("!");
//        nCDCard.addElement("TumorstageM ").setText("!");
//        nCDCard.addElement("TumorstageIv ").setText("!");
//        nCDCard.addElement("Admissiontime ").setText("!");
//        nCDCard.addElement("Dischargetime ").setText("!");
//        nCDCard.addElement("TumorDiagnosis ").setText("!");
//        nCDCard.addElement("HeartbrainDiagnosis ").setText("!");
//        nCDCard.addElement("HighestDiagnosisUnit ").setText("!");
//        nCDCard.addElement("Managerzonecode ").setText("33020300");
//        nCDCard.addElement("Managerorgcode ").setText("330203002");
//        nCDCard.addElement("DeathCause ").setText("!");
//        nCDCard.addElement("SpecifiDeathCause ").setText("!");
//        nCDCard.addElement("Delflag ").setText("1");
//        nCDCard.addElement("UseridCreate ").setText("!");
//
//        Element cODRISCard = eventBody.addElement("CODRISCard");
//        cODRISCard.addElement("CauseA").setText("C00");
//        cODRISCard.addElement("ICDCodeA").setText("C00");
//        cODRISCard.addElement("IntervalTimeA").setText("!");
//        cODRISCard.addElement("IntervalUnitCodeA").setText("!");
//        cODRISCard.addElement("CauseB").setText("!");
//        cODRISCard.addElement("ICDCodeB").setText("!");
//        cODRISCard.addElement("IntervalTimeB").setText("!");
//        cODRISCard.addElement("IntervalUnitCodeB").setText("!");
//        cODRISCard.addElement("CauseC").setText("!");
//        cODRISCard.addElement("ICDCodeC").setText("!");
//        cODRISCard.addElement("IntervalTimeC").setText("!");
//        cODRISCard.addElement("IntervalUnitCodeC").setText("!");
//        cODRISCard.addElement("CauseD").setText("!");
//        cODRISCard.addElement("ICDCodeD").setText("!");
//        cODRISCard.addElement("IntervalTimeD").setText("!");
//        cODRISCard.addElement("IntervalUnitCodeD").setText("!");
//        cODRISCard.addElement("CauseOther").setText("!");
//        cODRISCard.addElement("ICDCodeOther").setText("!");
//        cODRISCard.addElement("BasicCause").setText("唇恶性肿瘤");
//        cODRISCard.addElement("BasicICDCode").setText("C00");
//        cODRISCard.addElement("DiagnosticUnitCode ").setText("2");
//        cODRISCard.addElement("DiagnosticBasisCode ").setText("2");
//        cODRISCard.addElement("DoctorName ").setText("daf");
//        cODRISCard.addElement("PoliceName ").setText("jingguan");
//        cODRISCard.addElement("FillCardDate ").setText("2013-06-24T00:00:00");
//        cODRISCard.addElement("Symptoms ").setText("!");
//        cODRISCard.addElement("InvestigatedName ").setText("!");
//        cODRISCard.addElement("Relationship ").setText("!");
//        cODRISCard.addElement("InvestigatedTel ").setText("!");
//        cODRISCard.addElement("InferCause ").setText("!");
//        cODRISCard.addElement("Investigator ").setText("!");
//        cODRISCard.addElement("InvestigateDate ").setText("!");
//        cODRISCard.addElement("CardFillingTime ").setText("2013-06-24T10:01:17");
//        cODRISCard.addElement("EntryPeopleName ").setText("海曙区直报测试");
//        cODRISCard.addElement("ValidTime ").setText("!");
//        cODRISCard.addElement("CorrectionState ").setText("0");
//        cODRISCard.addElement("AuditPeopleName ").setText("海曙区测试");
//        cODRISCard.addElement("FirstValidTime ").setText("!");
//        cODRISCard.addElement("HospitalNo ").setText("7100");
//        cODRISCard.addElement("AuditState ").setText("3");
//        cODRISCard.addElement("WomanTypeCode ").setText("!");
//
//        return document;
//    }
//}