package com.huatech.cloud.emis.modular.humanresourcemanage.humanresourceinfomanage.entity;

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
 * 劳务合同签订信息表
 * </p>
 *
 * @author gxb
 * @since 2020-09-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ULaborContract对象", description="劳务合同签订信息表")
public class ULaborContract implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "labor_id", type = IdType.ID_WORKER)
    private Long laborId;

    @ApiModelProperty(value = "人员id")
    private Long employeeId;

    @ApiModelProperty(value = "合同签订单位类型")
    private String companyType;

    @ApiModelProperty(value = "签订单位名称")
    private String companyName;

    @ApiModelProperty(value = "下载")
    private String contractPic;

    @ApiModelProperty(value = "劳务信息编码")
    private String laborCode;

    @ApiModelProperty(value = "签订日期")
    private Date signDate;

    @ApiModelProperty(value = "截止日期")
    private Date deadLine;

    private Integer salary;

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
