/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.ans1;



class Time{
    private int hour;
    private int min;
    private int sec;
    
    public Time(int hr, int mi, int se){
        hour=hr;
        min=mi;
        sec=se;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    
    
    
    
    
    public void add(Time t){
        
        
        this.sec= this.sec+ t.getSec();
        if(this.sec>59)
        {
            this.min++;
            this.sec=this.sec-60;
        }
        
        this.min=this.min+ t.getMin();
        
        if(this.min>59)
        {
            this.hour++;
            this.min=this.min-60;
        }
        
        this.hour=this.hour + t.getHour();
        
        if(this.hour>24)
        {
            this.hour=this.hour-24;
           
        }
        System.out.println("sum = "+this.hour+":"+this.min+":"+this.sec);
        
        
        
    }
}


public class OopsAns1 {

   
    public static void main(String[] args) {
        Time t1 = new Time(22,20,50);
        Time t2 = new Time(3,40,15);
        t1.add(t2);
        
    }
    
}
