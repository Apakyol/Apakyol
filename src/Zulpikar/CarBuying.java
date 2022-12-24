package Zulpikar;

public class CarBuying {
    public static void main(String[] args) {
        int budget = 10000;
        String usage = "";

        switch (usage){
            case "business":
                if(budget < 10000){
                    System.out.println("buy Ford Transit");
                }else {
                    System.out.println("Buy Mercedes vito");
                }

            case "personal":
                if (budget < 10000){
                    System.out.println("buy fiat punto");
                }else{
                    System.out.println("buy ford focus");
    }


            }
    }


}
