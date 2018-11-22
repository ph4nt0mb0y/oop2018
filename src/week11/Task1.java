package week11;

public class Task1 {
    public static<T extends Comparable> void Sort(T[] a){
        T b;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j].compareTo(a[j+1])>0) {
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
    }

    public static void main(String[] args) {
        Byte[] bytes = {1,2,4,3};
        Short[] shorts = {12,21,46,35};
        Integer[] integers = {2,25,41,63};
        Long[] longs = {21L,32L,14L,53L};
        Float[] floats = {1.5f,12.1f,42.5f,31.6f};
        Double[] doubles = {12.6,21.1,41.2,33.1};
        Character[] characters = {'a','g','c','d'};
        System.out.println("Mảng trước khi sắp xếp:");
        for(int i=0;i<characters.length;i++){
            System.out.print(characters[i]+"\t");
        }
        Sort(characters);
        System.out.println("\nMảng sau khi sắp xếp:");
        for(int i=0;i<characters.length;i++){
            System.out.print(characters[i]+"\t");
        }
    }
}
