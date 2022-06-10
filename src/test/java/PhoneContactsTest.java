import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.nmak1.main.Contact;
import ru.nmak1.main.PhoneContacts;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PhoneContactsTest  {
    @Test
    public void TestaddGroup() {
        PhoneContacts phoneContacts = new PhoneContacts();
        String groupName = "дом";
        phoneContacts.addGroup(groupName);
        System.out.println(phoneContacts);

    }
    @Test
    public void TestContact(){
        Contact contact = new Contact("Сергей", "777");
        Contact contact1 = new Contact("Сергей", "888");
        assertNotEquals(contact,contact1);
    }
   @ParameterizedTest
   @ValueSource(strings = { "дом", "работа","семья" })
    void TestPoneContacts(String goup){
       PhoneContacts phoneContacts = new PhoneContacts();
       Contact contact =
               new Contact("Сергей","888");
       phoneContacts.addGroup(goup);
       phoneContacts.addContact(goup,contact);
       phoneContacts.printGroupContact(goup);
   }



}
