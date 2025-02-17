class Product
{
public static void main(String args[])
	{
        Demo c1=new Demo();
           int result=c1.Total(40,5);
             System.out.println("total amount  "+result);
           double result2=c1.Percentage(result);
              System.out.println("total after the discount amount   "+result2); 
             double result3=c1.Gst(result2);
                  System.out.println("total after the Gst amount   "+result3);
      
        } 
}

class Demo
 {
    
  int Total(int price,int quantity)
           {
             String name="pen";
              int total= price*quantity;
               System.out.println(name);
               return total;          
	    }
          
     double Percentage(int total)
              {
               double  discount=30,discount2=0,tprice=0;
                        discount2=discount/100*total;
                      tprice=total-discount2;
                     
                  return tprice;
                
               }
      double Gst(double total2)
                {
                  double pgst=18,tprice2=0;
                  double per2=0;
                     per2=pgst/100*total2;
                     tprice2=total2+per2;
                    return tprice2;
                 
                 }

         
 }
