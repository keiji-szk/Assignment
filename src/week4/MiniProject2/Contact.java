package week4.MiniProject2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Contact {
    private String name;
    private String mobile;
    private Map<String, String> otherInfo;

    public Contact() {
        this("", "");
    }

    public Contact(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
        otherInfo = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public final Map<String, String> getOtherInfo() {
        return otherInfo;
    }

    public String getOtherInfo(String key) {
        String ret = otherInfo.get(key);
        return ret == null ? "" : ret;
    }

    public void updateOtherInfo(String key, String value) {
        otherInfo.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;

        /* Identify using only name and mobile. */
        return Objects.equals(name, contact.name) && Objects.equals(mobile, contact.mobile);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("<%s> (mobile=%s", getName(), getMobile().isEmpty() ? "None" : getMobile()));

        Map<String, String> otherInfo = getOtherInfo();
        for (Map.Entry<String, String> entry : otherInfo.entrySet()) {
            if (entry.getValue().isEmpty())
                continue;
            builder.append(", ");
            builder.append(entry.getKey() + "=" + entry.getValue());
        }
        builder.append(")");
        return builder.toString();
    }
}
