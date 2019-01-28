package projekt1;

import java.util.ArrayList;

public class DataBase {

        private static ArrayList<Product> productsList;
        private Product product;
        private Customer customer;
        private static ArrayList<Customer> customersList;

        public DataBase(Product product, Customer customer){
            this.customer = customer;
            this.product = product;
        }

        public DataBase (){

            productsList = new ArrayList<Product>();
            customersList = new ArrayList<Customer>();
        }

        public void setCustomersList (Customer addCustomer){

            customersList.add(addCustomer);
        }

        public void setProductsList (Product addProduct){

            productsList.add(addProduct);
        }


        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }


        @Override
        public String toString() {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Customer List: \n");
            int size= customersList.size();
            for (int i =0;i < size; i++) {
                stringBuilder.append(customersList.get(i)).append("\n");
            }
            stringBuilder.append("Products List: \n");

            int size2= productsList.size();
            for (int p = 0; p < size2; p++) {
                stringBuilder.append(productsList.get(p)).append("\n");
            }

            return   stringBuilder.toString();
        }
    }
