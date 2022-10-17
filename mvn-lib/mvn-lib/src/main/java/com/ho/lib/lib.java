package main.java.com.ho.lib;

public class lib {
    private String name = "";
    private String msg = "";

    public lib(String name, String msg){
        this.name= name; 
        this.msg = msg;
    }

    public String getMessage(){

        return "Hello" + this.name + "@@2"+this.msg ;
    }

    @Override
    public String toString(){
        return "NAME " + this.name +  " MSG: " + this.msg;
    }

}
