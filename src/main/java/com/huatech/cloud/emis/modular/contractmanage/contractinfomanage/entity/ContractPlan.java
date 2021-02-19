package com.huatech.cloud.emis.modular.contractmanage.contractinfomanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 合同付款计划表
 * </p>
 *
 * @author gxb
 * @since 2020-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ContractPlan对象", description="合同付款计划表")
public class ContractPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "付款计划编号")
    @TableId(value = "contract_payment_plan_id", type = IdType.ID_WORKER)
    private Long contractPaymentPlanId;

    @ApiModelProperty(value = "合同编号")
    private Long contractId;

    @ApiModelProperty(value = "付款比例")
    private Long contractAmount;

    @ApiModelProperty(value = "付款比例（String类型）")
    private String paymentProportion;

    @ApiModelProperty(value = "预付款时间")
    private Date paymentTime;

    @ApiModelProperty(value = "付款阶段")
    @TableField("paymentStage")
    private String paymentStage;

    @ApiModelProperty(value = "付款条件")
    private String paymentCondition;

    @ApiModelProperty(value = "合同概述")
    private String summary;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Long updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
