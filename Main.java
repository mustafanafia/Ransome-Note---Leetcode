import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Main o = new Main();
        System.out.println(o.canConstruct("I need money tonight", "I want and need money tonight yes yes"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int pt1 = 0;
        int pt2 = 0;

        System.out.println(a);
        System.out.println(b);


        while (pt1 < a.length && pt2 < b.length) {

            if (a[pt1] == b[pt2]) {
                pt1++;
                pt2++;
            } else {
                pt2++;
            }

        }
        return (pt1 == a.length);

    }
}




  /*
      public boolean canConstruct(String ransomNote, String magazine) {

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);


        int count  = 0;

    for(int i = 0; i < a.length && i < b.length; i++){

        if(ransomNote.charAt(count) == magazine.charAt(i)){
            count++;
        }
    }

    if(count == ransomNote.length()){
        return true;
    }
    else{
        return false;
    }

  }
   */
