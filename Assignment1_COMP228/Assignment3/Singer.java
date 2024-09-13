import java.util.Date;

public class Singer {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private Date dateOfBirth;
    private int albumPublished;
    public Singer() {
        this.singerId = 0;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = new Date();
        this.albumPublished = 0;
    }
    public Singer(int singerId){
        this.singerId = singerId;
    }
    public Singer(int singerId, String singerName){
        this.singerId = singerId;
        this.singerName = singerName;
    }
    public Singer(int singerId, String singerName, String singerAddress){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
    }
    public Singer(int singerId, String singerName, String singerAddress, Date dateOfBirth){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
    }
    public Singer(int singerId, String singerName, String singerAddress, Date dateOfBirth,int albumPublished){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumPublished = albumPublished;
    }
    public int getSingerId() {
        return singerId;
    }
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }
    public String getSingerName() {
        return singerName;
    }
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
    public String getSingerAddress() {
        return singerAddress;
    }
    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getAlbumPublished() {
        return albumPublished;
    }
    public void setAlbumPublished(int albumPublished) {
        this.albumPublished = albumPublished;
    }
    public void displaySingerInfo() {
        System.out.println("Singer ID: " + singerId);
        System.out.println("Singer Name: " + singerName);
        System.out.println("Singer Address: " + singerAddress);
        System.out.println("Singer DOB: " + dateOfBirth );
        System.out.println("Albums Published: " + albumPublished);
    }
}

