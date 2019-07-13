package com.mes.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mes.beans.PageQuery;
import com.mes.beans.PageResult;
import com.mes.common.JsonData;
import com.mes.model.MesOrder;
import com.mes.param.MesOrderVo;
import com.mes.param.SearchOrderParam;
import com.mes.service.OrderService;

///order/orderBatch.page
@Controller
@RequestMapping("/order")
public class OrderController {
	
	private static String FPATH="order/";
	@Resource
	private OrderService orderService;
	
	@RequestMapping("/order.page")
	public String orderPage() {
		return FPATH+"order";
	}
	
	@RequestMapping("/orderBatch.page")
	public String orderBatchPage() {
		return FPATH+"orderBatch";
	}
	
	//批量启动处理
	@ResponseBody
	@RequestMapping("/orderBatchStart.json")
	public JsonData orderBatchStart(String ids) {
		orderService.batchStart(ids);
		return JsonData.success();
	}
		
	@ResponseBody
	@RequestMapping("/insert.json")
	public JsonData insetAjax(MesOrderVo mesOrderVo) {
		orderService.orderBatchInserts(mesOrderVo);
		return JsonData.success();
	}
	
	@RequestMapping("/order.json")
    @ResponseBody
    public JsonData searchPage(SearchOrderParam param, PageQuery page) {
    	PageResult<MesOrder> pr=(PageResult<MesOrder>) orderService.searchPageList(param, page);
    	
    	return JsonData.success(pr);
    }
	
	 @RequestMapping("/update.json")
	 @ResponseBody
	 public JsonData updateOrder(MesOrderVo mesOrderVo) {
	    orderService.update(mesOrderVo);
	    return JsonData.success();
	 }
	
}
