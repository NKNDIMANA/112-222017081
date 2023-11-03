class compound{//class declaration
    public  double calc(int i,int t,int r,int n){//methods declaration
        
        return (i*(math.pow(1+(r/1200)),n*t));//something to be returned
    }
}
class Aaa{//class declaration
    public static void main(String[] args) {//create an instance of the compound
        compound mycompound=new compound();//create object
        double result=mycompound.calc(500000,18,3,12);//calling method
        System.out.println("result:"+ result);//code to be executed
    }
}
 

    

