class Solution {
    public String reverseWords(String s) {
        
        String []words = s.split(" ");
        String reversedS = "";

        boolean t = false;

        for(int i=0;i<words.length;i++){
            if(t){
                reversedS += " ";
            }
            String word = words[i];
            char [] ch = word.toCharArray();
            int j = 0;
            int k = ch.length-1;
            while(j<k){
                char temp = ch[j];
                ch[j]=ch[k];
                ch[k]=temp;
                j++;
                k--;
            }

           for(char c : ch){
            reversedS += c;
           }
           t = true;

        }
        // reversedS += "";
        return reversedS;

    }
}