import java.util.*;
public class CinemaFee { 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double local = 210;
       double foreign = 240;
       double total,total1,pax,discounted,finaltotal,free,total3;
       double discount = 0.30;      
       System.out.println("A. Local (210)");
       System.out.println("B. Foreign (240)");
       System.out.print("Enter Choice :");
       String choice = input.next();  
       if(choice.equals("A") || choice.equals("a")){
       	System.out.print("Enter Pax :");
       	pax = input.nextDouble();
       	if(pax >=1 && pax <=4){
       		total  = pax * local;
       		System.out.print("Your fee is  : " + total);      		
       		}
       		else if(pax >=5 && pax <=7){
       			total1 = pax * local;
       			discounted = total1 * discount;
       			finaltotal = total1 - discounted;
       			System.out.print("Your fee is  : " + finaltotal);    			
       			}
       			else{
       				free = pax - 2;
       				total3 = free * local;
       				System.out.print("Your fee is  : " + total3);
       				}      	
       	}// end of local cinema fee
       	
       	else if(choice.equals("B") || choice.equals("b")){
       		System.out.print("Enter Pax :");
       	pax = input.nextDouble();
       	if(pax >=1 && pax <=4){
       		total  = pax * foreign;
       		System.out.print("Your fee is  : " + total);      		
       		}
       		else if(pax >=5 && pax <=7){
       			total1 = pax * foreign;
       			discounted = total1 * discount;
       			finaltotal = total1 - discounted;
       			System.out.print("Your fee is  : " + finaltotal);    			
       			}
       			else{
       				free = pax - 2;
       				total3 = free * foreign;
       				System.out.print("Your fee is  : " + total3);
       				}      	
       		
       		}
       		else{
       				System.out.print("INVALID");
       			}
       	
       
    }
}
