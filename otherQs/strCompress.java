class strCompress{
    public static void main(String[] args){
        char[] chars = {'a','a','a','b','b','b','c','c','d'};
        int write = 0;
        int i = 0;

        while(i<chars.length){
            char ch = chars[i]; 
            int count = 0;
            while(i<chars.length && chars[i] == ch){
                count++;
                i++;
            }

            chars[write] = ch;
            write++;

            if(count>1){
                String num = String.valueOf(count);
                for(int j=0;j<num.length(); j++){
                    chars[write] = num.charAt(j);
                    write++;
                }
            }

        }
        System.out.println(write);
    }
}