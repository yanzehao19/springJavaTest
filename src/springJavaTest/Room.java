package springJavaTest;

public class Room {
	private String area = "100平米";  
	  
    //动作  
    public String say(){  
        return "my area is " +area;  
    }  
      
      
    public String getArea() {  
        return area;  
    }  
    public void setArea(String area) {  
        this.area = area;  
    }  
}
