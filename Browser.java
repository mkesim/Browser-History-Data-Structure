import java.util.*; 
import java.util.Stack;

public class Browser {
    
    public static void main(String[] args) {
           List<String> urls = Arrays.asList("facebook.com*mehmet.com+google.com-kesimalioglu.com/youtube.com".split("[\\*+/-]"));

        Stack<String> browsing = new Stack<String>();
    for(String str : urls)
        browsing.add(str);
        
        

        System.out.println("Browsing History " + browsing);
        System.out.println();

        
        while (!browsing.empty()) {
    String lastvisit = browsing.pop();  
    System.out.println("lastvisit " + lastvisit);
    System.out.println("Browsing History " + browsing);
    System.out.println();
}

    }
    
}
