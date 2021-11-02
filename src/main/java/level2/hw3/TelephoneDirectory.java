package level2.hw3;

import java.util.HashMap;

public class TelephoneDirectory {

    private HashMap<String, String> phoneContacts;

    public TelephoneDirectory(HashMap<String, String> phoneContacts) {
        this.phoneContacts = phoneContacts;
    }

    public HashMap<String, String> getPhoneContacts() {
        return phoneContacts;
    }

    public void setPhoneContacts(HashMap<String, String> phoneContacts) {
        this.phoneContacts = phoneContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TelephoneDirectory that = (TelephoneDirectory) o;

        return phoneContacts != null ? phoneContacts.equals(that.phoneContacts) : that.phoneContacts == null;
    }

    @Override
    public int hashCode() {
        return phoneContacts != null ? phoneContacts.hashCode() : 0;
    }


}
