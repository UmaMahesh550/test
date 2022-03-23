package com.company.capgemini.pack.March09;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Donor dn = new Donor();
        System.out.println("Enter the name : ");
        String name=sc.nextLine();
        dn.setName(name);
        System.out.println("Enter Date Of Birth : ");
        String dob=sc.nextLine();
        dn.setDateOfBirth(dob);
        System.out.println("Enter Gender : ");
        String gn=sc.nextLine();
        dn.setGender(gn);
        System.out.println("Enter Mobile Number : ");
        String mobile=sc.nextLine();
        dn.setMobileNumber(mobile);
        System.out.println("Enter Blood Group : ");
        String bg=sc.nextLine();
        dn.setBloodGroup(bg);
        System.out.println("Enter Blood Bank Name : ");
        String bbName=sc.nextLine();
        dn.setBloodBankName(bbName);
        System.out.println("Enter Donor Type : ");
        String dt=sc.nextLine();
        dn.setDonortype(dt);
        System.out.println("Enter Donation Date : ");
        String dd=sc.nextLine();
        dn.setDonationDate(dd);
        dn.displayDonationDetails();
    }
}

class Person1
{
    private String name,dateOfBirth,gender,mobileNumber,bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}

class Donor extends Person1
{
    private String bloodBankName,donortype,donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonortype() {
        return donortype;
    }

    public void setDonortype(String donortype) {
        this.donortype = donortype;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }
    public void displayDonationDetails()
    {
        System.out.println("Donation Details:");
        System.out.println("Name : "+getName());
        System.out.println("Date Of Birth : "+getDateOfBirth());
        System.out.println("Gender : "+getGender());
        System.out.println("Mobile Number : "+getMobileNumber());
        System.out.println("Blood Group : "+getBloodGroup());
        System.out.println("Blood Bank Name : "+getBloodBankName());
        System.out.println("Donor Type : "+getDonortype());
        System.out.println("Donation Date : "+getDonationDate());
    }
}