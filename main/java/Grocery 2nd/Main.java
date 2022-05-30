import java.util.Scanner;

public class GroceryShop{

    private int AppleQuantity = 0;
    private int PearQuantity = 0;
    private int CherryQuantity = 0;
    Scanner sc  = new Scanner(System.in);


  
    public void Start() throws InterruptedException{

        boolean exit = false;
        String menu = "1-Fruit Distributor\n2-Grocery Store\n3-Exit";
        int item;
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-WELCOME TO GROCERY STORE PROGRAM _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        
        while (!exit) {

            System.out.println(menu);
            System.out.println("select an item please !");
            item = sc.nextInt();
            
            switch(item){

                case 1:
                    goToFruitDistributor();
                    break;
                
                case 2:
                    getOrderFromCustomer();
                    break;
                
                case 3:
                    exit = true;
                    System.out.print("exitting the program");
                    for(int i=0 ; i<3 ; i++){
                        System.out.print(".");
                        Thread.sleep(500);

                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("recheck item number please");
            }
        }

    }

    /**Fruit buying method **/ 

    public void goToFruitDistributor() throws InterruptedException{

        boolean BuyingItem = true;
        int item ;
        System.out.println(" Welcome ");
        String menu = "1-For Apple \n 2-For Pear\n 3- For Cherry\n 4- Exit";
        while(BuyingItem){

            System.out.println(menu);
            System.out.println(" pick your an item you would like to buy " )
			
			
            item = sc.nextInt();
			
// picking out the item 
            switch(item){
                case 1:
                    buyApple();
                    break;
                case 2:
                    buyPear();
                    break;
                case 3:
                    buyCherry();
                    break;
                case 4:
                    BuyingItem = false;
                    System.out.print("You Are Quitting The Fruit Distributor");
                    for(int i=0 ; i<3 ; i++){
                        System.out.print(".");
                        Thread.sleep(500);

                    }
                    System.out.println();
                    break;
                default:
                System.out.println("an error occured try again please") ;
            }

        }
    }




    /** ordering method **/ 
	

    public void getOrderFromCustomer() {

        String menu = "1-Apple\n2-Pear\n3-Cherry\n4-Exit";
        boolean BuyingItem = true;
        int item;
        System.out.println("Welcome");
		
		
        while(BuyingItem){

            System.out.println(menu);
            System.out.println("choose your item please");
            item = sc.nextInt();

            switch(item){
                case 1:
                    buyAppleFromStore();
                    break;
                case 2:
                    buyPearFromStore();
                    break;
                case 3:
                    buyCherryFromStore();
                    break;
                case 4:
                    BuyingItem = false;
                    break;
                default:
                System.out.println("Please chosse the item correctly!");
            }
        }
    }

   /** buying Fruits **/

    private void buyApple(){

        System.out.println("put the number you would like to buy please");
        int AppleNumber = sc.nextInt();
        this.AppleQuantity += AppleNumber;
        System.out.println("current number of apple is : "+getAppleQuantity());
        
    }

    private void buyCherry(){
        
        System.out.println("put the number you would like to buy please");
        int amountOfCherry = sc.nextInt();
        this.CherryQuantity += amountOfCherry;
        System.out.println("current number of cherry is: "+getCherryQuantity());
        
        
    }

    private void buyPear(){

        System.out.println("How much pear do you want to buy buy from distributor?");
        int amountOfPear = sc.nextInt();
        this.PearQuantity += amountOfPear;
        System.out.println("current number of pear is: "+getPearQuantity());
    }

    //Methos for bying Fruits from Grocery Store
    private void buyAppleFromStore(){

        System.out.println("put the number you would like to buy please");
        int AppleNumber = sc.nextInt();
        if(getAppleQuantity() >= AppleNumber){

            setAppleQuantity(AppleNumber);
            System.out.println("the order is recieved");
        }
        else{
            System.out.println("insufficient amount in the store ");
        }
        
    }

    private void buyCherryFromStore(){

        System.out.println("put the number you would like to buy please");
        int amountOfCherry = sc.nextInt();
        if(getCherryQuantity() >= amountOfCherry){

            setCherryQuantity(amountOfCherry);
            System.out.println("the order is recieved");
        }
        else{
            System.out.println("insufficient amount in the store");
        }
        
    }

    private void buyPearFromStore(){

        System.out.println("put the number you would like to buy please");
        int amountOfPear = sc.nextInt();
        if(getPearQuantity() >= amountOfPear){

            setPearQuantity(amountOfPear);
            System.out.println("the order is recieved");
        }
        else{
            System.out.println("insufficient amount in the store");
        }
        
    }

    /** getter & setter methods **/ 
	
    public int getAppleQuantity(){

        if(this.AppleQuantity < 0){
            this.AppleQuantity = 0;
        }
        return this.AppleQuantity;
    }
    public int getPearQuantity(){
        
        if(this.PearQuantity <0){
            this.PearQuantity = 0;
        }
        return this.PearQuantity;
    }
    public int getCherryQuantity(){

        if(this.CherryQuantity <0){
            this.CherryQuantity = 0;
        }
        return 
		
		this.CherryQuantity;
    }
    private void setCherryQuantity(int amount){

        this.CherryQuantity -= amount;
    }
	
    private void setAppleQuantity(int amount){

        this.AppleQuantity -= amount;
		
    }
    private void setPearQuantity(int amount){

        this.PearQuantity -= amount;
		
    }


}