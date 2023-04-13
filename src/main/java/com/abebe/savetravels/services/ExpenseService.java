package com.abebe.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abebe.savetravels.models.Expense;
import com.abebe.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	public List<Expense> getAll(){
		return (List<Expense>) expenseRepo.findAll();
	}
	
	 public Expense create(Expense expense) { return
			 expenseRepo.save(expense); }
	 
	 
	 public Expense findOne(Long id) {
			Optional<Expense> expense = expenseRepo.findById(id);
//			if(expense.isPresent()) {
//				return expense.get();
//			}
			return expense.isPresent() ? expense.get() : null;
		}
	 
	 
	 public Expense edit(Expense expense) {
			return expenseRepo.save(expense);
		}
		
		
	public void deleteExpense(Long id) {
			expenseRepo.deleteById(id);
		}
		
		/*
		 * public List<Donation> searchByDonationName(String donationName){ return
		 * donationRepo.findByNameContaining(donationName); }
		 */
	  
	 
}
