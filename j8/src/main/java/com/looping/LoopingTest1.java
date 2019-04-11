package com.looping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LoopingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BankDetails> bdList = new ArrayList<BankDetails>();

		bdList.add(new BankDetails(123, "Scoot", "SBI", "Marathahali"));
		bdList.add(new BankDetails(456, "Peter", "BOA", "Washington D.C"));
		bdList.add(new BankDetails(456, "Elmaret", "BOA", "Washington D.C"));

		List<String> branches = new ArrayList<>();

		for (BankDetails bds : bdList) {

			branches.add(bds.getBranchName());

		}

		System.out.println(branches);

		List<String> distinctBranches = branches.stream().distinct().collect(Collectors.toList());

		System.out.println("List of Distinct Branches" + distinctBranches);

	}

}

class BankDetails {

	int acctNo;
	String name;
	String bankName;
	String branchName;

	public BankDetails(int acctNo, String name, String bankName, String branchName) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.bankName = bankName;
		this.branchName = branchName;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
