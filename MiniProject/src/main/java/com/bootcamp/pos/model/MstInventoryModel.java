package com.bootcamp.pos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="POS_MST_INVENTORY")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="inventoryId")
public class MstInventoryModel implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long variantId;
	private Long outletId;
	private int beginning;
	private int purchaseQty;
	private int salesOrderQty;
	private int tranferStockQty;
	private int adjustmentQty;
	private int endingQty;
	private int alertAtQty;
	private Date createdOn;
	private Long createdBy;
	private Date modifiedOn;
	private Long modifiedBy;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.TABLE,generator="MST_INVENTORY")
	@TableGenerator(name="MST_INVENTORY",table="POS_MST_SEQUENCE", pkColumnName="SEQUENCE_ID", pkColumnValue="MST_INVENTORY", valueColumnName="SEQUENCE_VALUE", allocationSize=1, initialValue=1)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="VARIANT_ID")
	public Long getVariantId() {
		return variantId;
	}
	public void setVariantId(Long variantId) {
		this.variantId = variantId;
	}
	
	@Column(name="OUTLET_ID")
	public Long getOutletId() {
		return outletId;
	}
	public void setOutletId(Long outletId) {
		this.outletId = outletId;
	}
	
	@Column(name="BEGINNING")
	public int getBeginning() {
		return beginning;
	}
	public void setBeginning(int beginning) {
		this.beginning = beginning;
	}
	
	@Column(name="PURCHASE_QTY")
	public int getPurchaseQty() {
		return purchaseQty;
	}
	public void setPurchaseQty(int purchaseQty) {
		this.purchaseQty = purchaseQty;
	}
	
	@Column(name="SALES_ORDER_QTY")
	public int getSalesOrderQty() {
		return salesOrderQty;
	}
	public void setSalesOrderQty(int salesOrderQty) {
		this.salesOrderQty = salesOrderQty;
	}
	
	@Column(name="TRANSFER_STOCK_QTY")
	public int getTranferStockQty() {
		return tranferStockQty;
	}
	public void setTranferStockQty(int tranferStockQty) {
		this.tranferStockQty = tranferStockQty;
	}
	
	@Column(name="ADJUSTMENT_QTY")
	public int getAdjustmentQty() {
		return adjustmentQty;
	}
	public void setAdjustmentQty(int adjustmentQty) {
		this.adjustmentQty = adjustmentQty;
	}
	
	@Column(name="ENDING_QTY")
	public int getEndingQty() {
		return endingQty;
	}
	public void setEndingQty(int endingQty) {
		this.endingQty = endingQty;
	}
	
	@Column(name="ALERT_AT_QTY")
	public int getAlertAtQty() {
		return alertAtQty;
	}
	public void setAlertAtQty(int alertAtQty) {
		this.alertAtQty = alertAtQty;
	}
	
	@Column(name="CREATED_ON")
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Column(name="CREATED_BY")
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name="MODIFIED_ON")
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	@Column(name="MODIFIED_BY")
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}
