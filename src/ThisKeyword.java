public class ThisKeyword {

     class Employee{
        String ad;
        int yash;
        //instance variableni clasa gelen variablden ayird etmek ucun lazimdir
        public boolean ishleyeBiler(int yash){
            if(this.yash>yash) {
                System.out.println(ad + " ishleye biler");
                return true;
            }else{
                System.out.println(ad + " ishleye bilmez");
                return false;
            }
        }
    }

    public static void main(String[] args) {
       ThisKeyword th1 = new ThisKeyword();
       Employee emp1 = th1.new Employee();
       emp1.yash =17;
       boolean ishleyeBiler=emp1.ishleyeBiler(18);
        System.out.println(ishleyeBiler);

//       System.out.println(emp1.additionalTaxApplied(26));
    }
}
