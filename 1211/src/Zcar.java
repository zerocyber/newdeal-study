class Zcar{
    private String color;
    private String geartype;
    private int door;
    
    Zcar(){
        this.color = "red";
        this.geartype = "auto";
        this.door = 4;
        System.out.println("default constructor");
        System.out.println(    this.color + "/" + this.geartype + "/" + this.door);
    }
    Zcar(String color , String geartype , int door){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");
        System.out.println(    this.color + "/" + this.geartype + "/" + this.door);
    }
    
    public static void main(String[] args) {
	
    	Zcar a = new Zcar();
    	
	}
}

