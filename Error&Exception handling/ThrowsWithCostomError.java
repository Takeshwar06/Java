

class AgeException extends Exception{
    public String toString(){
        return super.toString();
    }

    public String getMessage(){
        return "age less then 18";
    }
}

 public class ThrowsWithCostomError {

    public static boolean isDrive(int age) throws AgeException{  // your costome exception throws
        if(age<18){
            throw new AgeException();
           
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("Throws with costome error");
            
        try {
            isDrive(2);
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    
}
