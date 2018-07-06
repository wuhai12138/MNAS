import com.summ.mnas.model.others.WeiXinSign;
import com.summ.mnas.utils.JsonUtil;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by jygj_7500 on 17/11/17.
 */
public class DocumentTest {

    public static void main(String[] args) throws ParseException, IOException {

        String s="<xml><return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "<return_msg><![CDATA[OK]]></return_msg>\n" +
                "<appid><![CDATA[wx358c6d6d5adb0f0f]]></appid>\n" +
                "<mch_id><![CDATA[1488511392]]></mch_id>\n" +
                "<nonce_str><![CDATA[CJi996jVqLR8ThHt]]></nonce_str>\n" +
                "<sign><![CDATA[703B145A8C802DDA13B071C51E3698F0]]></sign>\n" +
                "<result_code><![CDATA[SUCCESS]]></result_code>\n" +
                "<prepay_id><![CDATA[wx171913522580972c9b1f5e5a4140360165]]></prepay_id>\n" +
                "<trade_type><![CDATA[JSAPI]]></trade_type>\n" +
                "</xml>";
        WeiXinSign weiXinSign = (WeiXinSign) JsonUtil.getObjectFromXML(s, WeiXinSign.class);
        System.out.println(weiXinSign.toString());

    }

}
