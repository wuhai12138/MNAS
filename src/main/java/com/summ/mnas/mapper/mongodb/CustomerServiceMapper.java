package com.summ.mnas.mapper.mongodb;


import com.mongodb.client.result.UpdateResult;
import com.summ.mnas.model.mongodb.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceMapper {
    @Autowired
    private MongoTemplate mongoTemplate;

    public CustomerService findByServiceId(Integer serviceId) {
        Query query=new Query(Criteria.where("serviceId").is(serviceId));
        CustomerService customerService =  mongoTemplate.findOne(query , CustomerService.class);
        return customerService;
    }

    public UpdateResult updateByServiceId(CustomerService customerService) {
        Query query = new Query(Criteria.where("serviceId").is(customerService.getServiceId()));
        Update update = new Update().set("serviceDetail",customerService.getServiceDetail());
        return mongoTemplate.updateMulti(query,update,CustomerService.class);
    }

    public Integer insertService(CustomerService customerService) {
        mongoTemplate.insert(customerService);
        return 1;
    }














































}
