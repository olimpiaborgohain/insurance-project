import com.vriyya.alcautomation.ClaimRequest;
import com.vriyya.alcautomation.Customer;

public class Main {
    public static void main(String[] args){

        ClaimRequest claimRequest1 = new ClaimRequest();

        claimRequest1.setClaimRequestId(22);
        claimRequest1.setClaimAmount(433200);


        Customer customer1 = new Customer();

        customer1.setId(1);
        customer1.setName("Olimpia");
        customer1.setAddress("ganeshguri");
        customer1.setPNo(2768);
        customer1.setEmailId("abc@gmail.com");





    }


}
