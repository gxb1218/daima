package com.huatech.cloud.emis.modular.orderpurchasemanage.orderpurchaseinformationmanage.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 合同分包表
 * </p>
 *
 * @author gxb
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RProxy对象", description="合同分包表")
public class RProxy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "委托书id")
    @TableId(value = "proxy_id", type = IdType.ID_WORKER)
    private Long proxyId;

    @ApiModelProperty(value = " 合同名称")
    private String contractName;

    @ApiModelProperty(value = " 合同id")
    private Long contractId;

    @ApiModelProperty(value = " 工程名称")
    private String projectName;

    @ApiModelProperty(value = " 甲方单位")
    private String contractFirstUnit;

    @ApiModelProperty(value = " 乙方单位")
    private String contractSecondUnit;

    @ApiModelProperty(value = " 乙方合同编号")
    private String contractCodeSecond;

    @ApiModelProperty(value = " 甲方合同编号")
    private String contractCodeFirst;

    @ApiModelProperty(value = " 预算价")
    private BigDecimal budgetaryPrice;

    @ApiModelProperty(value = " 项目号")
    private String projectId;

    @ApiModelProperty(value = " 委托日期")
    private Date proxyDate;

    @ApiModelProperty(value = " 开工日期")
    private Date startDate;

    @ApiModelProperty(value = " 计划交工日期")
    private Date completionDate;

    @ApiModelProperty(value = " 任务内容及要求")
    private String contentRequirement;

    @ApiModelProperty(value = " 甲方代表")
    private String contractingOfficer;

    @ApiModelProperty(value = " 甲方联系方式")
    private String firstPhone;

    @ApiModelProperty(value = " 乙方代表")
    private String contractorName;

    @ApiModelProperty(value = " 乙方联系方式")
    private String secondPhone;

    @ApiModelProperty(value = " 委托书编号")
    private String proxyNumber;

    @ApiModelProperty(value = "公司")
    private String companyId;

    @ApiModelProperty(value = "单项合同金额")
    private BigDecimal singleMoney;

    @ApiModelProperty(value = " 框架订单累计执行金额")
    private BigDecimal addUpMoney;

    @ApiModelProperty(value = " 框架剩余金额")
    private BigDecimal remainMoney;

    @ApiModelProperty(value = "所属项目部")
    private String projectDepartment;

    @ApiModelProperty(value = " 移动订单类型")
    private String moveType;

    @ApiModelProperty(value = " 建设地点")
    private String constructionAddress;

    @ApiModelProperty(value = " 项目经理")
    private String projectManager;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Long updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "设计单位")
    private String designUnit;

    @ApiModelProperty(value = " 监督单位")
    private String supervisorUnit;

    @ApiModelProperty(value = " 备注")
    private String note;

    @ApiModelProperty(value = " 具体任务名称")
    private String taskName;

    @ApiModelProperty(value = " 项目名称")
    private String itemName;

    @ApiModelProperty(value = " 专业类别4")
    private String category4;

    @ApiModelProperty(value = " 专业类别3")
    private String category3;

    @ApiModelProperty(value = " 专业类别2")
    private String category2;

    @ApiModelProperty(value = " 专业类别1")
    private String category1;

    @ApiModelProperty(value = "单项合同税率")
    private BigDecimal singleMoneyRate;

    @ApiModelProperty(value = "不含税金额")
    private BigDecimal noRateMoney;

    @ApiModelProperty(value = "含税金额")
    private BigDecimal rateMoney;

    @ApiModelProperty(value = "税金")
    private BigDecimal tax;

    @ApiModelProperty(value = "框架金额")
    private BigDecimal frameworkMoney;

    @ApiModelProperty(value = "框架协议有效期")
    private Date frameworkDate;


}
