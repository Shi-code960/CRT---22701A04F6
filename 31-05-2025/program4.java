public class Main {
    public static void main(String[] args) {
       
        Teacher t1=new Teacher("t.sunanda","t6t66","ece","m.tech",new String [] {"c","java","python"});
        t1.details();
    }
}
public class Teacher {
   String name;
   String id;
   String[]subjects;
   String dept;
   String qualification;
   Teacher(String name,String id,String dept,String qualification,String[]subjects){
       this.name=name;
       this.id=id;
       this.dept=dept;
       this.qualification=qualification;
       this.subjects=subjects;
   }
   void details(){
       System.out.println("---------");
       System.out.println("Teacher name:"+name);
       System.out.println("Teacher id :"+id);
       System.out.println("department:"+dept);
       System.out.println("qualification:"+qualification);
       System.out.println("subjects");
       for(String subject: subjects){
       System.out.println(subject+" ,");
       }
      System.out.println();
      System.out.println("------------");
   }
        
        
    
}