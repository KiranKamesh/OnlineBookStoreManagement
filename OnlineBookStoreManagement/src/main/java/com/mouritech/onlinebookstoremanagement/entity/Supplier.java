package com.mouritech.onlinebookstoremanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "supplier")
public class Supplier {
	
	@Id
	@Column(name = "supplier_id", length = 64)
	private String supplierId;
	@Column(name = "supplier_name")
	private String supplierName;
	@Column(name = "supplier_email_id", nullable = false)
	@Email(message = "Not a valid email")
	private String supplierEmailId;
	@Column(name = "supplier_contact_no")
	private int supplierContactNo;
	@Column(name = "supplier_address")
	private String supplierAddress;
	
	public Supplier() {
		
	}

	public Supplier(String supplierName, @Email(message = "Not a valid email") String supplierEmailId,
			int supplierContactNo, String supplierAddress) {
		super();
		this.supplierName = supplierName;
		this.supplierEmailId = supplierEmailId;
		this.supplierContactNo = supplierContactNo;
		this.supplierAddress = supplierAddress;
	}

	public Supplier(String supplierId, String supplierName,
			@Email(message = "Not a valid email") String supplierEmailId, int supplierContactNo,
			String supplierAddress) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierEmailId = supplierEmailId;
		this.supplierContactNo = supplierContactNo;
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierEmailId() {
		return supplierEmailId;
	}

	public void setSupplierEmailId(String supplierEmailId) {
		this.supplierEmailId = supplierEmailId;
	}

	public int getSupplierContactNo() {
		return supplierContactNo;
	}

	public void setSupplierContactNo(int supplierContactNo) {
		this.supplierContactNo = supplierContactNo;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierEmailId="
				+ supplierEmailId + ", supplierContactNo=" + supplierContactNo + ", supplierAddress=" + supplierAddress
				+ "]";
	}
	
	

}
