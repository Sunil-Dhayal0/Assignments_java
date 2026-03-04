class circle{
     
    int radius;
    double area;

    circle(int r){
        this.radius = r;
    }
    
    void calculate_area(){
        area = 3.14*radius*radius;
    }

    void print_area(){
         System.out.println("area of circle is : "+area);
    }
    
}

class calculate_area{
 
     public static void main(String[] args) {
        circle c1 = new circle(3);
         
        c1.calculate_area();
        c1.print_area();


     }
}