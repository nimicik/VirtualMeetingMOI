package io.realm;


public interface virtual_meeting_moi_models_UserRealmProxyInterface {
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public String realmGet$status();
    public void realmSet$status(String value);
    public String realmGet$image();
    public void realmSet$image(String value);
    public String realmGet$wallpaper();
    public void realmSet$wallpaper(String value);
    public long realmGet$timestamp();
    public void realmSet$timestamp(long value);
    public RealmList<virtual.meeting.moi.models.solochat> realmGet$solochat();
    public void realmSet$solochat(RealmList<virtual.meeting.moi.models.solochat> value);
    public RealmList<String> realmGet$blockedUsersIds();
    public void realmSet$blockedUsersIds(RealmList<String> value);
}
