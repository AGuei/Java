public class score {
    public static void main(String[] args) {
        int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i, count = 0;
        int over90 = 0;
        int betw75and89 = 0;
        int betw60and74 = 0;
        int under60 = 0;        
        for(i=0;i<10;i++){
            if(score[i]>=90){
                over90++;
            }
            else if(score[i]>=75 && score[i] <90){
                betw75and89++;
            }
            else if(score[i]>=60 && score[i] <75){
                betw60and74++;
            }
            else{
                under60++;
            }
        }
        System.out.println("90+:" + over90 + "  75-89:" + betw75and89 +
                           "  60-74:" + betw60and74 + "  under60:" + under60);                
    }
}