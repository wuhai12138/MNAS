package com.summ.mnas.controller.order;

import com.summ.mnas.Consts;
import com.summ.mnas.controller.basic.AutoMapperController;
import com.summ.mnas.model.*;
import com.summ.mnas.model.others.GetWXResult;
import com.summ.mnas.model.others.ModelRes;
import com.summ.mnas.model.others.PayCallBackObj;
import com.summ.mnas.model.request.CustomerPrepaidReq;
import com.summ.mnas.model.request.OrderReq;
import com.summ.mnas.model.request.OrderTempChargeReq;
import com.summ.mnas.model.response.CustomerCouponListRes;
import com.summ.mnas.model.response.OrderRes;
import com.summ.mnas.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.scripts.JO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping(value = "/order", method = RequestMethod.POST)
@Api(tags = "订单模块")
public class OrderController extends AutoMapperController {

    @ApiOperation(value = "合同订单详情",response = OrderRes.class)
    @RequestMapping("/contract/detail")
    public Object getOrderContractDetail(@RequestBody OrderReq orderReq) {
        try {
            orderReq.setPage((orderReq.getPage()-1)*orderReq.getSize());
            List<OrderRes> orderContractList = jOrderContractMapper.getContractDetail(orderReq);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", ResponseUtil.List2Map(orderContractList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
    @ApiOperation(value = "临时订单详情",response = OrderRes.class)
    @RequestMapping("/temp/detail")
    public Object getOrderTempDetail(@RequestBody OrderReq orderReq) {
        try {
            orderReq.setPage((orderReq.getPage()-1)*orderReq.getSize());
            List<OrderRes> orderTempList = jOrderTempMapper.getTempDetail(orderReq);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", ResponseUtil.List2Map(orderTempList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
    @ApiOperation(value = "关闭临时订单",notes = "参数为 orderId")
    @RequestMapping("/temp/close")
    public Object closeOrderTemp(@RequestBody JOrderTemp jOrderTemp) {
        try {
            JOrderTemp jOrderTemp1 = new JOrderTemp();
            jOrderTemp1.setOrderId(jOrderTemp.getOrderId());
            jOrderTemp1.setOrderCloseStatus(213);
            jOrderTempMapper.updateById(jOrderTemp1);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
    @ApiOperation(value = "包月订单详情",response = OrderRes.class)
    @RequestMapping("/month/detail")
    public Object getOrderMonthDetail(@RequestBody OrderReq orderReq) {
        try {
            orderReq.setPage((orderReq.getPage()-1)*orderReq.getSize());
            List<OrderRes> orderMonthList = jOrderMonthMapper.getMonthDetail(orderReq);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", ResponseUtil.List2Map(orderMonthList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
    @ApiOperation(value = "包年订单详情",response = OrderRes.class)
    @RequestMapping("/year/detail")
    public Object getOrderDetail(@RequestBody OrderReq orderReq) {
        try {
            orderReq.setPage((orderReq.getPage()-1)*orderReq.getSize());
            List<OrderRes> orderYearList = jOrderYearsMapper.getYearDetail(orderReq);
            return new ModelRes(ModelRes.Status.SUCCESS, "操作成功", ResponseUtil.List2Map(orderYearList));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }

    @ApiOperation(value = "添加新预约订单")
    @RequestMapping("/insert")
    public Object insertOrder(@RequestBody JCustomerPrepaid jCustomerPrepaid) {
        try {
            jCustomerPrepaidMapper.insert(jCustomerPrepaid);
            return new ModelRes(ModelRes.Status.SUCCESS, "", jCustomerPrepaid);
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
    @ApiOperation(value = "取消新预约订单",notes = "prepaidId 预约单id")
    @RequestMapping("/cancel")
    public Object cancelOrder(@RequestBody JCustomerPrepaid jCustomerPrepaid) {
        try {
            jCustomerPrepaid.setPrepaidStatus(288);
            return new ModelRes(ModelRes.Status.SUCCESS, "", jCustomerPrepaidMapper.updateById(jCustomerPrepaid));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }
    @ApiOperation(value = "查询预约订单")
    @RequestMapping("/prepaid/find")
    public Object findPrepaid(@RequestBody CustomerPrepaidReq customerPrepaidReq) {
        try {
            customerPrepaidReq.setPage((customerPrepaidReq.getPage()-1)*customerPrepaidReq.getSize());
            return new ModelRes(ModelRes.Status.SUCCESS, "", ResponseUtil.List2Map(jCustomerPrepaidMapper.getCustomerPrepaidList(customerPrepaidReq)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }

    @ApiOperation(value = "添加临时订单",notes = "customerId,shopId,houseId,goodsId,orderDate订单日期,startTime开始时间id,endTime结束时间id,serviceAmount服务数量,couponListId优惠券id,remark备注")
    @RequestMapping("/generate")
    public Object generate(@RequestBody JOrderTemp jOrderTemp) {
        try {
            JGoodsContract jGoodsContract = jGoodsContractMapper.selectById(Long.valueOf(jOrderTemp.getGoodsId()));
            jOrderTemp.setStartTimeValue(NannyWorkTimeUtil.id2Time(jOrderTemp.getStartTime()));
            jOrderTemp.setEndTimeValue(NannyWorkTimeUtil.id2Time(jOrderTemp.getEndTime()));
            jOrderTemp.setUnitPrice(jGoodsContract.getPrice());
            jOrderTemp.setTotalPrice(jGoodsContract.getPrice().multiply(new BigDecimal(jOrderTemp.getServiceAmount())));
            jOrderTemp.setOrderOrigin(298);
            jOrderTempMapper.insert(jOrderTemp);

            /**发送短信给门店手机号*/
            JShop jShop = jShopMapper.selectById(Long.valueOf(jOrderTemp.getShopId()));
            JCustomer jCustomer = jCustomerMapper.selectById(Long.valueOf(jOrderTemp.getCustomerId()));
            SendSMSUtil.notifyShop(jCustomer.getCustomerPhone(),jShop.getShopMobile(),jCustomer.getCustomerName());
            return new ModelRes(ModelRes.Status.SUCCESS, "", jOrderTemp);
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err", null);
        }
    }


    /**
     * 根据根据产品获取优惠券列表
     * @param orderTempChargeReq
     * @return
     */
    @ApiOperation(value = "根据根据产品获取优惠券列表",notes = "shopIdList门店id列表,goodsIdList产品id列表,customerId客户id")
    @ResponseBody
    @RequestMapping("/coupon")
    public Object coupon(@RequestBody OrderTempChargeReq orderTempChargeReq) {
        try {
            //不可使用优惠券列表
            List<CustomerCouponListRes> unUseCouponList = jCouponListMapper.getUnUseCouponList(orderTempChargeReq);
            //可使用优惠券列表
            List<CustomerCouponListRes> usedCouponList = jCouponListMapper.getUsedCouponList(orderTempChargeReq);

            Map map = new HashMap();
            map.put("unUseCouponList",unUseCouponList);
            map.put("usedCouponList",usedCouponList);
            return new ModelRes(ModelRes.Status.SUCCESS,"操作成功  !", map);
        } catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    /**
     * 临时订单多笔支付
     * @param orderTempChargeReq
     * @return
     */
    @ApiOperation(value = "临时订单多笔支付")
    @ResponseBody
    @RequestMapping("/pay")
    public Object pay(@RequestBody OrderTempChargeReq orderTempChargeReq) {
        try {

            /**客户对账单列表*/
            List<JCustomerStatment> jCustomerStatmentList = new ArrayList<>();
            JCouponList jCouponList = new JCouponList();

            /**订单列表*/
            List<JOrderTemp> jOrderTempList = jOrderTempMapper.selectBatchIds(orderTempChargeReq.getOrderList());
            /**获取选择的优惠券信息*/
            JCoupon jCoupon = new JCoupon();
            if(orderTempChargeReq.getCouponListId()==0||null==orderTempChargeReq.getCouponListId()){
                jCoupon.setCouponPrice(new BigDecimal(0));
                jCoupon.setOrderMiniPrice(new BigDecimal(0));
            }else {
                jCoupon = jCouponMapper.getCouponByCouponListId(orderTempChargeReq.getCouponListId());
                jCouponList.setCouponListId(orderTempChargeReq.getCouponListId());
                jCouponList.setCouponStatus(34);
                jCouponList.setUseTime(new Date());

            }
            JCustomer jCustomer = jCustomerMapper.selectById(Long.valueOf(jOrderTempList.get(0).getCustomerId()));
            if (orderTempChargeReq.getCost().compareTo(jCoupon.getOrderMiniPrice()) <0){
                return new ModelRes(ModelRes.Status.FAILED, "订单总额不符合优惠券规范，请重选 !");
            }

            if (orderTempChargeReq.getCost().compareTo(jCoupon.getCouponPrice())!=1){
                if (orderTempChargeReq.getChargeType()==44||orderTempChargeReq.getChargeType()==45){
                    return new ModelRes(ModelRes.Status.FAILED, "订单金额0元时,请选择余额支付 !");
                }
            }
            if (orderTempChargeReq.getCost().subtract(jCoupon.getCouponPrice()).compareTo(jCustomer.getCustomerBalance())>0&&orderTempChargeReq.getChargeType()==48){
                return new ModelRes(ModelRes.Status.FAILED, "余额不够，请重选支付方式 !");
            }

            String statmentCustomer = OrderUtil.generateStamentNumber(jCustomer.getCustomerId());
            /**判断支付方式是余额还是手机支付*/
            if(orderTempChargeReq.getChargeType()==48){
                /**针对每个订单，更新折扣金额，支付金额，支付状态，优惠券id，新增对账单*/
                for (JOrderTemp jOrderTemp : jOrderTempList){
                    if (jOrderTemp.getPayStatus()==158){
                        return new ModelRes(ModelRes.Status.FAILED, "有订单已支付 !",jOrderTemp);
                    }
                    Map map=new HashMap();
                    map.put("orderId",jOrderTemp.getOrderId());
                    map.put("orderType",164);
                    List<JOrderSchedule> jOrderScheduleList = jOrderScheduleMapper.selectByMap(map);
                    if (jOrderScheduleList.size()>0){
                        for (JOrderSchedule jOrderSchedule : jOrderScheduleList){
                            jOrderSchedule.setPayStatus(158);
                            jOrderScheduleMapper.updateById(jOrderSchedule);
                        }
                    }

                    /**更新订单信息*/
                    BigDecimal discount = jCoupon.getCouponPrice().multiply(jOrderTemp.getTotalPrice()).divide(orderTempChargeReq.getCost(),2,BigDecimal.ROUND_HALF_UP);
                    if (discount.compareTo(jOrderTemp.getTotalPrice())==1){
                        discount=jOrderTemp.getTotalPrice();
                    }
                    jOrderTemp.setDiscount(discount);
                    jOrderTemp.setPayMoney(jOrderTemp.getTotalPrice().subtract(jOrderTemp.getDiscount()));
                    jOrderTemp.setPayStatus(158);
                    jOrderTemp.setPayTime(new Date());
                    jOrderTemp.setCouponListId(orderTempChargeReq.getCouponListId());

                    String serviceTime = jOrderTemp.getStartTimeValue()+"-"+jOrderTemp.getEndTimeValue();
                    Double serviceTimeLength = Double.valueOf((jOrderTemp.getEndTime() - jOrderTemp.getStartTime()) / 2f);
                    JCustomerStatment jCustomerStatment = new JCustomerStatment(statmentCustomer,
                            jOrderTemp.getCustomerId(),jOrderTemp.getGoodsId(), jOrderTemp.getHouseId(),
                            jOrderTemp.getOrderId(),164,0,
                            jOrderTemp.getShopId(), serviceTime, serviceTimeLength,
                            jOrderTemp.getOrderDate(), new Date(), 177, jOrderTemp.getPayMoney(),
                            orderTempChargeReq.getChargeType(), 0, 52, 53, jCustomer.getCustomerBalance().subtract(jOrderTemp.getPayMoney()),
                            orderTempChargeReq.getSerialNumber(), "",jOrderTemp.getCouponListId());
                    /**添加客户对账单*/
                    jCustomerStatmentList.add(jCustomerStatment);
                    jCustomerStatmentMapper.insert(jCustomerStatment);
                    if (orderTempChargeReq.getChargeType()==48){
                        /**更新客户余额*/
                        jCustomer.setCustomerBalance(jCustomer.getCustomerBalance().subtract(jOrderTemp.getPayMoney()));
                    }

                    jOrderTempMapper.updateById(jOrderTemp);
                }

                jCustomerMapper.updateById(jCustomer);
                if(orderTempChargeReq.getCouponListId()!=0&&null!=orderTempChargeReq.getCouponListId()){
                    jCouponListMapper.updateById(jCouponList);
                }

            }else {
                /**支付服务器所需信息*/
                PayCallBackObj payCallBackObj = new PayCallBackObj(jCustomer.getCustomerId(),jCustomer.getCustomerName(),jCustomer.getCustomerPhone(),0,"",0);

                /**针对每个订单，更新折扣金额，支付金额，支付状态，优惠券id，新增对账单*/
                for (JOrderTemp jOrderTemp : jOrderTempList) {
                    /**更新订单信息*/
                    jOrderTemp.setDiscount(jCoupon.getCouponPrice().multiply(jOrderTemp.getTotalPrice()).divide(orderTempChargeReq.getCost(), 2, BigDecimal.ROUND_HALF_UP));
                    jOrderTemp.setPayMoney(jOrderTemp.getTotalPrice().subtract(jOrderTemp.getDiscount()));
                    jOrderTemp.setCouponListId(orderTempChargeReq.getCouponListId());

                    String serviceTime = jOrderTemp.getStartTimeValue() + "-" + jOrderTemp.getEndTimeValue();
                    Double serviceTimeLength = Double.valueOf((jOrderTemp.getEndTime() - jOrderTemp.getStartTime()) / 2f);
                    /**根据支付方式生成不同支付方式（chargeWay）的对账单*/
                    if (orderTempChargeReq.getChargeType()== Consts.weixin){
                        JCustomerStatment jCustomerStatment = new JCustomerStatment(statmentCustomer,
                                jOrderTemp.getCustomerId(),jOrderTemp.getGoodsId(), jOrderTemp.getHouseId(),
                                jOrderTemp.getOrderId(),164,0,
                                jOrderTemp.getShopId(), serviceTime, serviceTimeLength,
                                jOrderTemp.getOrderDate(), new Date(), 177, jOrderTemp.getPayMoney(),
                                45, 0, orderTempChargeReq.getTerminal(), 54, jCustomer.getCustomerBalance(),
                                orderTempChargeReq.getSerialNumber(), "",jOrderTemp.getCouponListId());
                        /**添加客户对账单*/
                        jCustomerStatmentList.add(jCustomerStatment);
                        jCustomerStatmentMapper.insert(jCustomerStatment);
                    }

                }
                /**微信*/
                if (orderTempChargeReq.getChargeType()== Consts.weixin){
                    return WeixinUtil.weiXinPay(statmentCustomer,jCustomer.getWeiXinOpenId(),orderTempChargeReq.getCost().subtract(jCoupon.getCouponPrice()).toString(),Consts.serverUrl+"/order/WeiXin/callback",payCallBackObj,"家有管家--微信支付");
                }
            }

            return new ModelRes(ModelRes.Status.SUCCESS, "支付成功！" ,null);
        }catch (Exception e) {
            e.printStackTrace();
            return new ModelRes(ModelRes.Status.ERROR, "server err !");
        }
    }

    /**
     * 微信回调
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/WeiXin/callback", method = RequestMethod.POST)
    public String WeiXinResult(HttpServletRequest request) throws Exception {
        String inputLine;
        StringBuffer notifyXml = new StringBuffer();
        try {
            while ((inputLine = request.getReader().readLine()) != null) {
                notifyXml.append(inputLine);
                System.out.println(" ");
            }
            request.getReader().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("notifyXml:" + notifyXml.toString());
        GetWXResult get = (GetWXResult) JsonUtil.getObjectFromXML(notifyXml.toString(), GetWXResult.class);
        System.out.println("notifyObj:" + get.toString());
        if (get.getResult_code().equals("SUCCESS")) {
            Map map = new HashMap();
            map.put("statmentCustomer",get.getOut_trade_no());
            List<JCustomerStatment> jCustomerStatmentList = jCustomerStatmentMapper.selectByMap(map);
            for (JCustomerStatment jCustomerStatment : jCustomerStatmentList){
                jCustomerStatment.setStatus(53);
                jCustomerStatment.setSerialNumber(get.getTransaction_id());
                jCustomerStatment.setChargeDate(DateUtil.parseStringToDate(get.getTime_end(),DateUtil.PATTERN_yyyyMMddHHmmss));
                jCustomerStatment.setNotifyDate(new Date());

                JOrderTemp jOrderTemp = new JOrderTemp();
                jOrderTemp.setOrderId(jCustomerStatment.getOrderId());
                jOrderTemp.setPayStatus(158);
                jOrderTemp.setPayTime(new Date());

                if (0!=jCustomerStatment.getCouponListId()||null!=jCustomerStatment.getCouponListId()){
                    JCouponList jCouponList = new JCouponList();
                    jCouponList.setCouponListId(jCustomerStatment.getCouponListId());
                    jCouponList.setCouponStatus(34);
                    jCouponList.setUseTime(new Date());
                    jCouponListMapper.updateById(jCouponList);
                }

                jCustomerStatmentMapper.updateById(jCustomerStatment);
                jOrderTempMapper.updateById(jOrderTemp);
            }
            return "PayResult";
        }
        return "error";
    }
}
