package com.huatech.cloud.emis.modular.warehousemanage.productInfoManage.entity;

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
 * 产品表
 * </p>
 *
 * @author gxb
 * @since 2020-09-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RProd对象", description="产品表")
public class RProd implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品id")
    @TableId(value = "prod_id", type = IdType.ID_WORKER)
    private Long prodId;

    @ApiModelProperty(value = "产品名称")
    private String prodName;

    @ApiModelProperty(value = "生产日期")
    private Date makeDate;

    @ApiModelProperty(value = "计量单位")
    private String prodUnit;

    @ApiModelProperty(value = "产品价格")
    private Integer prodPrice;

    @ApiModelProperty(value = "税率")
    private Integer taxRate;

    @ApiModelProperty(value = "父类id")
    private Long prodParentId;

    @ApiModelProperty(value = "父类id集合")
    private String prodParentIds;

    @ApiModelProperty(value = "产品简称")
    private String shortName;

    @ApiModelProperty(value = "状态（1启用，2禁用）")
    private Integer status;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Long updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "排序")
    private BigDecimal orderNo;


}
