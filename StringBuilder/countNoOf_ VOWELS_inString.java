public class TRYAL2 {
    public static int compressString(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch == 'e' || ch == 'i' || ch=='o' || ch=='u'){
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String str = "a e i o u abcdefghijklmnopqrstuvwxyz";
       System.out.println(compressString(str));
    }
}
