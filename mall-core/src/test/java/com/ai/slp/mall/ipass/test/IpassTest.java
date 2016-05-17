package com.ai.slp.mall.ipass.test;

import com.ai.opt.sdk.components.dss.DSSClientFactory;
import com.ai.paas.ipaas.dss.base.interfaces.IDSSClient;

/**
 * Created by jackieliu on 16/5/16.
 */
public class IpassTest {
    public void saveAndRead() throws Exception {
        IDSSClient client= DSSClientFactory.getDSSClient("");
        String ss = "002test\t123456\t6666\t200902190002\t";
        // 客户资料上传的场景命名空间
        // 根据命名空间，从配置中心获取对应的DSS服务ID
        String fileid = "";
        for (int k = 0; k < 10; k++) {
            fileid = client.save((ss+"---"+k).getBytes(), "test");
            System.out.println(fileid);
            byte[] filebytes = client.read(fileid);
            System.out.println(new String(filebytes));
        }
    }
}
