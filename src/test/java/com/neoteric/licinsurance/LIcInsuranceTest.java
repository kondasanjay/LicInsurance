package com.neoteric.licinsurance;

import com.neoteric.licinsurance.model.Address;
import com.neoteric.licinsurance.model.LicInsurance;
import com.neoteric.licinsurance.model.PlanType;
import com.neoteric.licinsurance.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LIcInsuranceTest {


    @Test

    public void test(){


        LicInsurance customer1=new  LicInsurance();

        customer1.FullName="sanjay";
        customer1.Dob=22-2-2000;
        customer1.age=22;
        customer1.Gender="male";
        customer1.MaritalStatus="yes";
        customer1.AnnualIncome=223333;
        customer1.PhoneNumber=9988776655l;
        customer1.EmailId="sanjay.konda24@gmail.com";
        customer1.Price=2222;


        customer1.NomineName="rahul";
        customer1.NomineNameDob=22-2-2002;
        customer1.NomineNameGender="male";



        customer1.EmployeName="raju";
        customer1.PlanType="basic";

        customer1.PreExistingCondition=true;
        customer1.PaymentDetails="UPI via";

        Address address=new Address();

        address.StreetName = "manasa nagar";
        address.Area = "busstand backside";
        address.City = "suryapet";
        address.District = "suryapet";
        address.PinCode = 232222;


        Service service=new Service();

        PlanType planType=service.getPlanType(customer1);

        Assertions.assertEquals(2222,customer1.Price);
        Assertions.assertNotNull(planType);






    }

}
