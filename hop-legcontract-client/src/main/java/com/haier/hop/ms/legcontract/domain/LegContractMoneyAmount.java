package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 合同总金额上限
 * </p>
 *
 * @author liugan
 * @since 2020-01-17
 */
public class LegContractMoneyAmount extends Model<LegContractMoneyAmount> {

    private static final long serialVersionUID = 1L;

    private Integer rowId;
    /**
     * 公司编码
     */
    private String companyCode;
    /**
     * 合同类型
     */
    private Integer contractTypeId;
    /**
     * 合同金额上限
     */
    private BigDecimal contractAmount;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 修改时间
     */
    private Date updateDate;
    /**
     * 产业
     */
    private Integer contractIndustryId;
    /**
     * 年
     */
    private Integer year;
    /**
     * 是否需要控制关联交易额度，1：是；2：否
     */
    private String flag;
    /**
     * 合同金额上限总额度
     */
    private BigDecimal contractAmountAll;


    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getRowId() {
		return rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public Integer getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(Integer contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	}

	public Integer getContractIndustryId() {
		return contractIndustryId;
	}

	public void setContractIndustryId(Integer contractIndustryId) {
		this.contractIndustryId = contractIndustryId;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public BigDecimal getContractAmountAll() {
		return contractAmountAll;
	}

	public void setContractAmountAll(BigDecimal contractAmountAll) {
		this.contractAmountAll = contractAmountAll;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractMoneyAmount{" +
        "rowId=" + rowId +
        ", companyCode=" + companyCode +
        ", contractTypeId=" + contractTypeId +
        ", contractAmount=" + contractAmount +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", contractIndustryId=" + contractIndustryId +
        ", year=" + year +
        ", flag=" + flag +
        ", contractAmountAll=" + contractAmountAll +
        "}";
    }
}