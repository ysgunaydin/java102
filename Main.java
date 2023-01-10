
public class Main {
    public static void main(String[] args){
        
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayisi : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayisi : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayisi : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        
         
        MyList<Integer> liste1 = new MyList<>();
        liste1.add(10);
        liste1.add(20);
        liste1.add(30);
        System.out.println("2. indisteki deger : " + liste1.get(2));
        liste1.remove(2);
        liste1.add(40);
        liste1.set(0, 100);
        System.out.println("2. indisteki deger : " + liste1.get(2));
        System.out.println(liste1.toString());
 
        
        MyList<Integer> liste2 = new MyList<>();
        System.out.println("Liste Durumu : " + (liste2.isEmpty() ? "Bos" : "Dolu"));
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);
        liste2.add(40);
        liste2.add(20);
        liste2.add(50);
        liste2.add(60);
        liste2.add(70);

        System.out.println("Liste Durumu : " + (liste2.isEmpty() ? "Bos" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste2.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste2.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste2.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste2.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste2.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 degeri : " + liste2.contains(20));
        System.out.println("Listemde 120 degeri : " + liste2.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste2.clear();
        System.out.println(liste2.toString());
    }
}
