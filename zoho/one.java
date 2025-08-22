class one{
    public static boolean isletter(char a){
        return (a>='a'&&a<='z')||(a>='A'&&a<='Z');
    }
    public static boolean isnumber(char a){
        return a>='0'&&a<='9';
    }
    public static void main(String[] args){
        String a="a1b2c34c3b2cb3a1d";
        String ans="";
        int l=a.length();
        int[] li=new int[10];
        for(int i=0;i<10;i++) {
            li[i]=-1; }

        for(int i=0;i<l;i++){
            if(isnumber(a.charAt(i))){
                li[a.charAt(i)-'0']=i; }} 
        for(int i=0;i<l;i++){
            boolean add=true;
            if(isletter(a.charAt(i))){
                for(int j=0;j<i;j++){
                    if(a.charAt(j)==a.charAt(i)){
                        add=false;
                        break;
                    }  }
            }
             else if(isnumber(a.charAt(i))){
                if(i!=li[a.charAt(i)-'0']){
                     add=false;
                }
            }
            if(add){
                 ans+=a.charAt(i);
            }
}
        System.out.println(ans);
    }
}
