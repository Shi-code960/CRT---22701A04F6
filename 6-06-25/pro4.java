class Main {
    public static void main(String[] args) {
       int[] a={2,9,18};
       int[] b={1,6,8,21,27};
       int[] c= new int[a.length+b.length];
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length){
           if(a[i]<b[j]){
               c[k]=a[i];
               k++;i++;
           }else{
               c[k]=b[j];
               k++;
               j++;
           }
       }
       while(i<a.length){
           c[k]=a[i];
           k++;
           i++;
       }
        while(j<b.length){
           c[k]=b[j];
           k++;
           j++;
    }
    for(k=0;k<c.length;k++){
    System.out.println(c[k]+" ");
    }
}
}