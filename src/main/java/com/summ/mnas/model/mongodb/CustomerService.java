package com.summ.mnas.model.mongodb;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "customer_service")
public class CustomerService implements Serializable {

    @Id
    private ObjectId _id;
    private Integer serviceId;
    private String serviceDetail;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }
}
