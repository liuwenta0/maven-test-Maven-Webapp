package com.wocloud.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.wocloud.common.basebean.CustomerToken;
import com.wocloud.common.basebean.ResultInfo;
import com.wocloud.common.json.JsonPluginsUtil;


public class testUserService {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-user-consumer.xml" });  
        context.start();  
        //InterfaceAccount acc = (InterfaceAccount)context.getBean("account");
        //ResultInfo ret = new ResultInfo();
        //查询余额
        //ret = acc.queryBalance("wangjian");
        //获取充值流水
       /* CustomerToken token = new CustomerToken();
        token.setAccountId(400014);
        token.setCustomerId(400014);
        token.setLoginName("wangjian");
        ret = acc.GenPayFeeSerialno(token);*/
        //充值
        //ret = acc.payFee("wangjian",2000,"offline100001566ss","1412220069177911","20150917");
        //充值记录查询
        //ret = acc.queryPayFeeCharge("wangjian", "20150913", "20150916");
        //账单查询
        //ret = acc.queryBill("swmarket", "201503");
        //查询普通详单
        //ret = acc.queryBillDetailForCommon("swmarket", "201503", "", "8104");
        //计量文件详单查询
        //ret = acc.queryBillDetailForMeasure("wangjian", "20150901", "20150915", "1012");
        //扣款
        /*List<TradeFee> tradeFeeList = new ArrayList<TradeFee>();
        TradeFee tf = new TradeFee();
        tf.setFeeValue(3000);
        tf.setTradeId("1509160070813393");
        tf.setSubscriptionId(70007484);
        tradeFeeList.add(tf);
        ret = acc.deductMoney("wangjian", tradeFeeList);*/
        //退费
        /*List<TradeFee> tradeFeeList = new ArrayList<TradeFee>();
        TradeFee tf = new TradeFee();
        tf.setFeeValue(3000);
        tf.setTradeId("1509160070813393");
        tf.setSubscriptionId(70007484);
        tradeFeeList.add(tf);
        ret = acc.backFeeToPublic("wangjian", tradeFeeList);*/
        //提现
        //ret = acc.backFee("wangjian", 3000);
        //发票打印
        /*PrintInvoice p = new PrintInvoice();
        p.setBankName("zhaoshang Bank");
        p.setBankNo(62228888);
        p.setTaxerNo("8888888");
        p.setInvoiceType(101);
        p.setInvoiceName("wangjian");
        p.setReceiver("wangjian");
        p.setAddress("two long road");
        p.setRegisterAddress("xidan");
        p.setPostCode(100086);
        p.setTelephone("18600043721");
        p.setInvoiceItem(1001);
        p.setPrintFee(100000);
        p.setCreateDate(new Date()); 
        ret = acc.printInvoice("wangjian", p);*/
        //发票可打金额
        //ret = acc.queryUnPrintBalance("wangjian");
        //发票已打金额
        //ret = acc.queryPrintBalance("wangjian");
        //查询账单(可打)金额
        //ret = acc.queryBillBalance("wangjiang");
        //查询发票打印日志
        //ret = acc.queryPrintLog("wangjian", 102, "20140601", "20140630");
        //更改发票状态
        //ret = acc.updateInvoiceStatus("wangjian", 15033, "67424809", 104);
        //检查红包订单
        //ret = acc.checkOrderByGift(70015651);
        //System.out.println("返回结果:"+ret.getRetObj());
        //System.out.println("返回标识:"+ret.getCode());
        //System.out.println("返回信息:"+ret.getInfo());
        
        //System.in.read();
	}
}
