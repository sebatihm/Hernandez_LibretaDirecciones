package address;
import data.AddressBook;

public class AddressBookApplication {

    public static void main(String[] args) {
        AddressBook address = new AddressBook();
        Menu menu = new Menu(address);
        menu.displayMenu();

        
    }
   
}
