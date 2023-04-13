package com.abebe.savetravels.models;

	import java.util.Date;

	import org.springframework.format.annotation.DateTimeFormat;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.PrePersist;
	import jakarta.persistence.PreUpdate;
	import jakarta.persistence.Table;
	import jakarta.validation.constraints.Min;
	import jakarta.validation.constraints.NotNull;
	import jakarta.validation.constraints.Size;


	@Entity
	@Table(name="expenses")
	public class Expense{ 

		//Attributes
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotNull
	    @Size(min = 5, max = 200, message="expenseType has to be above 5 characters and below 200")
	    private String expenseType;
	    
	    @NotNull
	    @Size(min = 5, max = 200, message="vendor has to be above 5 characters and below 200")
	    private String vendor;
	    
	    @NotNull
	    @Min(0)
	    private Integer amount;
	    
	    @NotNull
	    @Size(min = 5, max = 200, message="description has to be above 5 characters and below 200")
	    private String description;
	    
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    
	    //constructors
		public Expense() {}
		
		public Expense(String expenseType, String vendor, Integer amount ) {
			this.expenseType = expenseType;
			this.vendor = vendor;
			this.amount = amount;
		}

		// other methods
		
		
		
		// getters and setters
		
	   
		
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getExpenseType() {
			return expenseType;
		}

		public void setExpenseType(String expenseType) {
			this.expenseType = expenseType;
		}

		public String getVendor() {
			return vendor;
		}

		public void setVendor(String vender) {
			this.vendor = vender;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}
		

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
		
		@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }

	}

