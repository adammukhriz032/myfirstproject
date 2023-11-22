public class oren {
    private String girlFriend;
    
    public void setName(String name){
        girlFriend = name;
    }
    
    public String getName(){
        return girlFriend;
    }

    public void SimpleMessage(){
        //kalau public, mana-mana class boleh guna variable 
        //kalau private, hanya method dalam class je boleh guna
        System.out.printf("my first girlfriend is %s", getName());
    }

}
//%s untuk string %d untuk nombor