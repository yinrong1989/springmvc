import com.yinrong.common.util.GlobalResource;
import com.yinrong.common.util.XmlResource;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by yinrong on 2016/11/16.
 */
public class GlobalXmlResourceFileTest {
    @Ignore
    @Test
    public void setGlobalXmlResourceFileTest(){
        GlobalResource globalResource=  GlobalResource.getInstance();
        globalResource.setXmlResourceFile("D:/yinrong/svn/env_conf/func110/basis/mgs-test/mgs-test-resource.xml");
    }
}
