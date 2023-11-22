
//many methods and instances

public class oren {
    private String girlFriend;
    
    public oren(String name){ //constructor
        girlFriend = name;
    }


    public void setName(String name){ //method pertama
        girlFriend = name;
    }
    
    public String getName(){ //method kedua
        return girlFriend;
    }

    public void SimpleMessage(){ //method ke tiga 
        //kalau public, mana-mana class boleh guna variable 
        //kalau private, hanya method dalam class je boleh guna
        System.out.printf("my first girlfriend is %s", getName());
    }

}
//%s untuk string %d untuk nombor


//constructor - constuctor boleh di buat dengan cara nama constructor kena sama
//dengan nama class


