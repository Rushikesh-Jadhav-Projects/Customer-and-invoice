package Customer_and_Invoice;

import java.util.*;
public class Main{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int id = sc.nextInt();
 String name = sc.next();
 int discount = sc.nextInt();
 int invoice = sc.nextInt();
 double amount = sc.nextDouble();
 Customer customer1 = new Customer(id, name, discount);
 Invoice invoice1 = new Invoice(invoice, customer1, amount);
 System.out.println("Invoice Id="+invoice+"Name:" + 
invoice1.getCustomerName()+"Discount:"+discount+"After Discount:" + 
invoice1.getAmountAfterDiscount());
 }
}
class Customer {
 private int id;
 private String name;
 private int discount;
 public Customer(int id, String name, int discount) {
 this.id = id;
 this.name = name;
 this.discount = discount;
 }
 public int getId() {
 return id;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public int getDiscount() {
 return discount;
 }
 public void setDiscount(int discount) {
 this.discount = discount;
 }
}
class Invoice {
 private int id;
 private Customer customer;
 private double amount;
 public Invoice(int id, Customer customer, double amount) {
 this.id = id;
 this.customer = customer;
 this.amount = amount;
 }
 public int getId() {
 return id;
 }
 public Customer getCustomer() {
 return customer;
 }
 public void setCustomer(Customer customer) {
 this.customer = customer;
 }
 public double getAmount() {
 return amount;
 }
 public void setAmount(double amount) {
 this.amount = amount;
 }
 public String getCustomerName() {
 return customer.getName();
 }
 public double getAmountAfterDiscount() {
 return amount - amount * customer.getDiscount() / 100;
 }
}
