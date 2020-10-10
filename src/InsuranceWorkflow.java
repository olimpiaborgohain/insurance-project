import com.vriyya.alcautomation.ClaimRequest;
import com.vriyya.alcautomation.Customer;
import com.vriyya.alcautomation.Manager;
import com.vriyya.alcautomation.Surveyor;

public class InsuranceWorkflow {
    boolean submitClaim(Customer customer)
    {
        System.out.println("Customer name " +customer.getName());
        //System.out.println(" Cus");

        ClaimRequest myClaimRequest = customer.getClaimRequest();

        int requestId =  myClaimRequest.getClaimRequestId();
        double claimAmount = myClaimRequest.getClaimAmount();

        //System.out.println("Claimed Request Id =  " + customer.getClaimRequest());
        //System.out.println("Claimed amount  =  " +customer.getClaimAmount());

        return true;
    }
    String assignSurveyorToManager( Manager manager, Surveyor surveyor){

    return " ";
    }
    boolean doSurvey( Manager manager, Customer customer, ClaimRequest claimRequest){

        return true;
    }
    boolean isClaimAccepted(){

    return true;
    }


}
