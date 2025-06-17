class Main {
    public static void main(String[] args) {
        Movie m=new Movie("dj",9.9f,"2h45m");
        m.details();
    }
}
class Movie{
    String name;
    String duration;
    float rating;
    Movie(String name,float rating,String duration){
        this.name=name;
        this.rating=rating;
        this.duration=duration;
    }
    boolean Hit(){
        if(rating>=9){
            return true;
        }    
        else 
            return false;
    }
        void details(){
            
            System.out.println(name);
            System.out.println(rating);
            System.out.println(duration);
            System.out.println(Hit()?"hit":" ");
        }
    
}