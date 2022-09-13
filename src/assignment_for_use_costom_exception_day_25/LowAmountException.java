//TODO: How to MESSAGE pass in Custom Exception

package assignment_for_use_costom_exception_day_25;

public class LowAmountException extends  Exception{

    public LowAmountException(String msg){
        super(msg);
    }
}
