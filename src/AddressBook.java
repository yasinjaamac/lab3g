import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> b;
    public AddressBook(){
        b = new ArrayList<>();

    }
    public void addBuddy(BuddyInfo bud){
        if(bud != null){
            b.add(bud);
        }
    }
    public BuddyInfo removeBuddy(int I){
        if(I >= 0 && I < b.size()){
            return b.remove(I);
        }
        return null;
    }

 public void test( ){

 }
    public static void main (String[] args) {
        BuddyInfo j = new BuddyInfo("colonel", " jaamac", 4484848);
        AddressBook adbook = new AddressBook();
        adbook.addBuddy(j);
        adbook.removeBuddy( 0);

    }

}
