public class LinearSearchExample
{
    public static int linearSearch(int []arr ,int key )
    { 
        for (int i=0;i<arr.length;i++){
        return i;
    }
    return -1;
    }
    public static void main (String[]args){
        int[]a1 = {10,20,30,40,50,70};
        int key = 50;
        LinearSearchExample I = new LinearSearchExample();
        I.linearSearch(a1,key);
       System.out.println(key +""+ "is found at index"+" "+ linearSearch(a1,key) );
        
    }
}
