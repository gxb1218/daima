package com.huatech.cloud.emis.modular.warehousemanage.warehouseInfoManage.entity;

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
 * 仓库信息维护表
 * </p>
 *
 * @author gxb
 * @since 2020-09-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RStoreHouse对象", description="仓库信息维护表")
public class RStoreHouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "仓库编号")
    @TableId(value = "store_id", type = IdType.ID_WORKER)
    private Long storeId;

    @ApiModelProperty(value = "仓库名称")
    private String storeName;

    @ApiModelProperty(value = "仓库编码")
    private String storeCode;

    @ApiModelProperty(value = "仓库级别 1：铁通仓储2：劳务公司仓储3：施工单位仓储4:施工队仓储")
    private String storeClass;

    @ApiModelProperty(value = "仓库所属机构 选1后只显示铁通机构，选2后只显示劳务公司机构，选3时只显示施工单位机构")
    private String orgId;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    @ApiModelProperty(value = "修改人")
    private Long updateUser;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "删除标记")
    private String delFlag;


}
