package models;

import java.time.LocalDateTime;

public class Notification {
    private int notificationId;
    private int userId;
    private String message;
    private LocalDateTime timestamp;
    private boolean read;

    public Notification(int notificationId, int userId, String message) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.read = false;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return read;
    }

    public void markAsRead() {
        this.read = true;
    }
}