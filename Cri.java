public class Cri{
    private double x, y;
         public void graf(){
            if(x>0){
                y=x*x-3*x;
            }else if(x==0){
                y=3;
            }else if(x<0){
                y=x-3;
            }
        } 
        public double getY(){
            return y;
        }
        public void setX(double xL){
            x=xL;
    }
}
