import com.alibaba.fastjson.JSONObject;
import com.yinrong.mongo.dbModel.ItemInfo;
import com.yinrong.mongo.service.ItemInfoService;
import com.yinrong.redis.RedisClientTemplate;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinrong on 2016/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/applicationContext.xml")
public class ItemInfoServiceTest {

    @Autowired
    private ItemInfoService itemInfoService;

    @Ignore
    @Test
    public void testSave(){
        ItemInfo itemInfo = new ItemInfo();
        try {
            this.itemInfoService.save(itemInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Ignore
    @Test
    public void testGetItemInfo(){
        List<ItemInfo> list = new ArrayList<ItemInfo>();
        JSONObject json = new JSONObject();
        //json.put("item_id", "47a09d51-bf24-442b-9076-4701dcb614b9");
        json.put("item_id", "i1234567890123");
        try {
            list = this.itemInfoService.getItemInfo(json);
            if(null != list && list.size() > 0){
                //System.out.println(list.get(0).toString());
                for (ItemInfo itemInfo : list) {
                    //itemInfo.setItemName("======");
                    this.itemInfoService.getItemInfo(json);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Ignore
    @Test
    public void testUpdate(){
        JSONObject json = new JSONObject();
        //json.put("item_id", "47a09d51-bf24-442b-9076-4701dcb614b9");
        json.put("item_id", "i1234567890123");
        List<ItemInfo> list = new ArrayList<ItemInfo>();
        try {
            list = this.itemInfoService.getItemInfo(json);

            if(null != list && list.size() > 0){
                for (ItemInfo itemInfo : list) {

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}