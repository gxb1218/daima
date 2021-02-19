package com.huatech.cloud.emis.modular.contractmanage.contractinfomanage.entity;

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
 * 甲方合同信息
 * </p>
 *
 * @author gxb
 * @since 2020-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ContractTA对象", description="甲方合同信息")
public class ContractTA implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "甲方ID")
    @TableId(value = "contract_a_id", type = IdType.ID_WORKER)
    private Long contractAId;

    @ApiModelProperty(value = "合同ID")
    private Long contractId;

    @ApiModelProperty(value = "甲方合同号")
    private String contractCodeFirst;

    @ApiModelProperty(value = "甲方合同签订单位")
    private String contractFirstSigningUnit;

    @ApiModelProperty(value = "合同甲方单位")
    private String contractFirstUnit;

    @ApiModelProperty(value = "合同甲方联系人")
    private String contractFirstUnitTel;

    @ApiModelProperty(value = "甲方联系方式")
    private String contractFirstPhone;

    @ApiModelProperty(value = "甲方采购方式")
    private String contractOptionFistUnit;

    @ApiModelProperty(value = "甲方渠道")
    private String firstIndustry;

    @ApiModelProperty(value = "甲方开户行")
    private String firstOpenBank;

    @ApiModelProperty(value = "甲方银行户名")
    private String firstOpenBankName;

    @ApiModelProperty(value = "甲方税号")
    private String firstTaxCode;

    @ApiModelProperty(value = "甲方银行账户")
    private String firstBankAccount;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Long updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
