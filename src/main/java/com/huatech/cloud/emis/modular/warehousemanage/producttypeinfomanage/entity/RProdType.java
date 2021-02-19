package com.huatech.cloud.emis.modular.warehousemanage.producttypeinfomanage.entity;

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
 * 
 * </p>
 *
 * @author gxb
 * @since 2020-09-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RProdType对象", description="")
public class RProdType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品id")
    @TableId(value = "prod_type_id", type = IdType.ID_WORKER)
    private String prodTypeId;

    @ApiModelProperty(value = "产品类型名称")
    private String prodTypeName;

    @ApiModelProperty(value = "父类id")
    private String prodParentId;

    @ApiModelProperty(value = "产品编码")
    private String prodCode;

    @ApiModelProperty(value = "父类id集合")
    private String prodParentIds;

    @ApiModelProperty(value = "排序")
    private BigDecimal orderNo;

    @ApiModelProperty(value = "公司简介")
    private String description;

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


}
