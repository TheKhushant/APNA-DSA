public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        int i=1;
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
            System.out.println(i + ")"+sb);    i++;
        }
        
    }
}
