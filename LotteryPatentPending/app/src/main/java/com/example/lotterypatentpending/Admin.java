package com.example.lotterypatentpending;
import java.util.List;
import java.util.Map;
public class Admin {
    // --- Attributes ---
    private String adminId;
    private String name;
    private String email;
    private String role; // e.g. "admin"
    private String contactInfo;
    private List<String> managedEvents; // optional, to track which events admin has moderated

    // constructor fr admin, email and all that

    public Admin(String adminId, String name, String email, String contactInfo) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.contactInfo = contactInfo;
        this.role = "admin";
    }

    // --- Getters & Setters ---
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getRole() {
        return role;
    }

    //events admin manages, should utilize event class later
    public List<String> getManagedEvents() {
        return managedEvents;
    }

    public void setManagedEvents(List<String> managedEvents) {
        this.managedEvents = managedEvents;
    }

    // user remobals/ management
    public void removeUser(String userId) {
        // TODO: Use FirebaseManager to remove a user profile
        System.out.println("Removing user with ID: " + userId);
    }


    //Event removal
    public void removeEvent(String eventId) {
        // TODO: Use FirebaseManager to delete event data
        System.out.println("Removing event with ID: " + eventId);
    }


    // review message logs
    public void reviewNotificationLogs() {
        // TODO: Retrieve and display logs of notifications for moderation
        System.out.println("Reviewing all notification logs...");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
