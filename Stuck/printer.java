
public class printer {
    ArrayStack Papers;
    
    public printer(){
        Papers = new ArrayStack (100);
    }
    
    public void addPaper(int page){
        for (int i = 1; i <= page; i++) {
            Papers.push(i);
        }
    }
    
    public void printDocument(){
        while(Papers.size()!= -1){
            System.out.println(Papers.pop());
        }
    }
}
