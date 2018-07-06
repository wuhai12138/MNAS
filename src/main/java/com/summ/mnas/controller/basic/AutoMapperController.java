package com.summ.mnas.controller.basic;


import com.summ.mnas.mapper.*;
import com.summ.mnas.mapper.mongodb.CustomerServiceMapper;
import org.apache.ibatis.annotations.AutomapConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jygj_7500
 * @date 17/12/18
 */
public class AutoMapperController {

    @Autowired
    public JAppBannerGoodsMapper jAppBannerGoodsMapper;
    @Autowired
    public JAppBannerMapper jAppBannerMapper;
    @Autowired
    public JGoodsAreaMapper jGoodsAreaMapper;
    @Autowired
    public JScheduleChangeApplyMapper jScheduleChangeApplyMapper;
    @Autowired
    public JScheduleNannyMapper jScheduleNannyMapper;
    @Autowired
    public JCustomerScheduleFeedbackMapper jCustomerScheduleFeedbackMapper;
    @Autowired
    public JCustomerPrepaidMapper jCustomerPrepaidMapper;
    @Autowired
    public JCustomerMessageMapper jCustomerMessageMapper;
    @Autowired
    public JCustomerMessageDepartmentMapper jCustomerMessageDepartmentMapper;
    @Autowired
    public JOrderMonthMapper jOrderMonthMapper;
    @Autowired
    public JOrderMonthPrepaidMapper jOrderMonthPrepaidMapper;
    @Autowired
    public JNannyInfoMapper jNannyInfoMapper;
    @Autowired
    public CustomerServiceMapper customerServiceMapper;
    @Autowired
    public JSystemAuthCodeMapper jSystemAuthCodeMapper;
    @Autowired
    public JCouponMapper jCouponMapper;
    @Autowired
    public JCouponListMapper jCouponListMapper;
    @Autowired
    public JAreaMapper jAreaMapper;
    @Autowired
    public JProvinceMapper jProvinceMapper;
    @Autowired
    public JCityMapper jCityMapper;
    @Autowired
    public JCustomerHouseMapper jCustomerHouseMapper;
    @Autowired
    public JCustomerStatmentMapper jCustomerStatmentMapper;
    @Autowired
    public JCustomerMapper jCustomerMapper;
    @Autowired
    public JStreetMapper jStreetMapper;
    @Autowired
    public JDictInfoMapper jDictInfoMapper;
    @Autowired
    public JDictTypeMapper jDictTypeMapper;
    @Autowired
    public JShopMapper jShopMapper;
    @Autowired
    public JCustomerServiceMapper jCustomerServiceMapper;
    @Autowired
    public JOrderContractMapper jOrderContractMapper;
    @Autowired
    public JOrderScheduleMapper jOrderScheduleMapper;
    @Autowired
    public JGoodsContractMapper jGoodsContractMapper;
    @Autowired
    public JOrderTempMapper jOrderTempMapper;
    @Autowired
    public JOrderRefundMapper jOrderRefundMapper;
    @Autowired
    public JOrderYearsMapper jOrderYearsMapper;
    @Autowired
    public JWithdrawalMapper jWithdrawalMapper;
}
