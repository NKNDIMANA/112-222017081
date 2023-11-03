 class INTEREST {//class declaration
  public  double calc(double r,double c,double y){//create method declaration
return (c*r*y);//something to be returned
  }
}
   class objects{ 
  public static void main(String[] args) {
INTEREST mySI=new INTEREST();//create object
double result=mySI.calc(100000,0.05,5);//use the product method to multiply
System.out.println("result:"+result); //code to be executed
  } 
}
 