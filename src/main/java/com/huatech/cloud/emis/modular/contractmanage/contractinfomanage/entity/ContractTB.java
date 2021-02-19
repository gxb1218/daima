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
 * 乙方合同信息
 * </p>
 *
 * @author gxb
 * @since 2020-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ContractTB对象", description="乙方合同信息")
public class ContractTB implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "乙方ID")
    @TableId(value = "contract_b_id", type = IdType.ID_WORKER)
    private Long contractBId;

    @ApiModelProperty(value = "合同ID")
    private Long contractId;

    @ApiModelProperty(value = "乙方合同号")
    private String contractCodeSecond;

    @ApiModelProperty(value = "乙方合同签订单位")
    private String contractSecondSigningUnit;

    @ApiModelProperty(value = "合同乙方单位")
    private String contractSecondUnit;

    @ApiModelProperty(value = "合同乙方联系人")
    private String contractSecondUnitTel;

    @ApiModelProperty(value = "乙方联系方式")
    private String contractSecondPhone;

    @ApiModelProperty(value = "乙方采购方式")
    private String contractOptionSecondUnit;

    @ApiModelProperty(value = "乙方渠道")
    private String secondIndustry;

    @ApiModelProperty(value = "乙方开户行")
    private String secondOpenBank;

    @ApiModelProperty(value = "乙方银行户名")
    private String secondOpenBankName;

    @ApiModelProperty(value = "乙方税号")
    private String secondTaxCode;

    @ApiModelProperty(value = "乙方银行账户")
    private String secondBankAccount;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Long updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
