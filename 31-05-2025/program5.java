class Main {
    public static void main(String[] args) {
      
       
        student s1=new student("siri","22701a06","ece",3,'v');
        System.out.println(s1.name);
         System.out.println(s1.roll);
              System.out.println(s1.branch);
             System.out.println(s1.year);
        System.out.println(s1.section);
    }
}
 class student {
   String name="siri";
   String roll="22701a06";
   String branch="ece";
   int year=3;
   char section='v';
   student(String name,String roll,String branch  ,int year,char section){
       this.name=name;
       this.roll=roll;
       this.branch=branch;
       this.year=year;
       this.section=section;
   }
 
}
