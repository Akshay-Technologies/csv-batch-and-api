package com.example.demo.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Policy;

import java.util.List;

public interface CustomerService {
   public List<Customer>  getCustomers();


 public   Customer getCustomer(int customerId);

   public  List<Customer> getNewDetails();

   public String deleteById(int id);

    public  List<Customer> getmaximum();

   public  List<Customer> getAll();


    public String updatePolicyCount();
    public String updatePolicyPremiumAmount();


   

    // void updateCustomer(Customer customer, int customerId);





    /*  @Override
          public List<Customer> updateById(int id) {
              Customer c =null;
              for(Customer customer:list){
                  if(customer.getcustomerId()==customerId())


              }
              return null;
          }*/
}
