package org.example;

public class Attendees {
    private String attendeeName;
    private String attendeeEmail;
    private String attendeeGender;
    private int attendeeAge;

    public Attendees() {
    }

    public Attendees(String attendeeName, String attendeeEmail, String attendeeGender, int attendeeAge) {
        this.attendeeName = attendeeName;
        this.attendeeEmail = attendeeEmail;
        this.attendeeGender = attendeeGender;
        this.attendeeAge = attendeeAge;
    }

    /**
     * 获取
     * @return attendeeName
     */
    public String getAttendeeName() {
        return attendeeName;
    }

    /**
     * 设置
     * @param attendeeName
     */
    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    /**
     * 获取
     * @return attendeeEmail
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * 设置
     * @param attendeeEmail
     */
    public void setAttendeeEmail(String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }

    /**
     * 获取
     * @return attendeeGender
     */
    public String getAttendeeGender() {
        return attendeeGender;
    }

    /**
     * 设置
     * @param attendeeGender
     */
    public void setAttendeeGender(String attendeeGender) {
        this.attendeeGender = attendeeGender;
    }

    /**
     * 获取
     * @return attendeeAge
     */
    public int getAttendeeAge() {
        return attendeeAge;
    }

    /**
     * 设置
     * @param attendeeAge
     */
    public void setAttendeeAge(int attendeeAge) {
        this.attendeeAge = attendeeAge;
    }

    public String toString() {
        return "Attendees{attendeeName = " + attendeeName + ", attendeeEmail = " + attendeeEmail + ", attendeeGender = " + attendeeGender + ", attendeeAge = " + attendeeAge + "}";
    }
}
