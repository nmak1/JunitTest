import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.nmak1.main.Contact;
import ru.nmak1.main.PhoneContacts;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneContactsTest {
    @Test
    public void testAddGroup() {
        PhoneContacts phoneContacts = new PhoneContacts();
        List<String> groupName= Arrays.asList("работа", "семья");
        phoneContacts.addGroup("работа");
        phoneContacts.addGroup("семья");
        assertEquals(phoneContacts.getGroupMap().keySet(),groupName);



    }



    @Test
    public void testContact() {
        Contact contact = new Contact("Сергей", "777");
        Contact contact1 = Contact.createContact("Сергей", "777");
        assertEquals(contact, contact1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"дом", "работа", "семья"})
    void testPoneContacts(String goup) {
        PhoneContacts phoneContacts = new PhoneContacts();
        Contact contact =
                new Contact("Сергей", "888");
        phoneContacts.addGroup(goup);
        phoneContacts.addContact(goup, contact);
        phoneContacts.printGroupContact(goup);
    }


}
