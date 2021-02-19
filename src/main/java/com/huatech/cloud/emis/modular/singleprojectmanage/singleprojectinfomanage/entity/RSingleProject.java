package com.huatech.cloud.emis.modular.singleprojectmanage.singleprojectinfomanage.entity;

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
 * 站点工程表
 * </p>
 *
 * @author gxb
 * @since 2020-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RSingleProject对象", description="站点工程表")
public class RSingleProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工程项目ID")
    @TableId(value = "single_project_id", type = IdType.ID_WORKER)
    private Long singleProjectId;

    @ApiModelProperty(value = "委托书ID")
    private Long proxyOrderId;

    private Long subcontractId;

    @ApiModelProperty(value = "工单ID")
    private Long constructionOrderId;

    @ApiModelProperty(value = "单项工程类型")
    private String workOrderType;

    @ApiModelProperty(value = "分公司ID")
    private String compId;

    @ApiModelProperty(value = " 工程部")
    private String engineeringId;

    @ApiModelProperty(value = "项目部")
    private String projectDepartment;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "地理经度")
    private String longitude;

    @ApiModelProperty(value = " 地理纬度")
    private String latitude;

    @ApiModelProperty(value = "地区")
    private String district;

    @ApiModelProperty(value = "客户姓名")
    private String custName;

    @ApiModelProperty(value = " 客户电话")
    private String custPhone;

    private BigDecimal budgetAmount;

    private BigDecimal estimateAmount;

    private String majorType;

    @ApiModelProperty(value = "单项工程明细id")
    private Long orderDetailId;

    private String projectScheduler;

    private String projectFile;

    @ApiModelProperty(value = "委托书")
    private Long proxyId;

    @ApiModelProperty(value = "采购订单id")
    private Long purchaseOrderId;

    @ApiModelProperty(value = " 施工单位id")
    private Long buildUnitId;

    @ApiModelProperty(value = " 施工队id")
    private Long buildTiemId;

    @ApiModelProperty(value = " 委托书名称")
    private String proxyName;

    @ApiModelProperty(value = " 委托书编号")
    private String proxyNumber;

    @ApiModelProperty(value = " 工程进度")
    private String projectProgress;

    @ApiModelProperty(value = " 移动管理员")
    private String mobileAdministrator;

    @ApiModelProperty(value = " 签到地址")
    private String address;

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


}
