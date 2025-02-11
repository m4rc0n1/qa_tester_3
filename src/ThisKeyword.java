public class ThisKeyword {

    static class Employee{
        String ad;
        int yash;

        public boolean additionalTaxApplied(int yash){
            if(this.yash>=yash)return true;
            else return false;
        }
    }

    public static void main(String[] args) {
       Employee emp1 = new Employee();
       emp1.yash =25;

       System.out.println(emp1.additionalTaxApplied(26));
    }
}
