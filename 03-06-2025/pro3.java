class Main {
    public static void main(String[] args) {
       Game g=new Game("ludo","fun",46);
       g.play();
       g.summary();
    }
}
class Game{
    String title;
    String zonar;
    float rating ;
    int playcount=0;
    Game(String title,String zonar,float rating){
        this.title=title;
        this.zonar=zonar;
        this.rating=rating;
        this.playcount=playcount;
    }
    boolean type(){
        if(zonar!="horror"){
            return true;
        }
        else
            return false;
    }
        int play(){
            playcount++;
            return playcount;
        }
        
        void summary(){
            System.out.println(title);
            System.out.println(zonar);
            System.out.println(playcount);
            System.out.println(type()?"family friendly":"not");
            System.out.println(rating);
            
            
        }
    }
