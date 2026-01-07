package com.loanbuddy;

//creating IApprovable interface
public interface IApprovable {

	boolean approveLoan(Applicant applicant);
    double calculateEMI(double principal);

}
