package com.assesment.finalmethods;
import java.util.Scanner;

public class SettersAndGetters {
	String name;
	double admissionNumber;
	double physicsMark;
	double chemistryMark;
	double mathematicsMark;
	double marksum;
	double percentage;
	String physicsGrade;
	String chemGrade;
	String mathGrade;
	
	
	public SettersAndGetters() {
		
	}
	public SettersAndGetters(double admissionNumber,double physicsMark,double chemistryMark, double mathematicsMark,String name,double marksum,double percentage,String physics1Grade,String chem1Grade,String math1Grade) {
		this.admissionNumber=admissionNumber;
        this.name=name;
		this.physicsMark=physicsMark;
		this.chemistryMark=chemistryMark;
		this.mathematicsMark=mathematicsMark;
		this.marksum=marksum;
		this.physicsGrade=physics1Grade;
		this.chemGrade=chem1Grade;
	    this.mathGrade=math1Grade;
	    this.percentage=percentage;
	}
	
    public void setName(String name) {
		this.name=name;
    }
    public void setAdmission(double admissionNumber) {
    	this.admissionNumber=admissionNumber;
    }
    public void setPhysicsMark(double physicsMark) {
    	this.physicsMark=physicsMark;
    	
    }
    public void setChemistryMark(double ChemistryMark) {
    	this.chemistryMark=ChemistryMark;
    	
    }
    public void setMathematicsMark(double mathematicsMark) {
    	this.mathematicsMark=mathematicsMark;
    	
    }

    public void setPhysicsGrade(String physics1Grade) {
    	this.physicsGrade=physics1Grade;
    }
    public void setchemGrade(String chem1Grade) {
    	this.chemGrade=chem1Grade;
    }
    public void setMathGrade(String math1Grade) {
    	this.mathGrade=math1Grade;
    }
    public void setTotalMark() {
    	this.marksum= this.physicsMark+ this.chemistryMark + this.mathematicsMark ;
    }
    public void setPercentage() {
    	this.percentage=(this.marksum/300)*100;
    }
    public String getName() {
    	return name;
    }
    public double getAdmission() {
    	return admissionNumber;
    }
    public double getphysicsMark() {
    	return physicsMark;
    }
    public double getchemistryMark() {
    	return chemistryMark;
    }
    public double getmathematicsMark() {
    return mathematicsMark;
    }
    public double getMarkSum() {
   return marksum;
    }
    public double getPercentage() {
    	return percentage;
    }
    public  String getPhysicsGrade() {
    	return physicsGrade;
    }
    public String getChemsitryGrade() {
    	return chemGrade;
    }
    public String getMathGrade() {
    	return mathGrade;
    }
  
}
