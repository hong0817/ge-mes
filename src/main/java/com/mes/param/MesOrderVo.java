package com.mes.param;

import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class MesOrderVo {
	@Min(1)
	private Integer count=1;
	
    private Integer id;

    private String orderId;

    private String orderClientname;

    private String orderProductname;

    private String orderContractid;

    private String orderImgid;

    private String orderMaterialname;

    private Date orderCometime;

    private Date orderCommittime;

    private Integer orderInventorystatus;

    private String orderSalestatus;

    private String orderMaterialsource;

    private Integer orderHurrystatus;

    private Integer orderStatus;

    private String orderRemark;

    private String orderOperator;

    private Date orderOperateTime;

    private String orderOperateIp;

    @NotBlank(message="来料日期不可以为空")
    private String comeTime;
    
    @NotBlank(message="提交日期不可以为空")
    private String commitTime;
}