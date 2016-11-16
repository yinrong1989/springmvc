package com.yinrong.mongo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.mongodb.*;
import com.yinrong.common.util.BeanUtil;
import com.yinrong.mongo.dbModel.ItemInfo;
import com.yinrong.mongo.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service(value="itemInfoService")
public class ItemInfoServiceImpl implements ItemInfoService {

    @Autowired
    private MongoTemplate mongoTemplate;
    private final static String COLLECTION_NAME = "item_info";

    @SuppressWarnings("static-access")
    public List<ItemInfo> getItemInfo(JSONObject json) throws Exception{
        List<ItemInfo> list = new ArrayList<ItemInfo>();
        // 判断查询的json中传递过来的参数
        DBObject query = new BasicDBObject();
        // item_id,item_name,price,desc
        if (json.containsKey("item_id")){
            query.put("item_id", json.getString("item_id"));
        }else if(json.containsKey("item_name")){
            query.put("item_name", json.getString("item_name"));
        }

        DBCursor results = mongoTemplate.getCollection("item_info").find(query);
        if(null != results){
            Iterator<DBObject> iterator = results.iterator();
            while(iterator.hasNext()){
                //Document doc = (Document) iterator.next();
                BasicDBObject obj = (BasicDBObject) iterator.next();
                //System.out.println(obj.toJson());
                // json 字符串
                String objStr = obj.toString();
                //JSONObject itemInfoJson = new JSONObject().fromObject(objStr);
                //itemInfoJson.put("_id", itemInfoJson.getJSONObject("_id").getString("$oid"));
                ItemInfo itemInfo = new ItemInfo();
                itemInfo = BeanUtil.dbObject2Bean(obj, itemInfo);
                list.add(itemInfo);
            }
        }


        return list;
    }

    public int save(ItemInfo itemInfo) throws Exception {
        itemInfo.setDesc("1111");
        itemInfo.setItemId("i1234567890123");
        itemInfo.setItemName("item_name_xx");
        itemInfo.setPrice(110.0);

        DBCollection collection = this.mongoTemplate.getCollection("item_info");
        int result = 0;
        DBObject iteminfoObj = BeanUtil.bean2DBObject(itemInfo);

        //iteminfoObj.removeField("serialVersionUID");
        //result = collection.insert(iteminfoObj).getN();
        WriteResult writeResult = collection.save(iteminfoObj);
        result = writeResult.getN();
        return result;
    }

    public void update(ItemInfo intemInfo) throws Exception {

        DBCollection collection = this.mongoTemplate.getCollection(COLLECTION_NAME);
        ItemInfo queryItemInfo = new ItemInfo();
        queryItemInfo.setItemId(intemInfo.getItemId());
        DBObject itemInfoObj = BeanUtil.bean2DBObject(intemInfo);
        DBObject query =  BeanUtil.bean2DBObject(queryItemInfo);
        collection.update(query, itemInfoObj);
    }
}