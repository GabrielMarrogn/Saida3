public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            if(i == 1 || i == 7){
                for(int k = 0;k < 39; k++){
                    System.out.print("-");
                }
            }else if(i == 3 || i ==5 ){
                for(int k = 1;k <= 39; k++){
                    if(k == 1 || k == 39){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }
            }else if(i == 2){
                for(int k = 1;k <= 34; k++){
                    if(k == 1 || k == 34){
                        System.out.print("|");
                    }else if(k == 2){
                        System.out.print("x = 35");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }else if(i == 4){
                for(int k = 1;k <= 34; k++){
                    if(k == 1 || k == 34){
                        System.out.print("|");
                    }else if(k == 17){
                        System.out.print("x = 35");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }else if(i == 6){
                for(int k = 1;k <= 34; k++){
                    if(k == 1 || k == 34){
                        System.out.print("|");
                    }else if(k == 33){
                        System.out.print("x = 35");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
