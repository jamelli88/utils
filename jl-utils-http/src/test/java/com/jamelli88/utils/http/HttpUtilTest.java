package com.jamelli88.utils.http;


import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class HttpUtilTest {

    public static void main(String[] args) {
        testDoGet();
//        testDoDelete();
//        testDoPut();
//        testDoPost();
    }

    public static void testDoPut() {
        String url = "http://127.0.0.1:9200/_snapshot/es_backup/kafkalog-ea-xl-sysmanage-2019-11-18";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("indices", "kafkalog-ea-xl-sysmanage-2019-11-18");
        Integer connectionTimeout = 60000;//毫秒 链接建立时间
        Integer connectionRequestTimeout = 600000;//毫秒 请求时间
        Integer socketTimeout = 600000;//毫秒 链接建立时间
        String result = HttpUtil.doPut(url, JSONObject.toJSONString(paramMap), connectionTimeout, connectionRequestTimeout, socketTimeout);
        System.out.println(result);
    }

    public static void testDoDelete() {
        String url = "http://127.0.0.1:9200/_snapshot/es_backup/kafkalog-ea-xl-ea-openapi-2019-11-10";
        Integer connectionTimeout = 60000;//毫秒 链接建立时间
        Integer connectionRequestTimeout = 600000;//毫秒 请求时间
        Integer socketTimeout = 600000;//毫秒 链接建立时间
        String result = HttpUtil.doDelete(url, connectionTimeout, connectionRequestTimeout, socketTimeout);
        System.out.println(result);
    }

    public static void testDoPost() {

    }

    public static void testDoGet() {
        String url = "http://127.0.0.1:9200/_snapshot/es_backup/_all";
        Integer connectionTimeout = 60000;//毫秒 链接建立时间
        Integer connectionRequestTimeout = 600000;//毫秒 请求时间
        Integer socketTimeout = 600000;//毫秒 链接建立时间
        String result = HttpUtil.doGet(url, connectionTimeout, connectionRequestTimeout, socketTimeout);
        System.out.println(result);
    }

    public void testExecute() {

    }
}