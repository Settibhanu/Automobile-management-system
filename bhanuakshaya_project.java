
/**
 * Write a description of class carautomobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.*;
 import java.io.*;
 import java.text.*;
class bhanuakshaya_project
{
    //Instance variables
    Scanner sn=new Scanner(System.in);
    String str;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int Bill_ctr=0;
    double GTotal=0;
    String Bill_Itemname[]=new String[50];
    double BillQty[]=new double[50];
    double BillRate[]=new double[50];
    double BillTotal[]=new double[50];
    //main method
    public  void main()throws IOException
    {
    
    int ch_main=0;
    //Opening sceen
    System.out.println("                                     GO Autombiles");
    System.out.println();
    System.out.println("                                 Computer Applications");
    System.out.println();
    System.out.println("                                       2020-2021");
    System.out.println();
     System.out.println("                  _..-------++._                           ");
    System.out.println("              _.-'/ |      _||  \"--._                          ");
    System.out.println("        __.--'`._/_\\j_____/_||___\\    `----.                 ");
    System.out.println("   _.--'_____    |          \\     _____    /");
    System.out.println(" _j    /,---.\\   |        =o |   /,---.\\   |_");
    System.out.println("[__]==// .-. \\==`===========/==// .-. \\=[__]     BY:      ");
    System.out.println("  `-._|\\ `-' /|___\\_________/___|\\ `-' /|_.'     Bhanu Akshaya");
    System.out.println("        `---'                     `---'              STD X 'C'");
    System.out.println();
    System.out.println("            Press Enter key to continue.....");
    str=sn.nextLine();
    //Printing the main menu
    do{
        try{
    System.out.println("\f           Main Menu");
    System.out.println("          ------------");
    System.out.println();  
    System.out.println(" =============================="); 
    System.out.println(" |1.Interior Accessories      |");
    System.out.println(" |2.Exterior Accessories      |");
    System.out.println(" |3.Miscellaneous Accessories |");
    System.out.println(" |4.Vehicle Parts             |");
    System.out.println(" |5.Generate the bill         |");
    System.out.println(" |6.Exit                      |"); 
    System.out.println(" =============================="); 
    System.out.println("Enter your choice");
    ch_main=Integer.parseInt(br.readLine());
    //Switch case for the main menu
    switch(ch_main)
    {
        case 1:
        
        
        Interior_accessories();
        break;
        
        case 2:
   
        Exterior_accessories();
        break;

       case 3:
        
        Misc_accessories();
        break;
        
        case 4:
        
        Vehicle_parts();
        break;
        
        case 5:
        Billing();
        break;
        
        case 6:
        System.out.println("\fThanks....Please visit again");
         System.out.println("Press enter key to Exit");
        str=br.readLine();
        System.exit(0);
        break;
        //Default error message
        default:
        System.out.println("Invalid choice");
        System.out.println("Press enter key and enter a valid choice");
        br.readLine();
        break;
    }
   }
   catch(NumberFormatException e)//Exception handling
   { System.out.println("Invalid choice...Re enter");
    System.out.println("Press Enter key to continue");
    str=br.readLine();
   }}
    while(ch_main!=6);
  }
  private void Interior_accessories()throws IOException
    {
        int ch_inter=0;
        double qty_inter;
       String itr[]={"Seat cover    ","Floor mats    ","Drink holders ","Arm rest      ","Storage units ","Steering cover"};
       int it[]={4000,3000,800,2000,2500,500};
       System.out.println("\f");
       //first submenu
       do{
           try{
        System.out.println("---------------------------");
        System.out.println("| GO Interior accessories |");
        System.out.println("|*************************|");
        System.out.println("|Name               Cost  |");
        System.out.println("|-------------------------|");
        System.out.println("|1.Seat cover      Rs 4000|");
        System.out.println("|2.Floor mats      Rs 3000|");
        System.out.println("|3.Drink holders   Rs  800|");
        System.out.println("|4.Arm rest        Rs 2000|");
        System.out.println("|5.Storage units   Rs 2500|");
        System.out.println("|6.Steering cover  Rs  500|");
        System.out.println("|                         |");
        System.out.println("|  0.Return to main menu  |");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
        ch_inter=Integer.parseInt(br.readLine());      
        if(ch_inter<0 || ch_inter>6)
        //Printing error message
        {
            System.out.println("Invalid choice");
            System.out.println("Press enter key and enter a valid choice");
            br.readLine();
        }
        else if(ch_inter!=0)
        {
            //Computing the bill for each selected item
         Bill_Itemname[Bill_ctr]=itr[ch_inter-1];
        BillRate[Bill_ctr]=it[ch_inter-1];
        System.out.println("Enter quantity");
        qty_inter=Integer.parseInt(br.readLine());
        System.out.println();
        System.out.println("Your item has been added to your cart");
        System.out.println("Press enter and Select your next choice");
        br.readLine();
        BillQty[Bill_ctr]=qty_inter;
        BillTotal[Bill_ctr]=BillQty[Bill_ctr]*BillRate[Bill_ctr];
        Bill_ctr++;
        
       }
      }catch(NumberFormatException e)//Exception handling
   { System.out.println("Invalid choice...Re enter");
    System.out.println("Press Enter key to continue");
    str=br.readLine();
   }
       System.out.println("\f");
    
   }
    while(ch_inter!=0);
       
       
    }
  private void Exterior_accessories()throws IOException
    {
        //Second sub menu
        String etr[]={"Spoilers      ","Bumpers       ","Car cover     ","Stickers      "};//names of the available items
        int et[]={6000,9000,3000,600};//rates of the available items
        int ch_exter=0;
        double qty_exter=0;
        do{
            try{
        System.out.println("\f -------------------------");
        System.out.println("| GO Exterior accessories |");
        System.out.println("|*************************|");
        System.out.println("|Name               Cost  |");
        System.out.println("|-------------------------|");
        System.out.println("|1.Spoilers        Rs 6000|");
        System.out.println("|2.Bumpers         Rs 9000|");
        System.out.println("|3.Car cover       Rs 3000|");
        System.out.println("|4.Stickers        Rs  600|");
        System.out.println("|                         |");
        System.out.println("|  0.Return to main menu  |");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
        ch_exter=Integer.parseInt(br.readLine());
       if(ch_exter<0 || ch_exter>4)
        //Displaying message for an invalid choice
        {
            System.out.println("Invalid choice");
            System.out.println("Press enter key and enter a valid choice");
            br.readLine();
        }
        else if(ch_exter!=0)
        {
            //Computing bill for each selected item
            Bill_Itemname[Bill_ctr]=etr[ch_exter-1];
        BillRate[Bill_ctr]=et[ch_exter-1];        
        System.out.println("Enter quantity");
        qty_exter=Integer.parseInt(br.readLine());
         System.out.println("Your item has been added to your cart");
        System.out.println("Press enter and Select your next choice");
        br.readLine();
        BillQty[Bill_ctr]=qty_exter;
        BillTotal[Bill_ctr]=BillQty[Bill_ctr]*BillRate[Bill_ctr];
        Bill_ctr++;
       }
       }catch(NumberFormatException e)//Exception handling
   { System.out.println("Invalid choice...Re enter");
    System.out.println("Press Enter key to continue");
    str=br.readLine();
   }
       System.out.println("\f");
    }while(ch_exter!=0);
    
    }
  private void Misc_accessories()throws IOException
    {
        //Third sub menu
        String msc[]={"Ac            ","Gps           ","Stereo        ","Paint         ","Horn          "};//storing the items
        int ms[]={9000,5000,8000,7500,800};//Storing the rates of available items
        int ch_Misc=0;
        double qty_Misc=0;
        do{
            try{
        System.out.println("\f -------------------------");
        System.out.println("| GO Misc. accessories    |");
        System.out.println("|*************************|");
        System.out.println("|Name               Cost  |");
        System.out.println("|-------------------------|");
        System.out.println("|1.AC              Rs 9000|");
        System.out.println("|2.GPS             Rs 5000|");
        System.out.println("|3.Stereo          Rs 8000|");
        System.out.println("|4.Paint           Rs 7500|");
        System.out.println("|5.Horn            Rs  800|");
        System.out.println("|                         |");
        System.out.println("|  0.Return to main menu  |");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
        ch_Misc=Integer.parseInt(br.readLine());
       if(ch_Misc<0 || ch_Misc>5)
        //Printing a message for an invalid choice
        {
            System.out.println("Invalid choice");
            System.out.println("Press enter key and enter a valid choice");
            br.readLine();
        }
        else if(ch_Misc!=0)
        {
            Bill_Itemname[Bill_ctr]=msc[ch_Misc-1];
        BillRate[Bill_ctr]=ms[ch_Misc-1];        
        System.out.println("Enter quantity");
        qty_Misc=Integer.parseInt(br.readLine());//storint the quantity of items
        System.out.println("Your item has been added to your cart");
        System.out.println("Press enter and Select your next choice");
        br.readLine();        
        BillQty[Bill_ctr]=qty_Misc;
        BillTotal[Bill_ctr]=BillQty[Bill_ctr]*BillRate[Bill_ctr];//computing the bill for an item
        Bill_ctr++;
       }
       }catch(NumberFormatException e)//Exception handling
   { System.out.println("Invalid choice...Re enter");
    System.out.println("Press Enter key to continue");
    str=br.readLine();
   }
       System.out.println("\f");
    }while(ch_Misc!=0);
       
    }
    private void Vehicle_parts()throws IOException
    {
        //Fourth sub menu
        String vps[]={"Tyre          ","Head lamps    ","Brake pads    ","Brake disc    ","Battery       "};//Storing the names of the items
        int vp[]={3000,7000,5500,4000,8000};//Storing the rates of available items
        int ch_vp=0;
        double qty_vp=0;
        do{
            try{
        System.out.println("\f -------------------------");
        System.out.println("|     GO Vehicle Parts    |");
        System.out.println("|*************************|");
        System.out.println("|Name               Cost  |");
        System.out.println("|-------------------------|");
        System.out.println("|1.Tyre           Rs  3000|");
        System.out.println("|2.Head lamp      Rs  7000|");
        System.out.println("|3.Brake pad      Rs  5500|");
        System.out.println("|4.Brake disc     Rs  4000|");
        System.out.println("|5.Battery        Rs  8000|");
        System.out.println("|                         |");
        System.out.println("|  0.Return to main menu  |");
        System.out.println("---------------------------");
        System.out.println("Enter your choice");
        ch_vp=Integer.parseInt(br.readLine());
        if(ch_vp<0 || ch_vp>5)
        //Displaying message for an invalid choice
        {
            System.out.println("Invalid choice");
            System.out.println("Press enter key and enter a valid choice");
            br.readLine();
        }
        else if(ch_vp!=0)
        {
            Bill_Itemname[Bill_ctr]=vps[ch_vp-1];
        BillRate[Bill_ctr]=vp[ch_vp-1];        
        System.out.println("Enter quantity");
        qty_vp=Integer.parseInt(br.readLine());
        System.out.println("Your item has been added to your cart");
        System.out.println("Press enter and Select your next choice");
        br.readLine();       
        BillQty[Bill_ctr]=qty_vp;
        BillTotal[Bill_ctr]=BillQty[Bill_ctr]*BillRate[Bill_ctr];
        Bill_ctr++;
       }}
       catch(NumberFormatException e)//Exception handling
   { System.out.println("Invalid choice...Re enter");
    System.out.println("Press Enter key to continue");
    str=br.readLine();
   }
       System.out.println("\f");
    }while(ch_vp!=0);
        
  }
  private void Billing()throws IOException
  {
      //BIlling method
      Date dat=new Date(); //To extract the date
      System.out.println("Enter customer name");
      String name=br.readLine();
      System.out.println("\f");
      System.out.println("GO Automobiles");
      System.out.println("--------------");
      System.out.println();
      System.out.println("Date and time of purchase: "+dat);//To display the date
      System.out.println("Customer name: "+name);//To display the customer's name
      System.out.println();      
      System.out.println("--------------------------------------------------------------------");
      System.out.println("Sl no       Itemname      Item rate        Item qty       Total");     
      System.out.println("--------------------------------------------------------------------"); 
      for(int i=0;i<Bill_ctr;i++)//Printing the bill
        {
            System.out.println("  "+(i+1)+"\t  "+Bill_Itemname[i]+" Rs "+BillRate[i]+"        \t"+BillQty[i]+"  \tRs "+BillTotal[i]);
            GTotal=GTotal+BillTotal[i];
        }
            double gst=GTotal*(0.18);//calculating gst
            GTotal=GTotal+gst;//Calculating the grand total
      System.out.println("===================================================================");
      System.out.println("                                          GST(18%)="+gst);
      System.out.println("                                          Grand Total=Rs "+GTotal); 
      System.out.println();
      System.out.println("                                 Thank you for shopping with us");
      System.out.println("                                             Please visit again");
      System.out.println();
      System.out.println("Press ENTER key to go back the main menu");
      str=sn.nextLine();
      {
          //reseting Bill_ctr and Gtotal to 0
      Bill_ctr=0;
      GTotal=0;
      return;
      }
     
    }
}
