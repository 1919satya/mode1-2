package com.hcl.bank;

public class WithdrawAccount {
	private int accno;
	private int amount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String WithdrawAccount(){
		return AccountBal.withdrawnAccountBal(accno, amount);
	}

}
