public class Fan {
    int speed = 1;
    String speedS;
    int radius = 5;
    String color = "blue";
    boolean status = false;

    public Fan(int speed,int radius,String color){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed(){
        return this.speed;
    }
    public int getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getStatus(){
        return this.status;
    }
    public String toString(){
        switch (speed){
            case 1:
                speedS = "Slow";
                break;
            case 2:
                speedS = "Medium";
                break;
            case 3:
                speedS = "Fast";
                break;
        }
        if (this.status)
            return "Fan is on, speed: " + this.speedS + ", radius: " + this.radius + ", color: " + this.color;
        else
            return "Fan is off, radius: " + this.radius + ", color: " + this.color;
    }

    public void setSpeed(int s){
        this.speed = s;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public void setColor(String c){
        this.color = c;
    }
    public void on(){
        this.status = true;
    }
    public void off(){
        this.status = false;
    }

}
