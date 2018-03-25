package com.yao.ws.util;

import org.apache.cxf.common.util.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shanyao on 2018/3/25.
 */
public class CxfInvokeUtil {
    private static Logger logger = LoggerFactory.getLogger(CxfInvokeUtil.class);

    public static Object invoke(String wdslURL, String mehod, Object... params) throws Exception {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactory.createClient(wdslURL);
        Object[] objects = null;
        if (StringUtils.isEmpty(wdslURL)) {
            logger.error("url确实");
            return objects;
        }

        if (StringUtils.isEmpty(mehod)) {
            logger.error("method缺失");
            return objects;
        }
        objects = client.invoke(mehod, params, "");
        return objects;
    }
}
