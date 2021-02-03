class Fraction{
    
    //instance variables / fields
    private int num,denom;
    
    
    public Fraction(){
       this.num=1;
       this.denom=2;
       
  }
       
     public Fraction(int nun, int denom){
        this.num=num;
        if(denom==0){
         System.out.println("0 in denom");
         this.denom=1;
    }
    else{ this.denom=denom; }
}


public Fraction(String str){
 }




public Fraction(Fraction f){
    this.num=f.num;
    this.denom=f.denom;
    



}


public int getNum(){
    
    return this.num;
    }

public int getDenom(){
    
    return this.denom;
    }

public double toDouble(){
        
        return (double) num/denom;
    }
    
    public String toString(){
return this.num + "/" + this.denom;
}

public void setNum(int num){

this.num=num;
    }

public void setDenom(int denom){
    if(denom!=0) this.denom=denom;
    
}

}
