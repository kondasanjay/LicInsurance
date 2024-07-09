package com.neoteric.licinsurance.service;

import com.neoteric.licinsurance.model.LicInsurance;
import com.neoteric.licinsurance.model.PlanType;

public class Service {

    public PlanType getPlanType(LicInsurance customer){

        PlanType plantype=null;

        if(customer.age>6&&customer.age<70){

            plantype=new PlanType();

            plantype.Insurancename="LIC";
            plantype.policyNumber="526222";
            plantype.Price= customer.Price;

        }


        return plantype;

    }
}
