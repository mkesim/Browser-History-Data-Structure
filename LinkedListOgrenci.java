import java.util.*;
public class LinkedListOgrenci {
     public static void main(String args[]) {

       /* LinkedList(Bagli liste tanimlama) */
       LinkedList<String> ogrencino = new LinkedList<>();

       /*Bagli listeye eleman ekleme*/
       ogrencino.add("202503211");
       ogrencino.add("112233445");
       ogrencino.add("789564123");
       ogrencino.add("123549788");
       ogrencino.add("785412545");

       /*Olusturulan listeyi gosterme(listeleme)*/
       System.out.println("Liste: " +ogrencino);

       /*Listenin basina ve sonuna ekleme*/
       ogrencino.addFirst("111111111"); //basaekle
       ogrencino.addLast("000000000"); //sonaekle
       
       System.out.println("Listenin basina ve sonuna ekleme:" +ogrencino);

       
       /*Ilk ve son elemani silme*/
       ogrencino.removeFirst();
       ogrencino.removeLast();
       System.out.println("Ilk ve son elemani silme:" +ogrencino);

       /*Belirlenen indise ekleme ve silme*/
       ogrencino.add(1, "110150213");
       ogrencino.remove(2);
       System.out.println("Belirlenen indise ekleme ve silme:" +ogrencino); 
       
        System.out.println("First index is : " + ogrencino.indexOf("789564123"));
        System.out.println("Last index is : " + ogrencino.lastIndexOf("789564123"));
        
        
            System.out.println(ogrencino.getFirst());/*ilk elemanı ara ve değerini getir*/
            System.out.println(ogrencino.getLast());/*son elemanı ara ve değerini getir*/
            System.out.println(ogrencino.get(2));/*belirli bir indisteki elemanı ara ve değerini getir*/

       Collections.reverse(ogrencino); /*reversing the list(listeyi tersine çevirir)*/
       System.out.println(ogrencino);
       
    LinkedList<String> ogrencino2 = new LinkedList<>(); /*ikinci bir liste eklendi*/
 ogrencino2.add("3211");
       ogrencino2.add("3445");
       ogrencino2.add("4123");
       ogrencino2.add("9788");
       ogrencino2.add("2545");
       ogrencino.addAll(ogrencino2); //merging lists(iki listeyi birleştirme)
       System.out.println(ogrencino);


} 

     }

