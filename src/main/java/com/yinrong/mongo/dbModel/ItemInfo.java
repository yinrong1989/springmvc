package com.yinrong.mongo.dbModel;

import org.ietf.jgss.Oid;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection="item_info")
public class ItemInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Oid _id;
    @Field(value = "item_id")
    private String itemId;
    @Field(value = "item_name")
    private String itemName;
    @Field(value = "price")
    private Double price;
    @Field(value = "desc")
    private String desc;

    public Oid get_id() {
        return _id;
    }

    public void set_id(Oid _id) {
        this._id = _id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ItemInfo [_id=" + _id + ", itemId=" + itemId + ", itemName="
                + itemName + ", price=" + price + ", desc=" + desc + "]";
    }
}