import java.util.*; 
import java.util.LinkedList; 
import java.util.Queue;      

public class Kuyruk 
{
    public static void main(String[] args) 
    {
        List<String> urls = Arrays.asList("facebook.com*mehmet.com+google.com-kesimalioglu.com/youtube.com".split("[\\*+/-]"));

        Queue<String> kuyruk = new LinkedList<String>();
        

        
            for(String str : urls)    //urls listesini dongu kullanarak .add yöntemiyle kuyruğa ekleme
        kuyruk.add(str);

        System.out.println("Kuyruk Yapisi : " + kuyruk); 

         String browser = kuyruk.remove();          //.remove ile kuyruktan eleman silme ıslemı
         System.out.println("Kuyruktan Silindi : " + browser );
         System.out.println(kuyruk);
                  

      browser= kuyruk.poll();   //.poll ile kuyruktan eleman silme alternatifi 
      System.out.println("2. yontem ile kuyruktan Silindi  : " + browser );
      System.out.println(kuyruk);  
    }
}
